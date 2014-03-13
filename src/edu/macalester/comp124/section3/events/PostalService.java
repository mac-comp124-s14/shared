package edu.macalester.comp124.section3.events;

import acm.graphics.GObject;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

import java.awt.event.MouseEvent;

/**
 * @author Shilad Sen
 */
public class PostalService extends GraphicsProgram {

    GObject clickedObj = null;

    public void run() {
        RandomGenerator random = new RandomGenerator();
        for (int i = 0; i < 30; i++) {
            Mailbox mb = new Mailbox(random.nextInt(10, 200));
            add(mb,
                random.nextInt(getWidth()),
                random.nextInt(getHeight()));
        }
        addMouseListeners();
        animate();
    }

    private void animate() {
        while (true) {
            if (clickedObj != null) {
                GObject gobj = clickedObj;
                clickedObj = null;
                disappearObject(gobj);
            }
            pause(100);
        }
    }

    private void disappearObject(GObject obj) {
        // animated the clicked object
        while (obj.getX() < getWidth() && obj.getY() + obj.getHeight() > 0) {
            obj.move(1.0, -1.0);
            pause(3);
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        clickedObj = getElementAt(e.getX(), e.getY());
    }
}

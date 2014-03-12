package edu.macalester.comp124.section3.events;

import acm.graphics.GObject;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

import java.awt.event.MouseEvent;

/**
 * @author Shilad Sen
 */
public class PostalService extends GraphicsProgram {

    public void run() {
        RandomGenerator random = new RandomGenerator();
        for (int i = 0; i < 30; i++) {
            Mailbox mb = new Mailbox(random.nextInt(10, 200));
            add(mb,
                random.nextInt(getWidth()),
                random.nextInt(getHeight()));
        }
        addMouseListeners();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        GObject object = getElementAt(e.getX(), e.getY());
        remove(object);
    }
}

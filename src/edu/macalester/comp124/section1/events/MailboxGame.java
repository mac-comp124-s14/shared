package edu.macalester.comp124.section1.events;

import acm.graphics.GObject;
import acm.graphics.GPoint;
import acm.program.GraphicsProgram;

import java.awt.event.MouseEvent;

/**
 * @author Shilad Sen
 */
public class MailboxGame extends GraphicsProgram {
    private GPoint clickedPoint = null;

    public void run() {
        for (int i = 0; i < 3; i++) {
            Mailbox mailbox = new Mailbox();
            add(mailbox, i * 200, i * 200);
        }

        addMouseListeners();
        animateLoop();
    }

    private void animateLoop() {
        while (true) {
            if (clickedPoint != null) {
                GObject target = getElementAt(clickedPoint);
                if (target != null) {
                    for (int i = 0; i < 10; i++) {
                        target.move(5, -5);
                        pause(100);
                    }
                }
                clickedPoint = null;
            }
            pause(100);
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        clickedPoint = new GPoint(e.getX(), e.getY());
    }
}

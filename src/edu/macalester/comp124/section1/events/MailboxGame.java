package edu.macalester.comp124.section1.events;

import acm.graphics.GObject;
import acm.program.GraphicsProgram;

import java.awt.event.MouseEvent;

/**
 * @author Shilad Sen
 */
public class MailboxGame extends GraphicsProgram {
    public void run() {
        for (int i = 0; i < 3; i++) {
            Mailbox mailbox = new Mailbox();
            add(mailbox, i * 200, i * 200);
        }

        addMouseListeners();

        while (true) {
            pause(100);
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        GObject target = getElementAt(e.getX(), e.getY());
        println("point is " + e.getX() + ", " + e.getY());
        println("screen point is " + e.getXOnScreen() + ", " + e.getYOnScreen());
        println("target is " + target);
        target.setLocation(e.getX(), e.getY());
    }
}

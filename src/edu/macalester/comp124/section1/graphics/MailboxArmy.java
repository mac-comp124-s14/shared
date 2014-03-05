package edu.macalester.comp124.section1.graphics;

import acm.program.GraphicsProgram;

/**
 * @author Shilad Sen
 */
public class MailboxArmy extends GraphicsProgram {
    public void run() {
        for (int i = 0; i < 3; i++) {
            Mailbox mailbox = new Mailbox();
            add(mailbox, i * 200, i * 200);
        }
    }
}

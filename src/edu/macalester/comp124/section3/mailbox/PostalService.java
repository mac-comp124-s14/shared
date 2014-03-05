package edu.macalester.comp124.section3.mailbox;

import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

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
    }
}

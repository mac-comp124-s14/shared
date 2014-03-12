package edu.macalester.comp124.section3.events;

import acm.graphics.GCompound;
import acm.graphics.GRect;

import java.awt.*;

/**
 * @author Shilad Sen
 */
public class Mailbox extends GCompound {
    public Mailbox() {
        this(100);
    }
    public Mailbox(int width) {
        GRect box = new GRect(0, 0.4 * width, width, 0.35 * width);
        GRect flag = new GRect(0.1 * width, 0.5 * width);
        GRect stand = new GRect(0.1 * width, width);
        box.setFilled(true);
        box.setColor(Color.BLUE);
        flag.setFilled(true);
        flag.setColor(Color.RED);
        add(box);
        add(flag, 0.6 * width, 0);
        add(stand, 0.45 * width, 0.75 * width);
    }
}

package edu.macalester.comp124.section1.graphics;

import acm.graphics.GCompound;
import acm.graphics.GRect;

import java.awt.*;

/**
 * @author Shilad Sen
 */
public class Mailbox extends GCompound {
    public Mailbox() {
        GRect box = new GRect(0, 40, 100, 35);
        GRect flag = new GRect(10, 50);
        GRect stand = new GRect(10, 100);
        box.setFilled(true);
        box.setColor(Color.BLUE);
        flag.setFilled(true);
        flag.setColor(Color.RED);
        add(box);
        add(flag, 60, 0);
        add(stand, 45, 75);
    }
}

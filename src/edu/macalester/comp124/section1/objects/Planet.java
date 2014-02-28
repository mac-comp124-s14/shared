package edu.macalester.comp124.section1.objects;

import acm.graphics.GOval;

import java.awt.*;

/**
 * @author Shilad Sen
 */
public class Planet extends Shape {
    public Planet(Color color, int radius) {
        GOval oval = new GOval(radius*2, radius*2);
        oval.setFilled(true);
        oval.setFillColor(color);
        add(oval);
    }
}

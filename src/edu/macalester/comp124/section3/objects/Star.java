package edu.macalester.comp124.section3.objects;

import acm.graphics.GRect;

import java.awt.*;

/**
 * @author Shilad Sen
 */
public class Star extends CelestialBody {

    public static final int DEFAULT_RADIUS = 25;

    public Star() {
        this(Color.WHITE, DEFAULT_RADIUS);
    }
    public Star(int radius) {
        this(Color.WHITE, radius);
    }
    public Star(Color color, int radius) {
        GRect rect = new GRect(radius*2, radius*2);
        rect.setFillColor(color);
        rect.setFilled(true);
        add(rect);
    }

    @Override
    public void makeHole(Color color) {
//        double radius = getWidth() / 4;
//        GRect oval = new GRect(radius*2, radius*2);
//        oval.setFilled(true);
//        oval.setFillColor(color);
//        add(oval, radius, radius);
        Color opaque = new Color(color.getRed(), color.getGreen(), color.getBlue());
        super.makeHole(opaque);
    }
}

package edu.macalester.comp124.section3.objects;

import acm.graphics.GCompound;
import acm.graphics.GOval;

import java.awt.*;

/**
 * @author Shilad Sen
 */
public class CelestialBody extends GCompound {
//    public CelestialBody() {}

    public void makeHole() {
        makeHole(Color.BLACK);
    }

    public void makeHole(Color color) {
        double radius = getWidth() / 4;
        GOval oval = new GOval(radius*2, radius*2);
        oval.setFilled(true);
        oval.setFillColor(color);
        add(oval, radius, radius);
    }
}

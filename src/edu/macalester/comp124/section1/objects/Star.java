package edu.macalester.comp124.section1.objects;

import acm.graphics.GRect;

import java.awt.*;

/**
 * @author Shilad Sen
 */
public class Star extends edu.macalester.comp124.section1.objects.Shape {
    public Star() {
        this(25);
    }

    public Star(Color color) {
        this(color, 25);
    }

    public Star(int radius) {
        this(Color.WHITE, radius);
    }

    public Star(Color color, int radius) {
        GRect square = new GRect(radius * 2, radius * 2);
        square.setFilled(true);
        square.setFillColor(color);
        add(square);
    }

    @Override
    public void drawHole(Color color, double radius) {
        Color opaque = new Color(color.getRed(), color.getBlue(), color.getGreen());
        super.drawHole(opaque, radius);
    }
}

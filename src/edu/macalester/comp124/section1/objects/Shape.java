package edu.macalester.comp124.section1.objects;

import acm.graphics.GCompound;
import acm.graphics.GOval;

import java.awt.*;

/**
 * @author Shilad Sen
 */
public class Shape extends GCompound {
//    public Shape() {}

    public void drawHole() {
        this.drawHole(Color.BLACK);
    }

    public void drawHole(Color color) {
        double height = getHeight();
        double width = getWidth();
        double radius = Math.min(height, width) / 3;
        this.drawHole(color, radius);
    }


    public void drawHole(Color color, double radius) {
        double height = getHeight();
        double width = getWidth();

        GOval hole = new GOval(radius*2, radius*2);
        hole.setFillColor(color);
        hole.setFilled(true);
        hole.setColor(Color.GRAY);
        add(hole, width/2 - radius, height/2 - radius);
    }
}

package edu.macalester.comp124.section3.objects;

import acm.graphics.GRect;
import acm.program.GraphicsProgram;

import java.awt.*;

/**
 * @author Shilad Sen
 */
public class SkyDrawing extends GraphicsProgram {
    @Override
    public void run() {
        GRect night = new GRect(getWidth(), getHeight() / 2);
        night.setFillColor(Color.BLACK);
        night.setFilled(true);
        add(night);

        EnhancedRandomGenerator generator = new EnhancedRandomGenerator();
        for (int i = 0; i < 100; i++) {
            int x = generator.nextInt(0, getWidth());
            int y = generator.nextInt(0, getHeight() / 2);
            int r = generator.nextInt(5, 20);
            Color color = generator.nextAlphaColor();
            Star star = new Star(color, r);
            if (generator.nextBoolean()) {
                star.makeHole(generator.nextAlphaColor());
            }
            add(star, x, y);
        }

        Planet sun = new Planet(Color.YELLOW, 50);
        add(sun);
        Planet moon = new Planet(new Color(83, 117, 154), 30);
        moon.makeHole(Color.WHITE);
        add(moon, 500, 150);
        GRect grass = new GRect(getWidth(), getHeight() / 2);
        grass.setFillColor(Color.GREEN);
        grass.setFilled(true);
        add(grass, 0, getHeight() / 2);

    }
}

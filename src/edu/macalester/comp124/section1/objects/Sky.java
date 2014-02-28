package edu.macalester.comp124.section1.objects;

import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

import java.awt.*;

/**
 * @author Shilad Sen
 */
public class Sky extends GraphicsProgram {
    public void run() {
        RandomGenerator rand = new RandomGenerator();
        for (int i = 0; i < 100; i++) {
            Color color = getRandomColor();
            Star star = new Star(color, rand.nextInt(5, 20));
            add(star, rand.nextInt(0, 1000), rand.nextInt(0, 300));

            if (rand.nextBoolean()) {
                star.drawHole(getRandomColor());
            }
        }

        Planet sun = new Planet(Color.YELLOW, 40);
        Planet moon = new Planet(new Color(82, 134, 187), 10);
        add(sun, 600, 100);
        add(moon, 100, 200);
    }

    private Color getRandomColor() {
        RandomGenerator rand = new RandomGenerator();
        return new Color(
                                rand.nextInt(255),
                                rand.nextInt(255),
                                rand.nextInt(255),
                                rand.nextInt(255)
                        );
    }
}

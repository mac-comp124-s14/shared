package edu.macalester.comp124.section3.objects;

import acm.util.RandomGenerator;

import java.awt.*;

/**
 * @author Shilad Sen
 */
public class EnhancedRandomGenerator extends RandomGenerator {
    public Color nextAlphaColor() {
        int r = nextInt(0, 255);
        int g = nextInt(0, 255);
        int b = nextInt(0, 255);
        int a = nextInt(50, 150);
        return new Color(r, g, b, a);
    }
}

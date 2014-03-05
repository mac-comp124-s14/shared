package edu.macalester.comp124.section3.arrays;

import edu.macalester.comp124.section1.arrays.*;
import junit.framework.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Shilad Sen
 */
public class FancyArrayTest {

    @Test
    public void testEmpty() {
        FancyArray array = new FancyArray();
        assertEquals(0, array.getLength());
    }

    @Test
    public void testAddOnce() {
        FancyArray array = new FancyArray();
        array.add("Dog");
        assertEquals(1, array.getLength());
        assertEquals("Dog", array.get(0));
    }

    @Test
    public void testAddTwice() {
        FancyArray array = new FancyArray();
        array.add("Dog");
        array.add("Cat");
        assertEquals(2, array.getLength());
        assertEquals("Cat", array.get(1));
        assertEquals("Dog", array.get(0));
    }

    @Test
    public void testSet() {
        FancyArray array = new FancyArray();

        array.add("Dog");
        array.add("Cat");
        assertEquals(2, array.getLength());
        assertEquals("Cat", array.get(1));
        assertEquals("Dog", array.get(0));

        array.set(0, "Mouse");
        assertEquals(2, array.getLength());
        assertEquals("Mouse", array.get(0));

        array.set(1, "Rat");
        assertEquals(2, array.getLength());
        assertEquals("Rat", array.get(1));
    }
}

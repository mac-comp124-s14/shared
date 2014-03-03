package edu.macalester.comp124.section1.arrays;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Shilad Sen
 */
public class FancyArrayTest {

    @Test
    public void testOneAdd() {
        FancyArray array = new FancyArray();
        array.add("Dog");
        assertEquals(1, array.getLength());
        assertEquals("Dog", array.get(0));
    }
}

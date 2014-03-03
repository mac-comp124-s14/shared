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
}

package edu.macalester.comp124.section3.binarytrees;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Shilad Sen
 */
public class TestTree {


    /**
     */
    @Test
    public void testOneInsert() {
        Tree tree = new Tree();
        assertNull(tree.getRoot());
        tree.insert("Now");
        assertNotNull(tree.getRoot());
        assertEquals("Now", tree.getRoot().getValue());
    }

    @Test
    public void testCount() {
        Tree tree = new Tree();
        for (String word : "now is the time for all good men to come to the aid of their country".split(" ")) {
            tree.insert(word);
        }
        int n = tree.count();
        assertEquals(14, n);

        tree.inorder();
    }

    /**
     */
    @Test
    public void testAllInserts() {
        Tree tree = new Tree();
        assertNull(tree.getRoot());
        for (String word : "now is the time for all good men to come to the aid of their country".split(" ")) {
            tree.insert(word);
        }
        assertEquals("now", tree.getRoot().getValue());
        assertEquals("is", tree.getRoot().getLeft().getValue());
        assertEquals("the", tree.getRoot().getRight().getValue());
    }

}

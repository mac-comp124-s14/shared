package edu.macalester.comp124.section3.binarytrees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Shilad Sen
 */
public class PrefixTree {
    private PrefixNode root = null;

    public PrefixTree(String expression) {
        List<String> tokenQueue = new LinkedList<String>();
        for (String token : expression.split(" ")) {
            tokenQueue.add(token);
        }
        root = parse(tokenQueue);
    }

    private PrefixNode parse(List<String> tokenQueue) {
        return null;
    }


    public static void main(String args[]) {
        PrefixTree tree = new PrefixTree("+ * 2 A 3");
    }
}

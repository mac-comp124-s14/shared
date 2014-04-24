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
        String token = tokenQueue.remove(0);
        PrefixNode node = new PrefixNode(token);
        if (node.isNumber()) {
            return node;
        } else {
            node.setLeft(parse(tokenQueue));
            node.setRight(parse(tokenQueue));
            return node;
        }
    }

    public int evaluate() {
        return root.evaluate();
    }


    public static void main(String args[]) {
        PrefixTree tree = new PrefixTree("+ * 8 + 1 1 - 12 / 24 2");
        System.out.println("value of expression is " + tree.evaluate());
    }
}

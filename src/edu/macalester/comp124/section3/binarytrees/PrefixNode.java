package edu.macalester.comp124.section3.binarytrees;

/**
 * @author Shilad Sen
 */
public class PrefixNode {
    private PrefixNode left;
    private PrefixNode right;
    private String symbol;

    public PrefixNode(String symbol) {
        this.symbol = symbol;
    }

    public void setLeft(PrefixNode left) {
        this.left = left;
    }

    public void setRight(PrefixNode right) {
        this.right = right;
    }

    public PrefixNode getLeft() {
        return left;
    }

    public PrefixNode getRight() {
        return right;
    }

    public String getSymbol() {
        return symbol;
    }

    public boolean isNumber() {
        return  !"*+-/".contains(symbol);
    }

    public int evaluate() {
        return 0;
    }
}

























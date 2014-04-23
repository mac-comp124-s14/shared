package edu.macalester.comp124.section1.binarytrees;

/**
 * @author Shilad Sen
 */
public class PrefixNode {
    private PrefixNode left;
    private PrefixNode right;
    private String value;

    public PrefixNode(String value) {
        this.value = value;
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

    public String getValue() {
        return value;
    }
}

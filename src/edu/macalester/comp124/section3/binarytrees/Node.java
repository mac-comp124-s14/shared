package edu.macalester.comp124.section3.binarytrees;

/**
 * @author Shilad Sen
 */
public class Node {
    private Node left;
    private Node right;
    private String value;

    public Node(String value) {
        this.value = value;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public String getValue() {
        return value;
    }


    @Override
    public String toString() {
        return "Node{" +
                "value='" + value + '\'' +
                '}';
    }
}

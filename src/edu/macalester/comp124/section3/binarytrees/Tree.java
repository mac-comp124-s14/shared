package edu.macalester.comp124.section3.binarytrees;

/**
 * @author Shilad Sen
 */
public class Tree {
    private Node root = null;

    public Tree() {}

    public void  insert(String value) {
        Node newNode = new Node(value);
        if (root == null) {
            root = newNode;
            return;
        }
        Node node = root;
        while (true) {
            if (value.compareTo(node.getValue()) < 0) {
                if (node.getLeft() == null) {
                    node.setLeft(newNode);
                    break;
                }
                node = node.getLeft();
            } else if (value.compareTo(node.getValue()) > 0) {
                if (node.getRight() == null) {
                    node.setRight(newNode);
                    break;
                }
                node = node.getRight();
            } else {
                break;
            }
        }
    }

    public Node getRoot() {
        return root;
    }
}

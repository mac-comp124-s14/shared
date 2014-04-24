package edu.macalester.comp124.section3.binarytrees;

/**
 * @author Shilad Sen
 */
public class Tree {
    private Node root = null;

    public Tree() {}

    public boolean contains(String value) {
        Node current = root;
        while (current != null) {
            if (value.compareTo(current.getValue()) < 0) {
                current = current.getLeft();
            } else if (value.compareTo(current.getValue()) > 0) {
                current = current.getRight();
            } else {
                return true;
            }
        }
        return false;
    }

    public void  insert(String value) {
        Node newNode = new Node(value);
        if (root == null) {
            root = newNode;
            return;
        }
        Node current = root;
        while (true) {
            if (value.compareTo(current.getValue()) < 0) {
                if (current.getLeft() == null) {
                    current.setLeft(newNode);
                    break;
                }
                current = current.getLeft();
            } else if (value.compareTo(current.getValue()) > 0) {
                if (current.getRight() == null) {
                    current.setRight(newNode);
                    break;
                }
                current = current.getRight();
            } else {
                break;
            }
        }
    }

    public void inorder() {
        inorder(root);
    }

    private void inorder(Node node) {
        if (node == null) {
            return;
        }
        inorder(node.getLeft());
        System.out.println(node.getValue());
        inorder(node.getRight());
    }

    public int count() {
        return count(root);
    }
    private int count(Node node) {
        if (node == null) {
            return 0;
        }
        int nl = count(node.getLeft());
        int nr = count(node.getRight());
        return nl + nr + 1;
    }

    public Node getRoot() {
        return root;
    }
}





























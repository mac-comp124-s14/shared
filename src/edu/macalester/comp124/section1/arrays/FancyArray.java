package edu.macalester.comp124.section1.arrays;

/**
 * @author Shilad Sen
 */
public class FancyArray {
    private static final int MAX_CAPACITY = 1000;

    private String[] elements = new String[MAX_CAPACITY];
    private int length = 0;

    public FancyArray() {}

    public void add(String s) {
        elements[length] = s;
        length++;
//        for (int i = 0; i < elements.length; i++) {
//            if (elements[i] == null) {
//                elements[i] = s;
//                break;
//            }
//        }
    }

    public int getLength() {
        return length;
//        for (int i = 0; i < elements.length; i++) {
//            if (elements[i] == null) {
//                return i;
//            }
//        }
//        return elements.length;
    }

    public String get(int i) {
        return elements[i];
    }

    public void set(int i, String s) {
        elements[i] = s;
    }
}

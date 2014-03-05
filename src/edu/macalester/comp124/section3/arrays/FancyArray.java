package edu.macalester.comp124.section3.arrays;

/**
 * @author Shilad Sen
 */
public class FancyArray {
    private String[] elements = new String[Integer.MAX_VALUE];
    private int used = 0;

    public FancyArray() {
    }

    public void add(String s) {
        elements[used++] = s;
//        elements[getLength()] = s;
    }

    public String get(int i) {
        return elements[i];
    }

    public int getLength() {
        return used;
//        for (int i = 0; i < elements.length; i++) {
//            if (elements[i] == null) {
//                return i;
//            }
//        }
//        return elements.length;
    }

    public void set(int i, String s) {
        elements[i] = s;
    }
}

package edu.macalester.comp124.section1.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Shilad Sen
 */
public class SortingLists {
    public static void main(String args[]) {
        List<String> dogs = new ArrayList<String>();
        for (String arg : args) {
            dogs.add(arg);
        }
        Collections.sort(dogs);
        System.out.println(dogs);
    }
}

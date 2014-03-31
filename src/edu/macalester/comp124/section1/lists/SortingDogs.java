package edu.macalester.comp124.section1.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Shilad Sen
 */
public class SortingDogs {
    public static void main(String args[]) {
        List<Dog> dogs = new ArrayList<Dog>();
        for (int i = 0; i < args.length; i += 2) {
            String name = args[i];
            int weight = Integer.valueOf(args[i+1]);
            Dog doggy = new Dog(name, weight);
            dogs.add(doggy);
        }
        Collections.sort(dogs);
        System.out.println(dogs);
    }
}

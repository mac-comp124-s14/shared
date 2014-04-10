package edu.macalester.comp124.section1.maps;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Shilad Sen
 */
public class SharkExample {
    public static void main(String args[]) {
        Map<String, Integer> sharkFriendliness = new HashMap<String, Integer>();

        Integer f = 10;
        sharkFriendliness.put("whale shark", f);
        sharkFriendliness.put("great white shark", -10);
        sharkFriendliness.put("nurse shark", 2);
        sharkFriendliness.put("whale shark", 9);
        System.out.println(sharkFriendliness);
        System.out.println(sharkFriendliness.get("nurse shark"));
        System.out.println(sharkFriendliness.get("NURSE shark"));

        int i = 0;
        for (String shark : sharkFriendliness.keySet()) {
            int friendliness = sharkFriendliness.get(shark);
            System.out.println("in iteration " + i + " shark is " + shark + " with hashcode " + shark.hashCode() + " - " + (shark.hashCode() % 7));
            System.out.println("in iteration " + i + " shark is " + shark + " with friendliness " + friendliness);
            i++;
        }
    }
}

package edu.macalester.comp124.section1.maps;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Shilad Sen
 */
public class BasicMap {
    public static void main(String args[]) {
        Map<String, Integer> statePopulation = new HashMap<String, Integer>();
        statePopulation.put("WY", 189);
        statePopulation.put("HI", 230);
        statePopulation.put("MN", 5000000);
        statePopulation.put("HI", 237);
        System.out.println(statePopulation);

        for (String state : statePopulation.keySet()) {
            int population = statePopulation.get(state);
            statePopulation.put(state, population+1);
            System.out.println("Population of " + state + " " + statePopulation.get(state));
        }

        if (!statePopulation.containsKey("CA")) {
            statePopulation.put("CA", 5000002);
        }

        System.out.println(statePopulation);
    }
}

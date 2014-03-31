package edu.macalester.comp124.section3.lists;

import acm.program.ConsoleProgram;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Shilad Sen
 */
public class BasicExample extends ConsoleProgram {
    public void run() {
        long before = System.currentTimeMillis();
        List<String> names = new ArrayList<String>();
        names.add("Connor");
        names.add("Ross");
        names.add(1, "Kyle");
        for (String name : names) {
            println("name is " + name);
        }
        long after = System.currentTimeMillis();
        println("elapsed is " + (after - before) / 1000.0);
    }
}

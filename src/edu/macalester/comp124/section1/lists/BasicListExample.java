package edu.macalester.comp124.section1.lists;

import acm.program.ConsoleProgram;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Shilad Sen
 */
public class BasicListExample extends ConsoleProgram {
    @Override
    public void run() {
        long before = System.currentTimeMillis();
        List<String> words = new ArrayList<String>();
        words.add("Zapier");
        words.add("Komonify");
        words.add(1, "Klout");
        words.add("Gnip");
        println(words);
        long after = System.currentTimeMillis();
        println("elapsed is " + (after-before) / 1000.0);
    }
}

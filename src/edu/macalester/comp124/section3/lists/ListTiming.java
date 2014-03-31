package edu.macalester.comp124.section3.lists;

import acm.program.ConsoleProgram;

import java.lang.management.ThreadMXBean;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Shilad Sen
 */
public class ListTiming extends ConsoleProgram {
    @Override
    public void run() {
        for (int n = 10000;; n *= 2) {
            timeAdds(n);
        }
    }

    public void timeAdds(int n) {
        List<String> words = new ArrayList<String>();
        long before = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            words.add("Coffee");
        }
        long after = System.currentTimeMillis();
        println("results for n=" + n);
        println("\telapsed is " + (after-before) / 1000.0);
        println("\tavg is " + (after-before) / 1000.0 / n);
    }
}

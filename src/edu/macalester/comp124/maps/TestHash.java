package edu.macalester.comp124.maps;

import com.sun.org.apache.bcel.internal.generic.ARRAYLENGTH;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * Before running this class, you must download
 * http://knuth.luther.edu/~bmiller/wordlist.txt in the "root directory" of your project.
 * @author Shilad Sen
 */
public class TestHash {
    private static final int ARRAY_LENGTH = 80000;

    public static void main(String args[]) throws IOException {
        Map<Integer, Integer> codes = new HashMap<Integer, Integer>();
        BufferedReader reader = new BufferedReader(new FileReader("wordlist.txt"));

        int words = 0;
        while (true) {
            String line = reader.readLine();
            if (line == null) {
                break;
            }
            int hash = myHashCode(line.trim());
            hash = hash % ARRAY_LENGTH;
            if (!codes.containsKey(hash)) {
                codes.put(hash, 0);
            }
            codes.put(hash, codes.get(hash) + 1);
            words++;
        }

        System.out.println("collided on " + 100.0 * (words - codes.size()) / words + "%");
    }

    private static int myHashCode(String s) {
        int h = 17;
        for (char c : s.toCharArray()) {
            h = h * 37 + c;
        }
        return h;
    }
}

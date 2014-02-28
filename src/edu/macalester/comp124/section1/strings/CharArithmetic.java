package edu.macalester.comp124.section1.strings;

import acm.program.ConsoleProgram;

/**
 * @author Shilad Sen
 */
public class CharArithmetic extends ConsoleProgram {
    public void run() {
        char c = '\\';
        if ('a' <= c && c <= 'z') {
            char shift = 'a' - 'A';
            c = (char) (c - shift);
        }

        println("char is " + c);
    }
}

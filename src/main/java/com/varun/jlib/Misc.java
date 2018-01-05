package com.varun.jlib;

/**
 * <h2>Useful functions</h2>
 * A miscellaneous set of useful functions.
 * @author Varun Ramani: 20vr0937@wwprsd.org
 */
public class Misc {
    /**
     * Print a line of the same size as a provided string.
     * @param toprint The string that the programmer must provide.
     * @param chartoprint The character that the line is built with. Ex: providing '=' will make a line of equal signs.
     */
    public static void printdash(String toprint, char chartoprint) {
        String[] toprintarr = toprint.split("");
        for (int i=0; i < toprintarr.length; i++) {
            System.out.print(chartoprint);
        }
    }
    
    /**
     * Print a line of a given size.
     * @param size The size of the line.
     * @param chartoprint The character that the line is built with. Ex: providing '=' will make a line of equal signs.
     */
    public static void printdash(int size, char chartoprint) {
        for (int i=0; i < size; i++) {
            System.out.print(chartoprint);
        }
    }
    
    /**
     * Generate a header
     * @param toprint The title.
     * @param chartoprint The character that the line is built with. Ex: providing '=' will make a line of equal signs.
     */
    public static void gentitle(String toprint, char chartoprint) {
        System.out.println(toprint);
        printdash(toprint, chartoprint);
        System.out.print("\n");
    }
}
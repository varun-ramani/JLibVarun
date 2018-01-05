package com.varun.jlib;
/**
 * <h2>Easily Present Output!</h2>
 * Present the user with output without being forced to use absolutely GIANT statments.
 * @author: Varun Ramani: 20vr0937@wwprsd.org
 */
public class Output {
    /**
     * A wrapper for System.out.println()
     * @param toprint Desired output
     */
    public static void println(Object toprint) {
        System.out.println(toprint);
    }
    
    /**
     * A wrapper for System.out.print()
     * @param toprint Desired output
     */
    public static void print(Object toprint) {
        System.out.print(toprint);
    }
    
    /**
     * A wrapper for System.out.printf()
     * @param input String normally passed to printf
     * @param args Variables to interpolate
     */
    public static void printf(String input, Object... args) {
        System.out.printf(input, args);
    }
}
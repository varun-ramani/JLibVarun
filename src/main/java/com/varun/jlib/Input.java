package com.varun.jlib;
import java.util.*;
/**
 * <h2>Easily Get Input!</h2>
 * Provides useful functionality for getting input from the user.
 * @author Varun Ramani: 20vr0937@wwprsd.org
 */
public class Input {
    /**
     * Utilized to get input. 
     * @param prompt Prompt user for input. For instance: "Enter input:"
     * @param a Pass a value of desired return type.
     * @return String
     */
    public static String getInput(String prompt, String a) {
        System.out.print(prompt);
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }
    
    /**
     * Utilized to get input. 
     * @param prompt Prompt user for input. For instance: "Enter input:"
     * @param a Pass a value of desired return type.
     * @return double
     */
    public static double getInput(String prompt, double a) {
        System.out.print(prompt);
        Scanner in = new Scanner(System.in);
        return in.nextDouble();
    }
    
    /**
     * Utilized to get input. 
     * @param prompt Prompt user for input. For instance: "Enter input:"
     * @param a Pass a value of desired return type.
     * @return long
     */
    public static long getInput(String prompt, long a) {
        System.out.print(prompt);
        Scanner in = new Scanner(System.in);
        return in.nextLong();
    }
    
    /**
     * Utilized to get input. 
     * @param prompt Prompt user for input. For instance: "Enter input:"
     * @param a Pass a value of desired return type.
     * @return int
     */
    public static int getInput(String prompt, int a) {
        System.out.print(prompt);
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }
}
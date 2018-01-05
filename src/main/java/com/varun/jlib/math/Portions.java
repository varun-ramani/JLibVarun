package com.varun.jlib.math;
/**
 * <h2>Easily calculate portions of quantities</h2>
 * Provides useful functions for calculating portions of quanities, fairly self explanatory.
 * @author Varun Ramani: 20vr0937@wwprsd.org
 */
public class Portions {
    /**
     * Utilized when the programmer wishes to calculate a certain percentage of a quantity
     * For example, utilized when the programmer wants to know "what is x percentage of y?"
     * @param number The number that the programmer wishes to calculate a percentage of.
     * @param percentage The percentage to utilize in the calculation
     * @return double
     */
    public static double percentage(double number, double percentage) {
        return number * (percentage / 100);
    }
}
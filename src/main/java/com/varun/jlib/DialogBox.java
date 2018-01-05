package com.varun.jlib;

import javax.swing.*;

/**
 * <h2>Easily spawn dialog boxes.</h2>
 * Avoid having to import the DialogBox libraries, write complex statements to spawn even the simplest of dialogs, and memorize random numbers that correspond to specific types of dialogs.
 *
 * @author Varun Ramani: 20vr0937@wwprsd.org
 */
public class DialogBox {
    /**
     * Get Dialog Box input from the user
     *
     * @param prompt Question to prompt user with
     * @param title Title of Dialog Box
     * @param type Pass a value of desired return type.
     * @return double
     */
    public static double input(String prompt, String title, double type) {
        return Double.parseDouble(JOptionPane.showInputDialog(prompt, title));
    }
    
     /**
     * Get Dialog Box input from the user
     *
     * @param prompt Question to prompt user with
     * @param title Title of Dialog Box
     * @param type Pass a value of desired return type.
     * @return String
     */
    public static String input(String prompt, String title, String type) {
        return JOptionPane.showInputDialog(prompt, title);
    }
    
     /**
     * Get Dialog Box input from the user
     *
     * @param prompt Question to prompt user with
     * @param title Title of Dialog Box
     * @param type Pass a value of desired return type.
     * @return int
     */
    public static int input(String prompt, String title, int type) {
        return Integer.parseInt(JOptionPane.showInputDialog(prompt, title));
    }
    
    /**
     * Get Dialog Box input from the user
     *
     * @param prompt      Question to prompt the user with
     * @param title       Title of Dialog Box
     * @param typeofboxin The type of Dialog Box wanted: "warning", "error", "question", or "information"
     * @param type Pass a value of desired return type
     * @return String
     */
    public static String input(String prompt, String title, String typeofboxin, String type) {
        int typeofbox = 10000;
        switch (typeofboxin) {
            case "warning":
                typeofbox = JOptionPane.WARNING_MESSAGE;
                break;
            case "error":
                typeofbox = JOptionPane.ERROR_MESSAGE;
                break;
            case "information":
                typeofbox = JOptionPane.INFORMATION_MESSAGE;
                break;
            case "question":
                typeofbox = 3;
                break;
            default:
                typeofbox = JOptionPane.PLAIN_MESSAGE;

        }
        return JOptionPane.showInputDialog(null, prompt, title, typeofbox);
    }
    
    /**
     * Get Dialog Box input from the user
     *
     * @param prompt      Question to prompt the user with
     * @param title       Title of Dialog Box
     * @param typeofboxin The type of Dialog Box wanted: "warning", "error", "question", or "information"
     * @param type Pass a value of desired return type
     * @return double
     */
    public static double input(String prompt, String title, String typeofboxin, double type) {
        int typeofbox = 10000;
        switch (typeofboxin) {
            case "warning":
                typeofbox = JOptionPane.WARNING_MESSAGE;
                break;
            case "error":
                typeofbox = JOptionPane.ERROR_MESSAGE;
                break;
            case "information":
                typeofbox = JOptionPane.INFORMATION_MESSAGE;
                break;
            case "question":
                typeofbox = 3;
                break;
            default:
                typeofbox = JOptionPane.PLAIN_MESSAGE;

        }
        return Double.parseDouble(JOptionPane.showInputDialog(null, prompt, title, typeofbox));
    }
    
    /**
     * Get Dialog Box input from the user
     *
     * @param prompt      Question to prompt the user with
     * @param title       Title of Dialog Box
     * @param typeofboxin The type of Dialog Box wanted: "warning", "error", "question", or "information"
     * @param type Pass a value of desired return type
     * @return int
     */
    public static int input(String prompt, String title, String typeofboxin, int type) {
        int typeofbox = 10000;
        switch (typeofboxin) {
            case "warning":
                typeofbox = JOptionPane.WARNING_MESSAGE;
                break;
            case "error":
                typeofbox = JOptionPane.ERROR_MESSAGE;
                break;
            case "information":
                typeofbox = JOptionPane.INFORMATION_MESSAGE;
                break;
            case "question":
                typeofbox = 3;
                break;
            default:
                typeofbox = JOptionPane.PLAIN_MESSAGE;

        }
        return Integer.parseInt(JOptionPane.showInputDialog(null, prompt, title, typeofbox));
    }

    /**
     * Present Dialog Box output to the user
     *
     * @param message Message to present to the user
     */
    public static void messagebox(String message) {
        JOptionPane.showMessageDialog(null, message);
    }

    /**
     * Present Dialog Box output to the user
     *
     * @param message     Message to present to the user
     * @param title       Title of the Dialog Box
     * @param typeofboxin Type of Dialog Box: "warning", "information", "question", or "error"
     */
    public static void messagebox(String message, String title, String typeofboxin) {
        /*
        * Message syntax:
        * null, message, title, type of box
        */
        int typeofbox = 0;
        switch (typeofboxin) {
            case "warning":
                typeofbox = JOptionPane.WARNING_MESSAGE;
                break;
            case "error":
                typeofbox = JOptionPane.ERROR_MESSAGE;
                break;
            case "information":
                typeofbox = JOptionPane.INFORMATION_MESSAGE;
                break;
            case "question":
                typeofbox = 3;
                break;

        }
        JOptionPane.showMessageDialog(null, message, title, typeofbox);
    }
}
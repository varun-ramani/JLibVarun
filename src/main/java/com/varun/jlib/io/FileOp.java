package com.varun.jlib.io;

import java.nio.file.Files;
import java.util.*;
import java.io.*;
/**
 * <h2>Various operations on files</h2>
 * A fairly self explanatory library - provides functions for operations on files.
 * @author Varun Ramani: 20vr0937@wwprsd.org
 */
public class FileOp {
    /**
     * Read a specified file to a byte array.
     * @param path Path to file
     * @return byte array
     * @throws IOException
     */
    public static byte[] readBytes(String path) throws IOException {
        return Files.readAllBytes(new File(path).toPath());
    }

    /**
     * Read a specified file to a String array.
     * @param path Path to file
     * @return String array
     * @throws FileNotFoundException
     */
    public static String[] readLines(String path) throws FileNotFoundException {
        try {
            Scanner scan = new Scanner(new File(path));
            List<String> initstring = new ArrayList<String>();
            while (scan.hasNextLine()) {
                initstring.add(scan.nextLine());
            }
            return initstring.toArray(new String[]{});
        } catch (FileNotFoundException e) {
                throw new FileNotFoundException("File " + new File(path).getAbsoluteFile() + " was not found.");
        }
    }

    /**
     * Write a byte array to file
     * @param towrite The byte array to write
     * @param path The path of the file to write to
     * @throws IOException
     */
    public static void writeBytes(byte[] towrite, String path) throws IOException {
        FileOutputStream stream = new FileOutputStream(path);
        try {
            stream.write(towrite);
        } finally {
            stream.close();
        }
    }



}

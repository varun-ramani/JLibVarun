package com.varun.jlib.math;

import java.io.File;
import java.util.Hashtable;
import java.util.Scanner;
/**
 * <h2>Easily perform unit conversions!</h2>
 * Provides useful functions for converting various units into each other.
 * @author Varun Ramani: 20vr0937@wwprsd.org
 * 
*/
public class Conversion {
    /**
     * Utilized when the programmer wishes to convert between various units of weight.<br>
     * Supports: <br>Metric:<br>Exagram, Petagram, Teragram, Gigagram, Megagram, Kilogram, Hectogram, Decagram, Gram, Decigram, Centigram, Milligram, Microgram, Nanogram, Picogram, Femtogram, Attogram<br>Imperial:<br>Grain, Ounce, Pound, Stone, Ton
     * @param toconvert A comma seperated string that explains the conversion. For instance: "kilometer,inch"
     * @param first An initial value to begin from. If the first element in toconvert was kilometer, then first would be the distance in kilometers. For instance: 12.1
     * @return double
     */
    public static double weight(double first, String toconvert) {
        //Create Hashtable to store rates
        Hashtable<String, Double> convrates = new Hashtable<String, Double>();

        //Create an empty variable for Scanner
        Scanner input = new Scanner(System.in);

        //Create object to read from the Distance Conversion data file
        try {
            File file = new File("com/varunlibs/VarunMath/DataFiles/WeightConv.txt");
            input = new Scanner(file);
        } catch (Exception e) {

        }

        //Read file into the convrates Hashtable
        while (input.hasNextLine()) {
            String line = input.nextLine();
            String[] splitline = line.split("=");
            convrates.put(splitline[0], Double.parseDouble(splitline[1]));
        }

        //Intialize variables
        double towork1 = first;
        double converted = 0;
        String[] toconvertarr = toconvert.split(",");
        double grams = 0;

        //Convert the initial amount to the universal distance - Meters
        if (convrates.containsKey(toconvertarr[0].toLowerCase().replaceAll("\\s+", ""))) {
            grams = convrates.get(toconvertarr[0].toLowerCase().replaceAll("\\s+", "")) * towork1;
        }

        //Perform final conversion
        if (convrates.containsKey(toconvertarr[1].toLowerCase().replaceAll("\\s+", ""))) {
            converted = (1/ convrates.get(toconvertarr[1].toLowerCase().replaceAll("\\s+", ""))) * grams;
        }

        //return final value of final conversion
        return converted;
    }

    /**
    * Utilized when the programmer wishes to convert between various units of distance.<br>
    * Supports: <br>Metric:<br>Exameter, Petameter, Terameter, Gigameter, Megameter, Kilometer, Hectometer, Decameter, Meter, Decimeter, Centimeter, Millimeter, Micrometer, Nanometer, Picometer, Femtometer, Attometer<br>Imperial:<br>Thou, Inch, Foot, Yard, Chain, Furlong, Mile, League, Fathom, Cable, Nautical Mile, Link, Rod
    * @param toconvert A comma seperated string that explains the conversion. For instance: "kilometer,inch"
    * @param first An initial value to begin from. If the first element in toconvert was kilometer, then first would be the distance in kilometers. For instance: 12.1
    * @return double
   */
   public static double distance(double first, String toconvert) {
       //Create Hashtable to store rates
       Hashtable<String, Double> convrates = new Hashtable<String, Double>();
       
       //Create an empty variable for Scanner
       Scanner input = new Scanner(System.in);
       
       //Create object to read from the Distance Conversion data file
       try {
           File file = new File("com/varunlibs/VarunMath/DataFiles/DistConv.txt");
           input = new Scanner(file);
       } catch (Exception e) {
           
       }
       
       //Read file into the convrates Hashtable
       while (input.hasNextLine()) {
           String line = input.nextLine();
           String[] splitline = line.split("=");
           convrates.put(splitline[0], Double.parseDouble(splitline[1]));
       }
       
       //Intialize variables
       double towork1 = first;
       double converted = 0;
       String[] toconvertarr = toconvert.split(",");
       double meters = 0;
       
       //Convert the initial amount to the universal distance - Meters
       if (convrates.containsKey(toconvertarr[0].toLowerCase().replaceAll("\\s+", ""))) {
           meters = convrates.get(toconvertarr[0].toLowerCase().replaceAll("\\s+", "")) * towork1;
       }
       
       //Perform final conversion
       if (convrates.containsKey(toconvertarr[1].toLowerCase().replaceAll("\\s+", ""))) {
           converted = (1/ convrates.get(toconvertarr[1].toLowerCase().replaceAll("\\s+", ""))) * meters;
       }
       
       //return final value of final conversion
       return converted;
   }
   
   /**
    * Utilized when the programmer wishes to convert between various units of currency.<br>
    * Supports: <br>Euros(eur), Japanese Yen(jpy), British Pounds(gbp), Swiss Francs(chf), Canadian Dollars(cad), Zimbabwean Dollars(zwd), Iranian Rivals(irr), Bitcoin(xbt), Gold(xau), Indian Rupees(inr), and United States Dollars(usd)
    * @param toconvert A comma seperated string that explains the conversion. For instance: "chf,cad"
    * @param amt An initial value to begin from. If the first element in toconvert was chf, then first would be the value in Swiss Francs. For instance: 12.1
    * @return double
   */
   //convert currency
   public static double currency(double amt, String toconvert) {
       //Create Hashtable to store rates
       Hashtable<String, Double> convrates = new Hashtable<String, Double>();
       
       //Create an empty variable for Scanner
       Scanner input = new Scanner(System.in);
       
       //Create object to read from the Currency Conversion data file
       try {
           File file = new File("com/varunlibs/VarunMath/DataFiles/CurrConv.txt");
           input = new Scanner(file);
       } catch (Exception e) {
           
       }
       
       //Read file into the convrates Hashtable
       while (input.hasNextLine()) {
           String line = input.nextLine();
           String[] splitline = line.split("=");
           convrates.put(splitline[0], Double.parseDouble(splitline[1]));
       }
       
       //Intialize variables
       double towork1 = amt;
       double converted = 0;
       String[] toconvertarr = toconvert.split(",");
       double dollars = 0;
       
       //Convert the initial amount to the universal currency - Dollars
       if (convrates.containsKey(toconvertarr[0].toLowerCase().replaceAll("\\s+", ""))) {
           dollars = (1 / convrates.get(toconvertarr[0].toLowerCase().replaceAll("\\s+", ""))) * towork1;
       }
       
       //Perform final conversion
       if (convrates.containsKey(toconvertarr[1].toLowerCase().replaceAll("\\s+", ""))) {
           converted = convrates.get(toconvertarr[1].toLowerCase().replaceAll("\\s+", "")) * dollars;
       }
       
       //return final value of final conversion
       return converted;
   }
}

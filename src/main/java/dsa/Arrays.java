package main.java.dsa; 

import java.util.Scanner;

/**
 * This is to review and explore the primitive data types, Arrays 
 * using the Java programming language.
 * 
 * The point of this Class file is to explore different ways to 
 * initialize, assign, and declare arrays in Java with their 
 * respective elements.
 */

public class Arrays {
    private static Scanner sc = new Scanner(System.in); 
    private static String tempInputHolder = ""; 

    private final static int SIZE = 5;

    private static String[] myArrStr = new String[SIZE]; 
    private static int[] myArrInt = new int[SIZE]; 
    private static char[] myCharArr = new char[SIZE];

    private static String[] myInitArrStr2 = {"Hello, World!", 
                                "Sugondese", 
                                "Cheese nuts", 
                                "Guacamole",
                                "Watermelon"};
    
    private static int[] myArrInitInt2 = {4, 5, 6, 7, 8}; 
    private static char[] myCharArrInit2 = {'a', 'b', 'c'};

    public static void main(String[] args) {
        
    }
}
package main.java.dsa; 

import java.util.Scanner;

/**
 * @author Cloyd Van Secuya
 * 
 * This is to review and explore the primitive data types, Arrays 
 * using the Java programming language.
 * 
 * The point of this Class file is to explore different ways to 
 * initialize, assign, and declare arrays in Java with their 
 * respective elements.
 * 
 * <p>
 * This is a practice and it explores how we can navigate
 * arrays and their initialized values. 
 * 
 * <p>
 * 
 * <p>
 * promptUserAndCheckInput(param, param){...}
 * This method is overloaded in the same class. 
 * I think it is much better if I do it this way (although it looks junky)
 * because it is straightforward process.
 * </p>
 * 
 * <p>
 * The <code>String tempInputHolder</code> is simply a 
 * temporary holder of values for our user input.
 * It is always being replaced with {@link #promptUserAndCheckInput(param, param)} method
 * using the <code>tempInputHolder = sc.nextLine();</code>
 * </p>
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


    /**
     * Assign a prompt message to the user, and assign the String[] array to initialize
     * @param message String
     * @param array String[]
     * @example promptUserAndCheckInput("Enter String[], limit ", myArrStr)
     */
    private static void promptUserAndCheckInput(String message, String[] array) {
        System.out.print(message + SIZE + ": ");
        
        tempInputHolder = sc.nextLine();
        array = tempInputHolder.split("\\s+");

        if (array.length > SIZE) {
            System.out.println("You exceeded the input limit!");
            System.out.println("Please, try again!");
            promptUserAndCheckInput(message, array);
        }
    }



    /**
     * Assign a prompt message to the user, and assign the int[] array to initialize
     * @param message String 
     * @param array int[]
     * @example promptUserAndCheckInput("Enter int[], limit ", myIntArr)
     */
    private static void promptUserAndCheckInput(String message, int[] array) {
        System.out.print(message + SIZE + ": ");
        
        tempInputHolder = sc.nextLine();
        String[] tempConvertoIntArr = tempInputHolder.split("\\s+");
        for(int i = 0; i < tempConvertoIntArr.length; i++) {
            array[i] = Integer.valueOf(tempConvertoIntArr[i]);
        }

        if (array.length > SIZE) {
            System.out.println("You exceeded the input limit!");
            System.out.println("Please, try again!");
            promptUserAndCheckInput(message, array);
        }
    }



    /**
     * Assign a prompt message to the user, and assign the char[] array to initialize
     * @param message String 
     * @param array char[]
     * @example promptUserAndCheckInput("Enter char[], limit ", myCharArr)
     */
    private static void promptUserAndCheckInput(String message, char[] array) {
        System.out.print(message + SIZE + ": ");
        tempInputHolder = sc.nextLine();
        String[] tempConvertToChar = tempInputHolder.split("\\s+");
        for(int i = 0; i < tempConvertToChar.length; i++) {
            array[i] = tempConvertToChar[i].charAt(i);
        } 

        if (array.length > SIZE) {
            System.out.println("You exceeded the input limit!");
            System.out.println("Please, try again!");
            promptUserAndCheckInput(message, array);
        }
    }



    public static void main(String[] args) {
        System.out.println("Enter sequences. Separated by a blank space");

        promptUserAndCheckInput("Enter String[], limit ", myArrStr);
        /**
         * @todo 
         * fix the overloading of method
         * promptUserAndCheckInput(String message, int[] array) 
         * promptUserAndCheckInput(String message, char[] array) 
         */
        
        // promptUserAndCheckInputInt("Enter int[], limit ", myArrInt);
        // promptUserAndCheckInputChar("Enter char[], limit ", myCharArr);
    }
}
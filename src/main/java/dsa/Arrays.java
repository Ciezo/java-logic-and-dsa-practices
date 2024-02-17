/**
 * @author Cloyd Van Secuya
 * 
 * <p>
 * This is to review and explore the basic data structure, Arrays, 
 * using the Java programming language. 
 * </p>
 *
 * <p>
 * The point of this Class file is to explore different ways to 
 * initialize, assign, and declare arrays in Java with their 
 * respective elements.
 * </p>
 * 
 * <p>
 * I also just want to review and revisit this topic again.
 * <b>I did this before, but I want to review again</b>
 * Take note that what I did here is my way of understanding and implementations
 * user input and Arrays
 * </p>
 * 
 * <p>
 * This is a practice and it explores how we can navigate
 * arrays and their initialized values. 
 * This Class also adopts the <i>overloading</i> of method promptUserAndCheckInput(){}
 * <b>overloading</b> is one of the principles of Object-Oriented Programming
 * we try to use the same method name, but can be used with different arguments. 
 * </p>
 * 
 * <p>
 * promptUserAndCheckInput(param, param){...}
 * <b>This method is overloaded in the same class.</b> 
 * I think it is much better if I do it this way (although it looks junky)
 * because it is straightforward process in this scenario.
 * </p>
 * 
 * <p>
 * The <code>String tempInputHolder</code> is simply a 
 * temporary holder of values for our user input. 
 * This gets overrided by whenever the <code>promptUserAndCheckInput(){}</code> is called.
 * It is always being replaced with {@link #promptUserAndCheckInput(String message, String[] array)} method
 * using the <code>tempInputHolder = sc.nextLine();</code>
 * </p>
 */

package main.java.dsa; 

import java.util.Scanner;

public class Arrays {
    private static Scanner sc = new Scanner(System.in); 
    private static String tempInputHolder = ""; 

    private final static int SIZE = 5;

    private static String[] myArrStr = new String[SIZE]; 
    private static int[] myArrInt = new int[SIZE]; 
    private static char[] myCharArr = new char[SIZE]; 

    /** @todo  Just output this */
    private static String[] myInitArrStr2 = {"Hello, World!", 
    "Sugondese", 
    "Cheese nuts", 
    "Guacamole",
    "Watermelon"};
    
    /** @todo  Just output this */
    private static int[] myArrInitInt2 = {4, 5, 6, 7, 8}; 
    /** @todo  Just output this */
    private static char[] myCharArrInit2 = {'a', 'b', 'c'};


    /**
     * Assign a prompt message to the user, and assign the String[] array to initialize
     * @param message String
     * @param array String[]
     * @return String[]
     * @example promptUserAndCheckInput("Enter String[], limit ", myArrStr)
     */
    private static String[] promptUserAndCheckInput(String message, String[] array) {
        System.out.print(message + SIZE + ": ");
        
        tempInputHolder = sc.nextLine();
        array = tempInputHolder.split("\\s+");

        if (array.length > SIZE) {
            System.out.println("You exceeded the input limit!");
            System.out.println("Please, try again!");
            return promptUserAndCheckInput(message, array);
        }
        return array; 
    }



    /**
     * Assign a prompt message to the user, and assign the int[] array to initialize
     * @param message String 
     * @param array int[]
     * @return int[]
     * @example promptUserAndCheckInput("Enter int[], limit ", myIntArr)
     */
    private static int[] promptUserAndCheckInput(String message, int[] array) {
        System.out.print(message + SIZE + ": ");
        
        tempInputHolder = sc.nextLine();
        String[] tempConvertoIntArr = tempInputHolder.split("\\s+");
        for(int i = 0; i < tempConvertoIntArr.length; i++) {
            array[i] = Integer.valueOf(tempConvertoIntArr[i]);
        }

        if (array.length > SIZE) {
            System.out.println("You exceeded the input limit!");
            System.out.println("Please, try again!");
            return promptUserAndCheckInput(message, array);
        }
        return array;
    }



    /**
     * Assign a prompt message to the user, and assign the char[] array to initialize
     * @param message String 
     * @param array char[]
     * @return char[]
     * @example promptUserAndCheckInput("Enter char[], limit ", myCharArr)
     */
    private static char[] promptUserAndCheckInput(String message, char[] array) {
        System.out.print(message + SIZE + ": ");
        tempInputHolder = sc.nextLine();
        String[] tempConvertToChar = tempInputHolder.split("\\s+");
        for(int i = 0; i < tempConvertToChar.length; i++) {
            array[i] = tempConvertToChar[i].charAt(i);
        } 

        if (array.length > SIZE) {
            System.out.println("You exceeded the input limit!");
            System.out.println("Please, try again!");
            return promptUserAndCheckInput(message, array);
        }
        return array;
    }



    public static void main(String[] args) throws InterruptedException {
        System.out.println("Enter sequences. Separated by a blank space");

        myArrStr = promptUserAndCheckInput("Enter String[], limit ", myArrStr);
        myArrInt = promptUserAndCheckInput("Enter int[], limit ", myArrInt);
        /** @todo this has a problem. 
         * java.lang.StringIndexOutOfBoundsException: Index 1 out of bounds for length 1
         * at java.base/java.lang.String.charAt(String.java:1535)
         * at main.java.dsa.Arrays.promptUserAndCheckInput(Arrays.java:127)
         * at main.java.dsa.Arrays.main(Arrays.java:145)
        */
        // myCharArr = promptUserAndCheckInput("Enter char[], limit ", myCharArr);

        System.out.println("Output...");
        /** Output String[] */
        System.out.println("String");
        System.out.println("===================================");
        for(int i = 0; i < myArrStr.length; i++) {
            System.out.println(myArrStr[i]);
        }
        System.out.println("===================================");

        Thread.sleep(3000);


        /** Output int[] */
        System.out.println("int");
        System.out.println("===================================");
        for(int i = 0; i < myArrInt.length; i++) {
            System.out.println(myArrInt[i]);
        }
        System.out.println("===================================");

        Thread.sleep(3000);


        /** Output char[] */
        System.out.println("String");
        System.out.println("===================================");
        for(int i = 0; i < myCharArr.length; i++) {
            System.out.println(myCharArr[i]);
        }
        System.out.println("===================================");

        Thread.sleep(3000);
    }
}
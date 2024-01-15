/**
 * @author Cloyd Van Secuya
 * 
 * <p>
 * This program shall allow a user to enter a String as an input 
 * then, reverses it as an output
 * </p>
 */
package main.java.logic; 

import java.util.Scanner;

/**
 * Question 2:
 * Implement a function to reverse a string without using any library functions.
 * 
 * Input: 
 * String: "Hello"
 * 
 * Output: 
 * "olleH"
 */

public class ReverseStringNatively {
    
    private static String input;
    private static Scanner sc = new Scanner(System.in);

    private static String revereseString(String input) {
        char[] temp = input.toCharArray();
        int length = temp.length;
        char[] temp2 = new char[length-1];

        /**
         * I think it's better to use for-each loop
         */
        int index = 0;
        for (char c : temp) {
            if (index < temp2.length) {
                temp2[index++] = c;
            }
        }
        
        /** Return the char array as a String */
        String finalRes = String.copyValueOf(temp2);
        return finalRes;
    }

    public static void main(String[] args) {
         System.out.println("Enter a string to reverse");
         System.out.print(">> ");
         input = sc.nextLine(); 
         System.out.println(revereseString(input).toString());
    }
}
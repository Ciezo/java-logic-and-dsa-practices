/**
 * @author Cloyd Van Secuya
 * 
 * <p>
 * This program shall allow a user to enter a String as an input 
 * then, reverses it as an output
 * </p>
 * 
 * <p>
 * <code>reverseString(String input)</code>
 * Gets a String as argyument then, converts 
 * that into a char array for reversal 
 * then <code>returns a new String</code> 
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

    private static String reverseString(String input) {
        char[] temp = input.toCharArray();
        int length = temp.length;
    
        for (int i = 0; i < length / 2; i++) {
            // Swap characters at positions i and length - 1 - i
            char tempChar = temp[i];
            temp[i] = temp[length - 1 - i];
            temp[length - 1 - i] = tempChar;
        }
    
        // Return the char array as a String
        return new String(temp);
    }
    

    public static void main(String[] args) {
         System.out.println("Enter a string to reverse");
         System.out.print(">> ");
         input = sc.nextLine(); 
         System.out.println(reverseString(input).toString());
    }
}
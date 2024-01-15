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
        
        int index = 0;
        for(int i = length - 1; i >= 0; i--) {
            temp[index] = temp[i];
        }
        
        /** Return the char array as a String */
        return String.copyValueOf(temp);
    }

    public static void main(String[] args) {
         System.out.println("Enter a string to reverse");
         System.out.print(">> ");
         input = sc.nextLine(); 
         System.out.println(revereseString(input).toString());
    }
}
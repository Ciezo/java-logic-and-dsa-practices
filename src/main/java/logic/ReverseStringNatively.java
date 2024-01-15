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
        char[] temp2 = {'x'};

        // Now, loop through each element and form a new array with reverse order
        /** Scan the element starting from the last position */
        /** @todo How to scan array at the last element? */
        for(int i = 0; i < temp.length-1; i++) {
            temp2[i] = temp[i];
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
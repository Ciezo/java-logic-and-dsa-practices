/**
 * @author Cloyd Van Secuya
 * 
 * 
 * <p>
 * A Palindrome is a word, number, or verse that reads the same forward or backwards.
 * 
 * Example: 
 * "racecar" is read the same as "racecar" in backwards
 * "radar" is read the same as "radar" in backwards
 * </p>
 */
package main.java.logic;

import java.util.Scanner;



/**
 * Check if a given user input is a Palindrome or not.
 * 
 * A user should be allowed to enter two kinds of input: 
 *   1. String
 *   2. Integer
 */
public class CheckPalindrome {
    
    private static Scanner sc = new Scanner(System.in);             // user is free to enter int or str


    /**
     * Allows to check the given user input if the String is of the same value in forwards and backwards
     * @param str must be of String type
     * @return true if the `str` is a palindrome otherwise, false
     */
    public static boolean checkIfStringIsPalindrome(String str) {
        str = str.toLowerCase();        
        String reverseStr = "";
        int length = str.length();

        // Scan backwards 
        for (int i = (length-1); i >= 0; i--) {
            // Get the specific char value at the specified index in the loop
            reverseStr = reverseStr + str.charAt(i);            // get the reversed String
        }

        if (str.equals(reverseStr)) {
            System.out.println("String is palindrome");
            System.out.println(reverseStr);
            return true;
        } else {
            System.out.println("String is not a palindrome");
            return false;
        }

    }



    /**
     * Checks if the given user input is a number palindrome
     * @param num
     * @return true if the `num` is a palindrome otherwise, false
     */
    public static boolean checkIfIntegerIsPalindrome(int num) {
        int origNum = num;          // create a copy of the original number. Use this for comparison
        int reverseNum = 0;
        int remainder = 0; 

        while (num != 0) {
            remainder = num % 10;
            reverseNum = reverseNum * 10 + remainder;
            num = num / 10;
        }
        
        if (origNum == reverseNum) {
            System.out.println("Integer is a palindrome");
            System.out.println(reverseNum);
            return true;
        } else {
            System.out.println("Integer is not a palindrome");
            return false;
        }
        
    }


    public static void main(String[] args) {
        System.out.println("Enter an input (Integer or String)");
        if (sc.hasNextInt()) {
            int input = sc.nextInt();
            checkIfIntegerIsPalindrome(input);
        }

        else {
            String input = sc.nextLine(); 
            checkIfStringIsPalindrome(input);
        }
    }
}

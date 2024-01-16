package main.java.logic;

import java.util.Arrays;

/**
 * Question 5:
 * 
 * Write a function that checks if two strings are anagrams of each other.
 * 
 * Input: 
 * String 1: "listen"
 * String 2: "silent"
 *  
 * Output: 
 * Anagrams
 */

public class StringsAndAnagrams {
    
    private static String str1;
    private static String str2;

    private static boolean checkIfAnagram(String compare1, String compare2) {
        /**
         * @todo 
         * This needs fixing.....
         * I must learn to sort my converted char arrays.
         * Then, I must begin comparing them.
         * 
         * I must recheck the for loop once I got back here....
         * 
         * I remember I did this in one of my CS Subjects...
         * I must not waste those learnings...I must carefully remember...
         */

        /**
         * Take note that I must first ensure that both compare1 and compare2
         * are in lowercase
         */
        compare1 = compare1.toLowerCase();
        compare2 = compare1.toLowerCase();

        /**
         * To compare two strings both if they are anagrams then,
         * I must first convert it into a char array to compare 
         * each char and its value respectively.
         */
        char[] toCompare1 = compare1.toCharArray();
        char[] toCompare2 = compare2.toCharArray();

        /**
         * After the conversion to char array then, 
         * sort the Arrays
         */
        Arrays.sort(toCompare1);
        Arrays.sort(toCompare2);
        
        /**
         * Instead of using nested for-loops in comparing
         * each character by character.
         * It is much more efficient to use Arrays.equals()
         * Reference: https://www.programiz.com/java-programming/examples/check-if-two-strings-are-anagram
         *            @note This reference is really helpful
         *            because I thought I would just use a nested for-loop to scan 
         *            my two char arrays.
         */
        boolean flag = Arrays.equals(toCompare1, toCompare2);       // This will return true if both arrays are equal
        // When both char arrays are of equal value then,
        if(flag) {
            return flag;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        str1 = "listen";
        str2 = "silent";
        System.out.println("Checking if two strings are anagram...");
        boolean result = checkIfAnagram(str1, str2);
        if(result == true) {
            System.out.println("Result: " + result);
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }
    }
}
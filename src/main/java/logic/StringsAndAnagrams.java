package main.java.logic; 

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
         * To compare two strings both if they are anagrams then,
         * I must first convert it into a char array to compare 
         * each char and its value respectively.
         */
        boolean flag = false;
        char[] toCompare1 = compare1.toCharArray();
        char[] toCompare2 = compare2.toCharArray();
        
        /**
         * Then, simply begin comparing them by using nested for-loops
         */
        int length1 = toCompare1.length; 
        int length2 = toCompare2.length; 
        for(int i = 0; i < length1; i++) {
            for(int j = 0; j < length2;) {
                if(toCompare1[i] == toCompare2[j]) {
                    flag = true;
                    return flag; 
                } else {
                    flag = false;
                    return flag; 
                }
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        String myStr1 = "listen";
        String myStr2 = "silent";
        System.out.println("Checking if two strings are anagram...");
        boolean result = checkIfAnagram(myStr1, myStr2);
        System.out.println("Result: " + result);
    }
}
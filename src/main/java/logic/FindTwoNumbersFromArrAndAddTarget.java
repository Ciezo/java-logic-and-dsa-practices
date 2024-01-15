/**
 * @author Cloyd Van Secuya
 * 
 * <p>
 * This program simply tries to use nested for-loops to find 
 * a target in an array. 
 * </p>
 */
package main.java.logic; 

/**
 * Question 3:
 * Given an array of integers, find the two numbers such that they add up to a specific target.
 * 
 * Input: 
 * Array: [2, 7, 11, 15]
 * Target: 9
 * 
 * Output: 
 * [2, 7]
 */

public class FindTwoNumbersFromArrAndAddTarget {
    
    private static int[] arr = {2, 7, 11, 15};
    private static int target = 26;

    public static void main(String[] args) {
        
        // Make a nested for loop to scan each element respectively
        /**
         * Such that, 
         * i = i
         * j = i + 1
         */
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < i; j++) {
                // Create a condition to see if some elements add up to the target
                if (target == (arr[i] + arr[j])) {
                    System.out.println("Target reached!");
                    System.out.println("Target is: " + target);
                    System.out.println("Respective elements: [" + arr[i] + " " + arr[j] + "]");
                }
            }
        }

    }
}
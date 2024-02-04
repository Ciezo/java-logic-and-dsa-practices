/**
 * @author Cloyd Van Secuya
 * 
 * <p>
 * In this program, I decided to use a 2 basic for-loops to 
 * scan the given array to the function findLargest(int[] array). 
 * </p>
 */
package main.java.logic; 

/**
 * Question 9:
 * Write a program to find the largest element in an array.
 * 
 * Input: 
 * Array: [3, 7, 1, 9, 4, 6]
 * 
 * Output: 
 * Largest Element: 9
 */

public class FindLargestElementInArr {
    
    private static int[] array = {9, 7, 1, 3, 4, 6};

    private static int findLargest(int[] array) {
        /* Assume here max is 0 as we did not find it yet */
        int max = 0;
        int length = array.length;
        for(int i = 0; i < length; i++) {
            for(int j = i + 1; j < length - 1; j++) {
                // Compare elements
                if(array[i] > array[j]) max = array[i];
                if(array[j] > array[i]) max = array[j];
            }
        }
        return max;
    }

    public static void main(String[] args) {
         int result = findLargest(array);
         System.out.println(result);
    }
}
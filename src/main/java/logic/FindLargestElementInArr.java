/**
 * @author Cloyd Van Secuya
 * 
 * <p>
 * For me, finding the largest element in the array is we need to sort the 
 * array first in a descending order. 
 * </p>
 * 
 * <p>
 * Then, we proceed to compare the elements in the array using a single for-loop
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

    /**
     * This method has a tightly coupled relationship with {@link #sortArray(int[] array)} method
     * @param array the sorted array in descending order
     * @return largest element of type <code>int</code>
     */
    private static int findLargest(int[] array) {
        /* Assume here max is 0 as we did not find it yet */
        int max = 0;
        int length = array.length;
        return max;
    }

    public static void main(String[] args) {
         int result = findLargest(array);
         System.out.println(result);
    }
}
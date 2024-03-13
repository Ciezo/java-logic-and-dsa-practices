/**
 * @author Cloyd Van Secuya
 * 
 * <p>
 * Finding common elements between two arrays can be done by 
 * using nested for-loops to scan each element.
 * </p>
 * 
 * <p>
 * Here in this snippet, we can see that a nested for-loop are used.
 * This is done because an array can have a fixed length. And, to 
 * scan each element requires a linear time complexity or O(n). 
 * 
 * By, linear time complexity, it means that our for-loop scan goes through 
 * a fixed number of work (as it is in constant n).
 * 
 * 
 * ```
 *  for(int i = 0; i < arr1.length; i++) {
 *      for(int j = 0; j < arr2.length; j++) {
 *          // Set conditions here to check.
 *      }
 *  }
 * ```
 * </p>
 */
package main.java.logic;

import java.util.ArrayList;

/**
 * Question 13:
 * Write a program to find the common elements between two arrays.
 * 
 * Input: 
 * Array 1: [1, 2, 3, 4, 5]
 * Array 2: [3, 5, 7, 9]
 * 
 * Output:
 * Common Elements: [3, 5]
 */

public class FindCommonElementsBetwArr {
    
    private static int[] arr1 = {1, 2, 3, 4, 5};
    private static int[] arr2 = {3, 5, 7, 9};
    


    /**
     * Find common elements between two arrays using an ArrayList<Integer> type.
     * <b>This is in quadratic time complexity.</b> 
     * It is because there are two nested for-loops
     * @param arr1 type int[], compare against arr2 
     * @param arr2 type int[], compare against arr1
     */
    private static void findCommonElements(int[] arr1, int[] arr2) {
        // This is safe since we don't have to worry about the size of the array
        ArrayList<Integer> commonElements = new ArrayList<>();
        
        for(int i = 0; i < arr1.length; i++) {
            for(int j = 0; j < arr2.length; j++) {
                if(arr1[i] == arr2[j]) {
                    commonElements.add(arr1[i]);
                }
            }
        }

        System.out.println("Common elements: ");
        for(int elements : commonElements) {
            System.out.print(elements + " ");
        }
        System.out.println();
    }



    /**
     * Returns an array with common elements, such that, [i, i] 
     * <b>This is in quadratic time complexity.</b> 
     * It is because there are two nested for-loops
     * @param arr1 type int[], compare against arr2 
     * @param arr2 type int[], compare against arr1
     * @return an int[2] with common elements
     */
    private static int[] getCommonElements(int[] arr1, int[] arr2) {
        // This is much explicit because we are expected to have N of common elements.
        int[] commonElements = new int[2];
        
        // index to commontElements[count]
        int count = 0;      // A pointer to number of common elements
        for(int i = 0; i < arr1.length; i++) {
            for(int j = 0; j < arr2.length;j++) {
                if(arr1[i] == arr2[j]){ 
                    commonElements[count] = arr1[i];
                    count++; 
                    break;
                }
            }
        }

        return commonElements;
    }




    public static void main(String[] args) {
        findCommonElements(arr1, arr2);

        int[] commonElements = getCommonElements(arr1, arr2);
        for(int i = 0; i < commonElements.length; i++) {
            System.out.print(commonElements[i] + " ");
        }

    }
}
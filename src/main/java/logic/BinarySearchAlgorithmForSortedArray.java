/**
 * @author Cloyd Van Secuya
 * 
 * <p>
 * From what I understand, a binary search algorithm is a tool used to return an index of a 
 * target number from the array. And, in this case, we can use arrays to 
 * implement a binary.  
 * </p>
 * 
 * <p>
 * To apply Binary Search algorithm:
 * The data structure must be sorted.
 * Access to any element of the data structure takes constant time.
 * 
 * Reference: https://www.geeksforgeeks.org/binary-search/
 * </p>
 * 
 * <p>
 * <b>Binary search</b> The idea of binary search is to use the information that the array is 
 * sorted and reduce the time complexity to O(log N). 
 * 
 * Reference: https://www.geeksforgeeks.org/binary-search/ 
 * </p>
 * 
 * <p>
 * Terminologies: 
 *      key = element of an array 
 * </p>
 */
package main.java.logic; 

/**
 * Question 6:
 * Implement a binary search algorithm for a sorted array.
 * 
 * Example: 
 * Input: 
 * Array: [1, 2, 3, 4, 5, 6, 7]
 * Target: 4
 * 
 * Output: 
 * Index: 3
 */

public class BinarySearchAlgorithmForSortedArray {

    private static int[] unsortedArr = {5, 2, 4, 1, 9, 8, 10, 15, 11, 12, 26, 18};
    
    /**
     * This formula is based on the following: 
     *      Compare the middle element of the search space with the key. 
     *      If the key is found at middle element, the process is terminated.
     *      If the key is not found at middle element, choose which half will be used as the next search space.
     *      If the key is smaller than the middle element, then the left side is used for next search.
     *      If the key is larger than the middle element, then the right side is used for next search.
     *      This process is continued until the key is found or the total search space is exhausted.
     */
    private static int high = 0;
    private static int low = 0;
    private static int mid = low + (high - low / 2);

    public static void main(String[] args) {

    }
}
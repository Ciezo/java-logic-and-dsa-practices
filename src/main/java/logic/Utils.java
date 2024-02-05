package main.java.logic;

public class Utils {
    /**
     * This is used in BinarySearchAlgorithmForSortedArray.java
     * It works!
     * @param array the unsorted array to sort
     * @return sorted array in descending order
     */
    private static int[] sortArray(int[] array) {
        int length = array.length;
        /** I cloned the array to perform minimal changes to the param passed */
        int[] sortedArr = array.clone(); 
        for(int i = 0; i < length; i++) {
            for(int j = i + 1; j < length; j++) {
                // Check and compare individual elements 
                if(sortedArr[i] > sortedArr[j]) {
                    /* Create a temp variable to contain the said element to swap */
                    int temp = sortedArr[i];                // key from index i, assign to temp
                    sortedArr[i] = sortedArr[j];            // key from j assign to array of index i
                    sortedArr[j] = temp;                    // value from temp assign to index of j 
                }
            }
        }
        return sortedArr;
    }
}

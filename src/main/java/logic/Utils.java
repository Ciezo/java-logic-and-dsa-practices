package main.java.logic;

public class Utils {
    /**
     * This is used in BinarySearchAlgorithmForSortedArray.java
     * It works!
     * @param array the unsorted array to sort
     * @return sorted array in ascending order
     */
    static int[] sortArray(int[] array) {
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

    /**
     * @note We cannot use a starting element beyond 2
     * @param startElement this acts as a "starting point" for the fibonacci series to generate from 
     * @return int[] fibonacciSeries
     * @example fibonacci(2)
     *          Output: 2, 3, 5, 8, 13....
     */
    private static int[] fibonacci(int startElement, int SIZE) {
        // Input validation 
        /* Constraint: n >= 0 <= 2 */
        if(startElement < 0 || startElement > 2) {
            System.out.println("Invalid starting element!");
            System.out.println("Please, enter 0 to 2!");
            return new int[0];
        }

        int[] tempFib = new int[SIZE];

        tempFib[0] = startElement;  
        tempFib[1] = tempFib[0] + 1;  
        for(int i = 2; i < SIZE-1; i++) {
            tempFib[i] = tempFib[i-1] + tempFib[i-2];
        }
            
        return tempFib;
    }

    /**
     * Populate the two dimensional array using a one dimensional array
     * @param twoDimArray the empty 2D array
     * @param values the single-dimensional array to be used to populate the empty 2D array
     * @return populated two dimensional array
     */
    public static int[][] populateMatrix(int rows, int columns, int[][] twoDimArray, int[] values) {
        int counter = 0; 
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                twoDimArray[i][j] = values[counter];
                counter++;
                if(counter == values.length) break;
            }
        }
        return twoDimArray;
    }
}

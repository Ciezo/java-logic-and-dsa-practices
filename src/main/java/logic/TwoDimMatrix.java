/**
 * @author Cloyd Van Secuya
 * 
 * <p>
 *  <b>Two-dimensional arrays or matrices</b> can store and represent values in 
 *  <b>rows and columns</b>
 * </p>
 */
package main.java.logic; 

/**
 * Question 5:
 * Given a matrix, write a program to rotate it by 90 degrees.
 * 
 * Input: 
 * Matrix:
 * 1 2 3
 * 4 5 6
 * 7 8 9
 *  
 * Output: 
 * Rotated Matrix:
 * 7 4 1
 * 8 5 2
 * 9 6 3
 * 
 */

public class TwoDimMatrix {

    private static int rows = 3;
    private static int columns = 3;
    private static int[][] twoDArray = new int[rows][columns];
    /* This data will be used to populate the 2D array */
    private static int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9};



    /**
     * Populate the two dimensional array using a one dimensional array
     * @param twoDimArray the empty 2D array
     * @param values the single-dimensional array to be used to populate the empty 2D array
     * @return populated two dimensional array
     */
    private static int[][] populateMatrix(int[][] twoDimArray, int[] values) {
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
 


    public static void main(String[] args) {
        twoDArray = populateMatrix(twoDArray, data);

        System.out.println("Checking the data in our matrix");
        for(int i = 0; i < rows; i++) { 
            for(int j = 0; j < columns; j++) {
                System.out.print(twoDArray[i][j] + " ");
            }
            System.out.println();
        }
    }

}
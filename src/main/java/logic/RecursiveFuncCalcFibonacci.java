/**
 * @author Cloyd Van Secuya
 * 
 * <p>
 * What is a fibonacci sequence?
 * It is a series of numbers denoted by, n and j, where n and j are both numbers
 * such that n + j = x...where x is the resulting sum by n and j.  
 * </p>
 * 
 * <p>
 * Example: 
 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89... 
 * </p> 
 */
package main.java.logic; 

/**
 * Question 8:
 * Implement a recursive function to calculate the first 100 Fibonacci series.
 *  
 * Output: 
 * Fibonacci: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89...
 */

public class RecursiveFuncCalcFibonacci {

    private static final int SIZE = 100;
    private static int[] fibonacciSeries = new int[SIZE];



    /**
     * 
     * @param startElement this acts as a "starting point" for the fibonacci series to generate from 
     * @return int[] fibonacciSeries
     * @example fibonacci(2)
     *          Output: 2, 3, 5, 8, 13....
     */
    private static int[] fibonacci(int startElement) {
        fibonacciSeries = fibonacci(startElement);
        return fibonacciSeries;
    }




    public static void main(String[] args) {
         
    }
}
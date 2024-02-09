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

    private static final int SIZE = 30;
    /** Assign here the final computed Fibonacci Series using the method, {@link #fibonacci(int startElement)}  
     * @note Use it in the main()
    */ private static int[] fibonacciSeries = new int[SIZE];



    /**
     * @note We cannot use a starting element beyond 2
     * @param startElement this acts as a "starting point" for the fibonacci series to generate from 
     * @return int[] fibonacciSeries
     * @example fibonacci(2)
     *          Output: 2, 3, 5, 8, 13....
     */
    private static int[] fibonacci(int startElement) {
        // Input validation 
        /* Constraint: n >= 0 <= 2 */
        if(startElement < 0 || startElement > 2) {
            System.out.println("Invalid starting element!");
            System.out.println("Please, enter 0 to 2!");
            return new int[0];
        }

        int[] tempFib = new int[SIZE];

        tempFib[0] = startElement;  
        tempFib[1] = startElement + 1;  
        for(int i = 2; i < SIZE-1; i++) {
            tempFib[i] = tempFib[i-1] + tempFib[i+1];
        }
            
        return tempFib;
    }




    public static void main(String[] args) {
        System.out.println("Testing...");
        fibonacciSeries = fibonacci(2);
        for(int i = 0; i < fibonacciSeries.length; i++) {
            System.out.println(fibonacciSeries[i]);
        }
    }
}
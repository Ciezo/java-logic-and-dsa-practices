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
 * Implement a recursive function to calculate the first 30 Fibonacci series.
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
        if(startElement < 0 && startElement > 2) {
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
     * @note Using two elements, 0 and 1, we ask the user to input them and generate the fibonacci series from there
     *       Such that, left side (i-1) + right side (i-2) will result in the next element x
     * @param elem0 first element to add on the left side
     * @param elem1 second element to add on the right side
     * @return int[] fibonacciSeries
     */
    private static int[] fibonacci(int elem0, int elem1) {
        int[] tempFib = new int[SIZE];
        
        tempFib[0] = elem0;            
        tempFib[1] = elem1;            
        for(int i = 2; i < SIZE-1; i++) {
            tempFib[i] = tempFib[i-1] + tempFib[i-2];
        }

        return tempFib;

    }



    /**
     * @note Generate a fibonacci series based on the given length from the user input
     * @param length type <code>length</code> which can change based on the given user input
     * @return int[length] fibonacci 
     */
    private static int[] fibonacciBasedOnSize(int length) {
        int[] tempFib = new int[length];

        tempFib[0] = 0;
        tempFib[1] = 1;
        for(int i = 2; i < length; i++) {
            tempFib[i] = tempFib[i-1] + tempFib[i-2];
        }

        return tempFib;
    }
    


    /**
     * @note This is the same as {@link #fibonacci(int startElement)} however it is in recursive
     * @param startElement this acts as a "starting point" for the fibonacci series to generate from 
     * @param length to limit how many elements are generated in the series
     * @return int[] fibonacciSeries
     */
    private static int[] recursiveFib(int startElement, int length) {
        /**
         * @todo Think of a possible solution here to make the {@link #fibonacci(int startElement)}
         * as recursive
        */
        int[] tempFib = new int[length];
        int tempStartElement;                                 // copy of start element. Used as a swap var
        int tempLength = length;                             // copy of length. Used as swap var
        // Input validation
        if(startElement < 0 && startElement > 2) {
            System.out.println("Invalid starting element!");
            System.out.println("Please, enter 0 to 2!");
            return new int[0];
        }
        // Pseudocode
        /*
         * 1.check starting element, and make it is is 
         * n >= 0; n <= 2
         * where, n = startElement 
         * 
         * 2. call the recursiveFib(int startElement) to 
         * generate the fib series. And, the startElement is updating 
         * everytime the method is called
         * 
         * int tempStartElement = 0     
         * int[] tempFib = new int[length]
         * tempFib = recursiveFib(tempStartElement)
         * Simulate:
         * 
         * tempFib[0] = 0 
         * 
         * tempStartElement = 1
         * tempFib = recursiveFib(tempStartElement)
         * tempFib[1] = 1
         * 
         * tempStartElement = 2
         * tempFib = recursiveFib(tempStartElement)
         * tempFib[2] = 2
         * 
         * 
         * And so on....
         *  
         */

        /* tempStartElement is used as a swap to update the 
        start element in the recursive method calls */
        tempStartElement = startElement;
        tempFib[0] = startElement;
        tempStartElement = tempFib[0];
        tempFib[1] = tempFib[0] + 1;
        tempStartElement = tempFib[1];
        for(int i = 2; i < length; i++) {
            tempFib[i] = tempFib[i-1] + tempFib[i-2];
            tempStartElement = tempFib[i];   
            tempLength = length;
        } recursiveFib(tempStartElement, tempLength);
        // for (int elem : tempFib) {
        //     tempFib = recursiveFib(tempStartElement, length);
        // }      


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
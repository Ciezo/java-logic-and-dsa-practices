/**
 * @author Cloyd Van Secuya
 * 
 * 
 * <p>
 * Basic calculator.
 * </p>
 */
package main.java.logic; 


import java.util.Random;
import java.util.Scanner;

/**
 * Question 10:
 * Implement a basic calculator that can perform 
 * addition, subtraction, multiplication, and division on two numbers.
 * 
 * Example: 
 * Operation: add
 * Number 1: 5
 * Number 2: 3
 * Result: 8
 */

/**
 * @note I used <code>long</code> data type here because 
 * > LONG stores numbers as numeric values, including decimal, fractional, and whole numbers
 * > Reference: https://community-forums.domo.com/main/discussion/15852/what-the-difference-between-double-and-long-data-types#:~:text=LONG%20stores%20numbers%20as%20numeric,precision%20floating%20point%20number%20values.
*/
public class BasicCalculator {

    private static long add(long x, long y) {
        return x + y;
    }

    private static long sub(long x, long y) {
        return x - y;
    }

    private static long div(long x, long y) {
        // just return quotient 0 when denominator is 0
        if(y == 0) return 0; 
        else return x / y;
    }

    private static long mult(long x, long y) {
        return x * y;
    } 

    public static void main(String[] args) throws InterruptedException {
    
        long sum = 0; 
        long diff = 0; 
        long quo = 0; 
        long prod = 0;
        
        // Create a test of inputs
        /* @note This is slower...so, it needs time to execute 
         * Hence, there is throws declaration of InterruptedException
        */
        Random rand = new Random();
        int size = rand.nextInt(11);                    // I just want to limit the testing to 10
        long[] t = new long[size];
        for(int i = 0; i < size; i++) {
            /* @note do not remove this sout.. */
            /*
             * Copilot(free from Bing):
             * > The behavior you’re observing is not due to a problem with the runtime or compiler. It’s actually a common phenomenon related to how input/output (I/O) operations and computation 
             * > are scheduled by the Java Virtual Machine (JVM) and the underlying operating system.
             * 
             * > When you uncomment the System.out.println("Populating..."); line, you’re adding an I/O operation in the loop.
             * > I/O operations are generally slower than computation (like your random number generation), and they can cause the 
             * > thread to yield control, allowing other threads (including those managing the random number generator) to run.
             */
            /* Instead of using sout */
            // System.out.println("");
            // 50ms is just right for this implementation
            Thread.sleep(50);           // Try this...      
            t[i] = rand.nextInt(size);
        }

        /* It is better to stop the loop, length-1, to avoid ArrayIndexOutOfBoundsException */
        for(int i = 0; i < t.length-1; i++) {
            sum = add(t[i], t[i+1]);
            diff = sub(t[i], t[i+1]);
            quo = div(t[i], t[i+1]);
            prod = mult(t[i], t[i+1]);
        }

        System.out.println("Checking results...");
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + diff);
        System.out.println("Quotient: " + quo);
        System.out.println("Product: " + prod);

    }
}
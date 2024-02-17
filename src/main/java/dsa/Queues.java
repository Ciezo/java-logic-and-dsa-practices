/**
 * @author Cloyd Van Secuya
 * 
 * <p>
 * <b>Queues</b> follow the "First-In First-Out" (FIFO) data structure.
 * </p>
 * 
 * <p>
 * It is a linear data structure that is open on both ends (head and tail)
 * where a user can perform operations accordingly such as inserting an element. 
 * </p>
 * 
 * <p> 
 * A Queue is defined as a linear data structure that is open at both ends 
 * and the operations are <b>performed in First In First Out (FIFO) order</b>.
 * </p> 
 * 
 * 
 * <u>Common operations in a queue</u>
 * <ol>
 *  <li><Enqueue - it happens at the "tail" or end of the queue where an element is inserted./li>
 *  <li>Dequeue - it happens at the "head" of the queue where an element is removed.</li>
 * </ol>
 * 
 * <p>
 * <b>Important terminologies</b>
 * <ol>
 *  <li>Head or front - as the name implies it is the front of the queue where <b>elements are removed</b></li>
 *  <li>Tail, rear, or back - it is the end of the sequece where <b>elements are inserted</b></li>
 * </ol>
 * </p>
 * 
 * <p>
 * In this Class, I am to implement a queue data strucutre without relying on Java Collections
 * library. <b>I need to understand and master the fundamentals</b>
 * </p>
 */
package main.java.dsa;

public class Queues {

    private static int head = 0;
    private static int tail = -1;
    private static int[] exampleQueue = {1, 2, 3, 4, 5, 6};
    private static int length = exampleQueue.length;


    private static void enqueue() {
        /**
         * @todo - February 18, 2024
         * - Research and implement the basic enqueue operation
         */
    }

    private static void dequeue(){
        /**
         * @todo - February 18, 2024
         * - Research and implement the basic dequeue operation
         */
    }

    public static void main(String[] args) {
        System.out.println("Length of the queue: " + length);
        System.out.println(exampleQueue[head]);
        System.out.println(exampleQueue[tail+length]);
    }
    
}

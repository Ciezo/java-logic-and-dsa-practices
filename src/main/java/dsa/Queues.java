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
 * 
 * References: 
 * https://www.geeksforgeeks.org/queue-data-structure/ 
 */
package main.java.dsa;

public class Queues {

    private static int length = 10;
    private static int head = 0;
    private static int tail = -1;
    private static int[] myQueue = new int[length]; 



    private static boolean isEmpty(int[] queue) {
        return false;
    }



    private static boolean isFull(int[] queue) {   
        return false;
    }



    /**
     * Inserting elements at the rear of queue.
     * @param element to insert of type int
     */
    private static void enqueue(int element) {
        if((isEmpty(myQueue)) && (isFull(myQueue))) {
            myQueue[tail+length] = element;
        } 
    }



    private static void dequeue(int element){
        /**
         * @todo - February 18, 2024
         * - Research and implement the basic dequeue operation
         */
    }



    public static void main(String[] args) { 
        enqueue(3);
        enqueue(6);
        enqueue(9);

        /**
         * Check the user queue here
         */
        System.out.println("Maximum length of the queue: " + length);
        System.out.println(myQueue[head]);
        System.out.println(myQueue[tail+length]);
    }
    
}

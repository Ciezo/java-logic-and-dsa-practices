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



    /**
     * Checks if the user queue is empty. 
     * And, the tail pointer is -1. 
     * @return true if empty, otherwise false;
     * @example boolean check = isEmpty(myQueue); 
     */
    private static boolean isEmpty() {
        if(tail == -1) 
            return true;
        return false;
    }



    /**
     * Check if the queue is full, by that it means 
     * the elements inside the queue has exceeded 
     * the defined user length.
     * @param queue the user's queue
     * @return true if user's queue is full, otherwise false
     */
    private static boolean isFull(int[] queue) {   
        if (queue.length > length) {
            /** Change value of tail to 1 since there is no space left */
            tail = 1;
            return true;
        }
        return false;
    }



    /**
     * Inserting elements at the rear of queue.
     * @param element to insert of type int
     * @param queue the declared user's queue to use from
     * @return user's queue with the most recently inserted element
     */
    private static int[] enqueue(int element, int[] queue) {
        if((isFull(queue)) && isEmpty()) {
            queue[tail+length] = element;
            head = queue[tail];
            tail = -1;
        } else {
            System.out.println("Queue is full! Cannot insert elements.");
            return new int[0];
        }
        return queue;
    }



    private static void dequeue(int element){
        /**
         * @todo - February 18, 2024
         * - Research and implement the basic dequeue operation
         */
    }



    public static void main(String[] args) { 
        enqueue(3, myQueue);
        enqueue(6, myQueue);
        enqueue(9, myQueue);

        /**
         * Check the user queue here
         */
        System.out.println("Maximum length of the queue: " + length);
        System.out.println(myQueue[head]);
        System.out.println(myQueue[tail+length]);
    }
    
}

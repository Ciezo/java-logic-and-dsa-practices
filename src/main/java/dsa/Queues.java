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
 *  <li>isEmpty - checks if the queue is empty</li>
 *  <li>isFull - checks if the queue is full</li>
 *  <li>front or peek - returns the value from the front of the queue</li>
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
 * https://www.freecodecamp.org/news/queue-data-structure-definition-and-java-example-code/
 */
package main.java.dsa;

public class Queues {

    private static int SIZE = 10;
    private static int front = -1;
    private static int rear = -1;
    private static int[] myQueue = new int[SIZE]; 


    private static boolean isEmpty() {
        return false;
    }

    private static boolean isFull() {   
        return false;
    }

    private static int peek(int[] queue) {
        return queue[front + 1]; 
    }

    private static void enqueue() {
        
    }


    private static void dequeue(){
        
    }



    public static void main(String[] args) { 
        
    }
    
}

/**
 * @author Cloyd Van Secuya
 * 
 * <p>
 * This exercise will help me to use two stacks and create a queue from that.
 * Given two stacks, <code>StackA</code> and <code>StackB</code>, use
 * their given indices, 0 to 10, to access the respective elements, 
 * and put them into a queue.  
 * </p>
 * 
 * <p>
 * Constraint: 
 * - StackA has size of 5, type int[]  
 * - StackB has size of 5, type int[]
 * - MyQueue has size of 10, type int[]
 * </p>
 * 
 * <p>
 * Example inputs:
 * push(1, StackA)
 * push(2, StackA)
 * push(3, StackA)
 * ... 
 * push(4, StackB)
 * push(5, StackB)
 * push(6, StackB)
 * 
 * ... 
 * 
 * enqueue(1, StackA)
 * enqueue(2, StackA)
 * enqueue(3, StackA)
 * ...
 * </p>
 * 
 * <p>
 * Explanation: 
 * From the example input, we can see StackA and StackB are both used to populate (enqueue) the MyQueue. 
 * Implement this concept or idea as my practice.
 * </p>
 */
package main.java.logic;

import java.util.Random;

/**
 * Question 12:
 * Implement a queue using two stacks.
 */

import main.java.dsa.utils.Stack;

public class QueueUsingTwoStacks {

    private static int[] STACK_A = new int[5];
    private static int[] STACK_B = new int[5];
    private static int STACK_SIZE_A = 5;
    private static int STACK_SIZE_B = 5;

    private static int QUEUE_SIZE = 10;
    private static int front = -1;      // front of the queue (index 0, where -1 + 1 = 0) 
    private static int back = -1;       // back of the queue (a.k.a as tail)
    private static int[] queue = new int[QUEUE_SIZE];

    /**
     * @return 5 numbers of <int> type as data elements to use
     */
    private static int[] data() {
        Random r = new Random();
        // limit the number of data inputs to 5 only
        int[] dataToReturn = new int[5]; 
        for(int i = 0; i < 5; i++) {
            dataToReturn[i] = Math.abs(r.nextInt(100));
        }
        // Once data is populated we return
        return dataToReturn;
    }

    /**
     * Checks if the queue is empty meaning both 
     * front and back points are at initial values of -1 
     * @return true if empty, otherwise false.
     */
    private static boolean isEmpty() {
        // The queue is empty if both front and back are at default values
        // meaning they are -1.
        if(front == -1 && back == -1) {
            return true;
        } 
        return false;
    }

    /**
     * Checks if the queue is full if we cannot insert elements at the back.
     * @return true if full, otherwise false.
     */
    private static boolean isFull() {
        // The queue is full if an element cannot be inserted at the back.
        // Remember this, a queue is FIFO! And, elements are always inserted at the back
        // while elements the front are first to be removed
        if(back == QUEUE_SIZE - 1) {
            return true;
        } 
        return false;
    }

    /**
     * Print out the queue
     */
    public static void display() {
        if(isEmpty()) {
            System.out.println("No items to display!");
        } else {    
            for(int i = 0; i <= back; i++) {
                System.out.print(queue[i] + " ");
            }
        }
        
    }

    /**
     * Insert an element at the back (-1) of the queue.  
     * @param queue an array to store the queue
     * @param element of type int
     */
    private static void enqueue(int element) {
        if(isEmpty()) {
            // Set both front and back pointers to 
            // point at the current element
            back = 0;
            front = 0;  
            queue[back] = element;
        } else if(isFull()) {
            System.out.println("Queue is full");
        } 
        /** If the queue is not empty then, 
         * simply keep inserting elements at the back */
        else {
            // Increase space at the back 
            // to make room for more elements to be inserted
            back++; 
            queue[back] = element;
            System.out.println("Back: " + queue[back]);

            front = 0;      // keep pointing to the first index
            System.out.println("Front: " + queue[front]);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Stack s; 
        int[] elem = data();

        // Push elements to Stack A
        s = new Stack(STACK_SIZE_A);
        for(int i = 0; i < STACK_SIZE_A; i++) {
            s.push(elem[i], STACK_A);
        }
        
        // Push elements to Stack B
        elem = data();
        s = new Stack(STACK_SIZE_B);
        for(int i = 0; i < STACK_SIZE_B; i++) {
            s.push(elem[i], STACK_B);
        }

        // Display the outputs
        // Stack A
        s.display(STACK_A);
        // Stack B
        s.display(STACK_B);

        /**
         * Display the queue made from Stack A and Stack B
         */
        System.out.println("Creating a queue from Stack A");
        for(int i = 0; i < STACK_A.length; i++) {
            enqueue(STACK_A[i]);
        }

        Thread.sleep(1000);

        System.out.println("Checking queue made from Stack A");
        display();


        Thread.sleep(1000);

        System.out.println("Creating a queue from Stack B");
        for(int i = 0; i < STACK_A.length; i++) {
            enqueue(STACK_B[i]);
        }

        Thread.sleep(1000);

        System.out.println("Final Queue"); 
        display();
    }
}
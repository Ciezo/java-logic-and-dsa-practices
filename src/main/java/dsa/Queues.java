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
    private static int front = -1;          // this pointer always update to assume the position of the most recent element at index 0
    private static int rear = -1;           // this pointer always follow the elements at the end of the queue
    private static int[] myQueue = new int[SIZE]; 


    private static boolean isEmpty() {
        // Returns true when the pointers are set to 
        // their defaults, -1
        if(front == -1 && rear == -1) {
            return true; 
        } else {
            // otherwise, if front and rear 
            // values are updated, then 
            // we return false
            return false;
        }
    }

    private static boolean isFull() {   
        // Always subtract to the size -1 to 
        // avoid IndexOutOfBoundsException
        if(rear == SIZE - 1) {
            return true; 
        } else {
            return false;
        }
    }

    private static int peek(int[] queue) {
        // This suffices because we just to get 
        // the first element, at index 0
        return queue[front + 1]; 
    }

    private static void enqueue(int element) {
        if(isFull()) {
            System.out.println("Queue is full");
        } else if(front == -1 && rear == -1) {
            // Pupunta dito yung condition kapag
            // no values yung front and rear pointers
            // meaning our user's queue is empty
            System.out.println("User queue is empty!");
            /** Set the these pointers to 0 */
            front = 0; rear = 0; // ready to insert element at the queue
            myQueue[rear] = element; // insert the element at the rear
        } else {
            // Pupunta naman dito yung condition kapag 
            // may laman na yung front pointer 
            // and kailangan maglagay ng value sa likod
            rear++; //increment the rear to make space for the latest value
            myQueue[rear] = element; 
        }
    }


    private static void dequeue(){
        if(isEmpty()) {
            System.out.println("Queue is empty!");
        } else if(front == rear) {
            // if there is nothing to delete reset 
            // the pointers back to defaults
            front = -1; rear = -1;
        } else {
            // otherwise, we move the front pointer 
            // forward to do FIFO sequence
            front++;
        }
    }


    public static void display() {
        if(isEmpty()) {
            System.out.println("No items to display!");
        } else {    
            for(int i = 0; i <= rear; i++) {
                System.out.println(myQueue[i]);

            }
        }
        
    }



    public static void main(String[] args) { 
        enqueue(2);
        enqueue(4);
        enqueue(6);
        enqueue(8);
        enqueue(10);
    
        display();
    
    }
    
}

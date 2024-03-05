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
 * 
 * Input: 
 * enqueue(1)
 * enqueue(2)
 * dequeue()
 * 
 * Output: 
 * Queue: [2]
 */

import main.java.dsa.utils.Stack;

public class QueueUsingTwoStacks {

    private static int[] STACK_A = new int[5];
    private static int[] STACK_B = new int[5];
    private static int STACK_SIZE_A = 5;
    private static int STACK_SIZE_B = 5;

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

    public static void main(String[] args) {
        Stack s; 
        int[] elem = data();

        // Push elements to Stack A
        s = new Stack(STACK_SIZE_A);
        s.push(elem[0], STACK_A);
        s.push(elem[1], STACK_A);
        s.push(elem[2], STACK_A);
        s.push(elem[3], STACK_A);
        s.push(elem[4], STACK_A);
        
        // Push elements to Stack B
        elem = data();
        s = new Stack(STACK_SIZE_B);
        s.push(elem[0], STACK_B);
        s.push(elem[1], STACK_B);
        s.push(elem[2], STACK_B);
        s.push(elem[3], STACK_B);
        s.push(elem[4], STACK_B);

        // Display the outputs
        // Stack A
        s.display(STACK_A);
        // Stack B
        s.display(STACK_B);

        /**
         * @TODO 
         * - Create queue from the two stacks.
         */
    }
}
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

public class QueueUsingTwoStacks {

    private static final int STACK_SIZE_A = 5;
    private static final int STACK_SIZE_B = 5;
    private static int[] stackA = new int[STACK_SIZE_A]; 
    private static int[] stackB = new int[STACK_SIZE_B]; 

    public static void main(String[] args) {
        // Push elements to Stack A
        // Utils.Stack.setStackSize(STACK_SIZE_A);
        // Utils.Stack.push(1, stackA);     
        // Utils.Stack.push(2, stackA);     
        // Utils.Stack.push(3, stackA);     
        // Utils.Stack.push(4, stackA);     
        // Utils.Stack.push(5, stackA);     

        // Utils.Stack.display(stackA);
        
        /**
         * @todo February 29, 2024 
         * - Redesign the Utils.Stack class into OOP 
         */

        // Push elements to Stack B
        // Utils.Stack.setStackSize(STACK_SIZE_B);
        // Utils.Stack.push(6, stackB);     
        // Utils.Stack.push(7, stackB);     
        // Utils.Stack.push(8, stackB);     
        // Utils.Stack.push(9, stackB);     
        // Utils.Stack.push(10, stackB);     
    }
}
/**
 * @author Cloyd Van Secuya
 * 
 * <p>
 * Using the FIFO concept. A good practice for understanding the
 * stack data structure.
 * </p>
 * 
 * @todo Review the concept of Stack Data Structure  
 * - Review the following (again): 
 * 1. LIFO
 *      - Last-In and First-Out. It indicates that in a array or list
 *        This is an implementation of how a stack is followed. 
 *        Any element that is last inserted, would be the first element to be removed from the stack.
 * 
 * <p>
 * Example: 
 * Here is a stack with 4 elements, counting from 3, 2, 1, 0
 * 
 * [3]          // The last element inserted
 * [2]
 * [1]
 * [0]          // The first element inserted
 * 
 * Therefore, the last element inserted, 3, would be the first one to get removed (pop) from the stack
 * 
 * Hence, our new stack now becomes like this after pop(3) 
 * 
 * [2] 
 * [1] 
 * [0]  
 * </p>   
 * 
  * 2. Stack data structure
 *      Follows the LIFO, "Last-In and First-Out"
 *      - What is popping an element to the stack?
 *              - Removing and deleteing an element
 *      - What is pushing an element to the stack?
 *              - Inserting an element to the stack
 * 
 */
package main.java.logic; 

/**
 * Question 4:
 * Implement a stack using arrays or linked lists. Include functions for push, pop, and finding the minimum element in O(1) time.
 * 
 * Input: 
 * push(3)
 * push(5)
 * push(2)
 * pop()
 * getMinimum()
 * 
 * Output: 
 * Stack: [3, 5]
 * Minimum: 3
 */

public class StackUsingArrayOrLinkedLists {
    
    private static final int MAXSIZE = 7;
    /* This represents empty stack */
    private static int top = -1;
    /* We initialize the stack as a pre-example */
    private static int[] initStack = {2, 4, 6, 19, 38, 1, -2};
    


    private static int isFull() {
        if (top == MAXSIZE) 
            return 1; 

        else 
            return 0;
    }



    private static int push(int elem, int[] stack) {
        if (isFull() != 1) {
            top = top + 1;
            stack[top] = elem;
        } else {
            System.out.println("Stack is now full. Please, try again!");
            return 0;
        }

        return elem;
    }
    

    
    private int pop(int elem, int[] stack) {
        return 0;
    }



    private int getMinimum() {
        return 0; 
    }



    public static void main(String[] args) {
        /* Here is a stack to be configured */
        int[] myStack = new int[MAXSIZE];   
        
    }

}
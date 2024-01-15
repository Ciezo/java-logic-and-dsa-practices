/**
 * @author Cloyd Van Secuya
 * 
 * <p>
 * Using the LIFO concept. A good practice for understanding the
 * stack data structure.
 * 
 * <b>When we say 'top' in a stack it is the most recent element inserted.</b>
 * </p>
 * 
 * <p>
 * From ChatGPT, 
 * In the context of a stack, the term "top" typically refers to the last element that was inserted or pushed onto the stack. 
 * It's the element that will be removed or popped first when performing a pop operation. 
 * In a Last-In, First-Out (LIFO) data structure like a stack, the last element added is the first one to be removed. 
 * So, when we say "top of the stack," it means the most recently added element.
 * 
 * This is a good review about the terminology 'top'.
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
    /* Here is a stack to be configured */
    private static int[] stack = new int[MAXSIZE];



    private static int isFull() {
        if (top == MAXSIZE) 
            return 1; 

        else 
            return 0;
    }



    private static int push(int elem) {
        if (isFull() != 1) {
            top = top + 1;
            stack[top] = elem;
        } else {
            System.out.println("Stack is now full. Please, try again!");
            return 0;
        }

        return elem;
    }
    

    
    private int pop() {
        if (isFull() != 1) {
            top = top + 1;
        } else {
            System.out.println("Stack is empty. Cannot remove elements!");
            return 0;
        }
        
        return 0;
    }



    private int getMinimum() {
        return 0; 
    }



    public static void main(String[] args) {
        System.out.println("Inserting elements into the stack..");
        
        push(3);
        push(5);
        push(2);

        System.out.println("Displaying the stack");
        System.out.print("Stack [");
        for(int i = 0; i < MAXSIZE; i++) {
            System.out.print(stack[i] + ", ");
        }
        System.out.print("]");

    }

}
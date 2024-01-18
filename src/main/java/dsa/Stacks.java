/**
 * @author Cloyd Van Secuya
 * 
 * <p>
 * A <b>stack</b> is a linear data structure where insertions and deletions 
 * are only done at the end of the stack, called "top of the stack".
 * </p>
 * 
 * <p>
 * There are many operations in a stack. 
 * First, primary operations, which includes the following: 
 * 1. push(data)
 * - Allows us to <b>insert</b> data onto the stack.
 * 
 * 2. pop()
 * - Allows us to <b>delete</b> data in the stack from the most recently inserted element
 * 
 * Examples: 
 * push(3)
 * push(2)
 * push(1)
 * 
 * Therefore, it would look like this in an array...
 * 
 * int[] stack = {3, 2, 1}
 * 
 * where elements, 
 * top = 3
 * bottom = 1
 * </p>
 * 
 * <p>
 * Secondary operations in a stack.
 * 1. top() returns the most recently inserted element without removing it
 * 2. size() returns the size or capacity of the stack 
 * 3. isEmpty() returns true if the stack is empty, otherwise false
 * 4. isFull() returns true if the stack is full, otherwise false
 * </p>
 */
package main.java.dsa;

public class Stacks {
    
    /**
     * This will hold the stack with an assign value from the main()
     */
    private static int[] stack; 
    /* Top pointer where -1 also represents the bottom */
    private static int top = -1;
    /* I decided to make it final so we have a fix capacity of the stack to avoid stack overflow */
    private static final int MAXSIZE = 10;


    private static int push(int data, int[] stack) {
        // First, check if the stack is full
        boolean isStackfull = isFull(stack);
        if (!(isStackfull)) {
            // If not full, then we can begin inserting data
            top = top + 1;      // Make it to 0 as most recently inserted element
            stack[top] = data;
        } else {
            // Otherwise, prompt the user to say stack is full
            System.out.println("Stack is now full! \n Please, try again!");
        } 
        
        
        return data; 
    }



    private static int pop(int[] stack) {
        /**
         * @todo I still don't know what is the best way 
         * to remove an element from the stack without
         * using 0 as substitute.
         */
        return 0;
    }



    private static int top(int[] stack) {
        return stack[0]; 
    }



    private static boolean isFull(int[] stack) {
        int capacity = size(stack); 
        if (capacity == MAXSIZE) {
            return true; 
        } else {
            return false; 
        }
    }
    


    private static boolean isEmpty(int[] stack) {
        int capacity = stack.length; 
        if (capacity == 0 || capacity < 0) {
            return true;
        } else {
            return false;
        }
    }



    private static int size(int[] stack) {
        int capacity = stack.length; 
        return capacity;  
    }
    


    public static void main(String[] args) {

    }

}

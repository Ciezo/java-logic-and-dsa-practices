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
    
    /* I decided to make it final so we have a fix capacity of the stack to avoid stack overflow */
    private static final int MAXSIZE = 10;
    /**
     * This will hold the stack with an assign value from the main()
     */
    private static int[] stack = new int[MAXSIZE]; 
    /* Top pointer where -1 also represents the bottom */
    private static int top = -1;


    /**
     * Push elements in the empty stack
     * @param data or element to use in populating the empty stack
     * @param stack an array of empty stack
     * @return most recent or top element in the stack
     */
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



    /**
     * Remove an element from the stack by subsituting 0
     * @param stack of an array type
     * @return data or element removed
     */
    private static int pop(int[] stack) {
        /**
         * @todo I still don't know what is the best way 
         * to remove an element from the stack without
         * using 0 as substitute.
         */
        int substituteData = 0;
        boolean isStackEmpty = isEmpty(stack);
        if(!(isStackEmpty)) {
            /**
             * Remember that to define the most recently inserted element
             * using top variable, it should be assigned as,
             * top = -1
             * where, -1, indicates the most recently inserted element
             */
            // Get to the recently inserted element
            stack[top] = substituteData;
            return substituteData;
        } else { 
            System.out.println("Stack is empty! Cannot perform pop()");
            return 0;
        }
    }


    /**
     * Get the most recently inserted element, top, in the stack
     * @param stack of array type
     * @return top element of type int
     */
    private static int peek(int[] stack) {
        /**
         * Before returning the topmost element.
         * I must check the stack if it is empty
         */
        boolean isStackEmpty = isEmpty(stack);
        if(!(isStackEmpty)) {
            return stack[top]; 
        } else {
            System.out.println("Stack is empty! \n Cannot return topmost element");
            return 0;
        }
    }



    /**
     * Check the stack if it is full
     * @param stack a populated or empty stack
     * @return true if stack is full, otherwise false if not.
     */
    private static boolean isFull(int[] stack) {
        int capacity = size(stack); 
        if (capacity > MAXSIZE) {
            return true; 
        } else {
            return false; 
        }
    }
    


    /**
     * Checks if the stack is empty or null
     * @param stack of an array type
     * @return true if the given stack is empty, otherwise false if not
     */
    private static boolean isEmpty(int[] stack) {
        int capacity = stack.length; 
        if (capacity == 0 || capacity < 0) {
            return true;
        } else {
            return false;
        }
    }


    /**
     * This method has tight-coupling with isFull(int[] stack)
     * because it simply returns the capacity of the stack for better 
     * readability and simple abstraction
     * @param stack 
     * @return capacity or size of the stack
     */
    private static int size(int[] stack) {
        int capacity = stack.length; 
        return capacity;  
    }
    


    public static void main(String[] args) {
        /**
         * Inserting data into the stack.
            The instance variable, stack, is a member of this class
         */
        // Insert data here....
        push(2, stack);
        push(3, stack);
        push(4, stack);
        push(5, stack);
        push(6, stack);
        // Insert data here....


        /* Check the contents of the stack */
        // I will just use a simple for-loop since 
        // I implemented a stack here using arrays
        for(int i = 0; i < MAXSIZE; i++) {
            System.out.println("Stack: " + stack[i] + " at index " + i);
        }

        System.out.println("\n\nChecking top using peek()");
        int getTopMostElement = peek(stack);
        System.out.println("Most recently inserted element: " + getTopMostElement);
        
        System.out.println("\n\nPopping...");
        pop(stack);

        System.out.println("Checking stack after pop()");
        for(int i = 0; i < MAXSIZE; i++) {
            System.out.println("Stack after pop: " + stack[i] + " at index " + i);
        }
        
    }

}

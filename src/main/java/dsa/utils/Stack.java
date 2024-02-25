package main.java.dsa.utils;

public class Stack {
        
    /* MAXSIZE is declared as part of a Stack object */
    private int MAXSIZE;
    /* Represents the "pointer" of our most recently inserted element */
    private int top = -1;


    public Stack(int MAXSIZE) {
        this.MAXSIZE = MAXSIZE;
    }
 

    /**
     * Push elements in the empty stack
     * @param data or element to use in populating the empty stack
     * @param stack an array of empty stack
     * @return most recent or top element in the stack
     */
    public int push(int data, int[] stack) {
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
    public int pop(int[] stack) {
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
    public int peek(int[] stack) {
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
    public boolean isFull(int[] stack) {
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
    public boolean isEmpty(int[] stack) {
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
    public int size(int[] stack) {
        int capacity = stack.length; 
        return capacity;  
    }



    /**
     * Prints out the stack into the console
     * @param stack of type int[] 
     */
    public void display(int[] stack) {
        System.out.println("Stack elements: ");
        for(int elem : stack) {
            System.out.println(elem);
        }
    }
}

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
     * Using arrays to represent a stack
     */
    private static int[] stack; 
    /* Top pointer where -1 also represents the bottom */
    private static int top = -1;



    private static int push(int data, int[] stack) {
        return data; 
    }



    private static int pop(int[] stack) {
        return 0;
    }



    private static int top(int[] stack) {
        return 0;
    }



    private static boolean isFull(int[] stack) {
        return false; 
    }
    


    private static boolean isEmpty(int[] stack) {
        return false;
    }



    private static int size(int[] stack) {
        return 0; 
    }
    


    public static void main(String[] args) {
            
    }

}

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
    

    
    private static int pop() {
        /**
         * @todo Fix pop operation.
         * We cannot simply replace the element to be removed to 0
         * That is invalid 😭
         * I learned that now.
         * 
         * To further understand, it is much better to delete 
         * the recently inserted element from the stack. We 
         * cannot simply just replace it with 0, otherwise, that is
         * not truly "deleted", but replaced with a value 0
         */
        // int data = 0; 
        if (isFull() != 1) {
            // stack[top] = data;
            int data = stack[top];          // This is a fix for now?
            top = top - 1;
            return data;
        } else {
            System.out.println("Stack is empty. Cannot remove elements!");
            return 0;
        }
    }



    /**
     * 
     * This is another overload method of pop() where we are 
     * passsing an array represented as stack.
     * @param stack
     * @return element
     * @example pop(initStack)
     * This should remove the last element -2
     */
    private static int pop(int[] stack) {
        /**
         * @todo Fix this.
         */
        // Check if the stack contains at least one element
        int length = stack.length;
        int data = 0; 
        if(length == 0) {
            System.out.println("Stack is empty. Cannot remove elements!");
            return 0;
        } else {
            /**
             * @todo Fix this. It replaces all the elements of the stack to 0 😂
             */
            for (int i = length - 1; i >= 0; i--) {
                stack[i] = data;
            }
        }
        
        return data;
    }



    private static int getMinimum(int[] stack) {
        int data = 0; 
        // First, scan the stack to see if there are any elements from 0 to n
        // which are of lowest against each other
        /* A nested for loop is needed for this */
        for(int i = 0; i < stack.length; i++) {
            for(int j = 0; j < i; j++) {
                /**
                 * Now, it is necessary to begin comparing 
                 * each elem such that,
                 * i = i
                 * j = i + 1
                 * through this we can begin comparing all 
                 * respective elements
                 */
                if (stack[i] < stack[j]) {
                    System.out.println("Comparing i to j ");
                    System.out.println(stack[i] + " vs " + stack[j]);
                    data = stack[i];
                } else if (stack[j] < stack[i]) {
                    System.out.println("Comparing j to i");
                    System.out.println(stack[j] + " vs " + stack[i]);
                    data = stack[j];
                }
            }
        }
        
        return data; 
    }



    public static void main(String[] args) throws InterruptedException {
        System.out.println("Inserting elements into the stack..");
        
        push(3);
        push(5);
        push(2);
        push(28);
        push(69);
        push(1);
        push(6);

        System.out.println("Displaying the stack");
        System.out.print("Stack [");
        for(int i = 0; i < MAXSIZE; i++) {
            System.out.print(stack[i] + ", ");
        }
        System.out.print("]\n");
        
        System.out.println("Popping...");
        
        Thread.sleep(1000);
        
        pop();
        
        System.out.println("Displaying the stack after pop");
        System.out.print("Stack [");
        for(int i = 0; i < MAXSIZE; i++) {
            System.out.print(stack[i] + ", ");
        }
        System.out.print("]\n");


        // Thread.sleep(1000);

        // System.out.println("Using overloadded pop(int[] stack)");
        // pop(initStack);

        // System.out.println("Displaying the initialized stack...after pop(int[] stack)");

        // for(int i = 0; i < initStack.length; i++) {
        //     System.out.println(initStack[i]);
        // }

        Thread.sleep(1000);

        System.out.println("Getting minimum...");
        int min = getMinimum(stack);
        System.out.println("Minimum value at stack: " + min);
        
    }

}
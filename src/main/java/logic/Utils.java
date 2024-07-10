package main.java.logic;

public class Utils {

    /**
     * Checks if an integer array is empty 
     * @param array an array of integer type
     * @return true if the array has elements, otherwise false
     */
    public static boolean checkArray(int[] array) {
        int length = array.length;
        if (length < 1) 
            return false;
        
        return true;
    }

    /**
     * This is used in BinarySearchAlgorithmForSortedArray.java
     * It works!
     * @param array the unsorted array to sort
     * @return sorted array in ascending order
     */
    public static int[] sortArray(int[] array) {
        int length = array.length;
        /** I cloned the array to perform minimal changes to the param passed */
        int[] sortedArr = array.clone(); 
        for(int i = 0; i < length; i++) {
            for(int j = i + 1; j < length; j++) {
                // Check and compare individual elements 
                if(sortedArr[i] > sortedArr[j]) {
                    /* Create a temp variable to contain the said element to swap */
                    int temp = sortedArr[i];                // key from index i, assign to temp
                    sortedArr[i] = sortedArr[j];            // key from j assign to array of index i
                    sortedArr[j] = temp;                    // value from temp assign to index of j 
                }
            }
        }
        return sortedArr;
    }

    /**
     * @note We cannot use a starting element beyond 2
     * @param startElement this acts as a "starting point" for the fibonacci series to generate from 
     * @return int[] fibonacciSeries
     * @example fibonacci(2)
     *          Output: 2, 3, 5, 8, 13....
     */
    public static int[] fibonacci(int startElement, int SIZE) {
        // Input validation 
        /* Constraint: n >= 0 <= 2 */
        if(startElement < 0 || startElement > 2) {
            System.out.println("Invalid starting element!");
            System.out.println("Please, enter 0 to 2!");
            return new int[0];
        }

        int[] tempFib = new int[SIZE];

        tempFib[0] = startElement;  
        tempFib[1] = tempFib[0] + 1;  
        for(int i = 2; i < SIZE-1; i++) {
            tempFib[i] = tempFib[i-1] + tempFib[i-2];
        }
            
        return tempFib;
    }

    /**
     * Populate the two dimensional array using a one dimensional array
     * @param twoDimArray the empty 2D array
     * @param values the single-dimensional array to be used to populate the empty 2D array
     * @return populated two dimensional array
     */
    public static int[][] populateMatrix(int rows, int columns, int[][] twoDimArray, int[] values) {
        int counter = 0; 
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                twoDimArray[i][j] = values[counter];
                counter++;
                if(counter == values.length) break;
            }
        }
        return twoDimArray;
    }


    public class Stack {

        /**
         * @note To use this Class the size of the stack must be 
         * declared first using {@link #setStackSize(int MAXSIZE)}
         */    
        
        /* MAXSIZE is declared as part of a Stack object */
        private static int MAXSIZE;
        /* Represents the "pointer" of our most recently inserted element */
        private static int top = -1;



        /**
         * Set a MAXSIZE for the stack
         * @param MAXSIZE
         */
        public static void setStackSize(int MAXSIZE) {
            Stack.MAXSIZE = MAXSIZE;
        }



        /**
         * Push elements in the empty stack
         * @param data or element to use in populating the empty stack
         * @param stack an array of empty stack
         * @return most recent or top element in the stack
         */
        public static int push(int data, int[] stack) {
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
        public static int pop(int[] stack) {
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
        public static int peek(int[] stack) {
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
        public static boolean isFull(int[] stack) {
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
        public static boolean isEmpty(int[] stack) {
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
        public static int size(int[] stack) {
            int capacity = stack.length; 
            return capacity;  
        }

        /**
         * Prints out the stack into the console
         * @param stack of type int[] 
         */
        public static void display(int[] stack) {
            System.out.println("Stack elements: ");
            for(int elem : stack) {
                System.out.println(elem);
            }
        }
    }
}

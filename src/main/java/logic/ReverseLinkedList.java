/**
 * @author Cloyd Van Secuya
 * 
 * <p>
 * What is a Linked List? 
 * 
 * A <b>Linked List</b> is a data structure which is like an array
 * but without a definite size. 
 * </p>
 * 
 * <p>
 * With Linked List, we can <i>dynamically</i> add elements  
 * which helps us understand that this data structure can grow 
 * with no definite size  
 * </p>
 * 
 * > A linked list is a <b>linear data structure</b>, in which the elements 
 * > are not stored at contiguous memory locations.
 * > <i>Reference: https://www.geeksforgeeks.org/data-structures/linked-list/ </i>
 * 
 * <p>
 * Now, we can understand that a linked list can be used
 * to assign different values in memory locations. 
 * </p>
 *
 * <p>
 * What are the different types of Linked List?
 * 
 * <ol>
 *  <li>Singly Linked List</li>
 *  <li>Doubly Linked List</li>
 *  <li>Circular Linked List</li>
 *  <li>Circular Doubly Linked List</li>
 *  <li>Header Linked List</li>
 * </ol>
 * </p>
 * 
 * <p>
 * How can we create Linked List?
 * 
 * <code>LinkedList<Type> linkedList = new LinkedList<>();</code>
 * </p>
 * 
 * 
 * <p>
 * For this program, I will be using Integer Linked List so, I can
 * create follow the requirement.
 * </p> 
 * 
 */
package main.java.logic; 

/**
 * Question 7:
 * Given a linked list, write a function to reverse it.
 * 
 * Input: 
 * Linked List: 1 -> 2 -> 3 -> 4 -> 5
 * 
 * Output: 
 * Linked List: 5 -> 4 -> 3 -> 2 -> 1
 */


import java.util.LinkedList;

public class ReverseLinkedList {

    private static LinkedList<Integer> linkedList = new LinkedList<>();

    public static void main(String[] args) {
        /* Use an array of integers to pass the input required */
        int[] input = {1, 2, 3, 4, 5};
        
        /**
         * Then, we proceed to loop through that array then
         * we add each element accordingly to our linked list
         */
        System.out.println("Adding inputs to the linked list....");
        for(int i = 0; i < input.length; i++) {
            linkedList.add(input[i]);
        }
        /* Output and check */
        System.out.println("Checking linked list...");
        for(int j = 0; j < linkedList.size(); j++) {
            System.out.println(linkedList.get(j));
        }
        
    }
}
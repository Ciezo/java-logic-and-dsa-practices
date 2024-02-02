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
 * 
 * <p>
 * Take note that it is <b>better to use the enhanced for-loop</b> (a.k.a for-each loop)
 * <b>for better readability</b>
 * </p>
 * 
 * <p>
 * <b>Important reminders about LinkedList:</b>
 * Indices for a linked list are 0-based. It starts from <code> 0 to size() - 1 </code> 
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



    /**
     * This method is a void type because I simply want to output
     * the passed argument as the exercise says so.
     * @param ll A type LinkedList<Integer> 
     * @note This uses traditional for-loop because I believe it can be the 
     * best use for this scenario
     */
    private static void reverseLinklist(LinkedList<Integer> ll) {
        int length = ll.size();
        // Remember that indices for a LinkedList is 0 based
        for(int i = length - 1; i >= 0; i--) {
            System.out.println(ll.get(i));
        }
    }



    public static void main(String[] args) {
        /* Use an array of integers to pass the input required */
        int[] input = {1, 2, 3, 4, 5};
        
        /**
         * Instead of using traditional for-loops. 
         * It is better to use for-each loop.
         * <i>for-each</i> loop is the enhanced version of traditional for loop
         */
        System.out.println("Populating the linked list....");
        for(Integer num : input){
            linkedList.add(num);
        }

        /* Output and check */
        for(Integer output : linkedList) {
            System.out.println(output);
        }

        /* Begin reversing the output by calling the function here */
        System.out.println("Reversing the linked list");
        reverseLinklist(linkedList);
    }
}
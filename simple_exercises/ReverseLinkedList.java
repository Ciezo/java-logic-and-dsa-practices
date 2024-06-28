package simple_exercises;


import java.util.LinkedList;
import java.util.Random;

public class ReverseLinkedList {


    /**
     * Populate the linked list up to 10 items
     * @return LinkedList<Integer> with 10 random values 
     */
    public static LinkedList<Integer> populateLinkedList() {
        LinkedList<Integer> resultSet = new LinkedList<>();
        /** Get the random class to assign different values to the LinkedList */
        Random rand = new Random();
        int size = 10;
        for (int i = 0; i < size; i++) {
            resultSet.add(rand.nextInt(1000));
        }
        
        return resultSet;
    }



    /**
     * Reverse a LinkedList<Integer> by iterating backwards and assigning it to the result set
     * @param ll an Integer of type LinkedList to reverse
     * @return a reverse LinkedList<Integer> 
     */
    public static LinkedList<Integer> reverseLinkedList(LinkedList<Integer> ll) {
        LinkedList<Integer> reversedLinkedList = new LinkedList<>();

        // To reverse this list, I must traverse at the end of the 
        // LinkedList, or scan backwards then, I will iterate from
        // the tail of the list to get each item. 
        // And, assign them to the variable

        int size = ll.size();
        for (int i = (size-1); i >= 0 ; i--) {
            reversedLinkedList.add( ll.get(i) );
        }
        
        return reversedLinkedList;
    }



    /**
     * A generic method to display any type of LinkedList<T>
     * @param <T> Accepts any data type, but must be a wrapper class
     * @param ll A LinkedList<T> of any data type
     */
    public static <T> void displayItems(LinkedList<T> ll) {
        for (T items : ll) {
            System.out.print(items + " ");
        }
    }



    public static void main(String[] args) {
        
        LinkedList<Integer> num_ls = new LinkedList<>();
        LinkedList<Integer> reverse_ls = new LinkedList<>();
        
        num_ls = populateLinkedList();
        reverse_ls = reverseLinkedList(num_ls);
        
        System.out.println("Initial: ");
        displayItems(num_ls);

        System.out.println();

        System.out.println("Reversed List: ");
        displayItems(reverse_ls);


    }
}

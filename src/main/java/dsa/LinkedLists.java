/**
 * @author Cloyd Van Secuya
 * 
 * <p>
 * The <b>LinkedList</b> implements the List interface which allows us to 
 * add items, change items, and remove items. 
 * </p>
 * 
 * <p>
 * The <b>LinkedList</b> class is different with the ArrayList class 
 * because items or values are stored in "containers".
 * 
 * In a linked list, we have a "head" - a starting point of the LinkedList, while 
 * the "tail" - an end point of the LinkedList. Both head and tail contain items or values.
 * Moreover, the list has a link to the first container, and each container
 * has a link to the next container in the list. 
 * </p>
 * 
 * <p>
 * References:
 * https://www.w3schools.com/java/java_linkedlist.asp 
 * https://www.freecodecamp.org/news/how-linked-lists-work/#:~:text=The%20first%20node%20of%20the,always%20points%20to%20the%20null%20. 
 * </p>
 */
package main.java.dsa;

import java.util.LinkedList;

public class LinkedLists {

    /**
     * A generic method to populate a LinkedList object with any Type
     * @param <T> Accepts any data type, but must not be primitive
     * @param ll LinkedList object to populate of any type
     * @param data An Array of data with any data type
     */
    private static <T> void populateData(LinkedList<T> ll, T[] data) {
        for (T item : data) {
            ll.add(item);
        }
    }

    /**
     * Prints out items or values from a LinkedList of any Type.
     * @param <T> Accepts any data type, but must not be primitive
     * @param ll LinkedList object to populate of any type
     */
    private static <T> void displayItems(LinkedList<T> ll) {
        for (T item : ll) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        /*
         * This thread helped me understand Generic types <?> in Java
         * https://stackoverflow.com/questions/9921676/what-does-class-mean-in-java
         * 
         * While this thread helped me understand how to use Generic types T for declaring arrays
         * ``` T[] array ```
         * 
         * https://stackoverflow.com/questions/23793224/how-can-i-make-a-method-take-an-array-of-any-type-as-a-parameter 
         */


        LinkedList<String> foods = new LinkedList<>();
        LinkedList<Integer> numbers = new LinkedList<>();

        /**
         * > Use generics
         * ```
         * public <T>void foo(T[] array) {
         *      System.out.println(array.length); 
         * }
         * ```
         * > This will not work for array of primitive types, such as int[], boolean[], double[],... 
         * You have to use their class wrappers instead: Integer[], Boolean[], Double[], ... 
         * or overload your method for each needed primitive type separately.
         */
        String[] foodsItems = {"Chicken", "Red Meat", "Eggs"};
        populateData(foods, foodsItems);

        Integer[] numberItems = {1, 2, 3, 4, 5, 6, 7, 8};
        populateData(numbers, numberItems);

        displayItems(numbers);
        displayItems(foods);
    }

}

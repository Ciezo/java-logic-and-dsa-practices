/**
 * @author Cloyd Van Secuya
 * 
 * <p>
 * An <b>ArrayList</b> is a class which has a resizable array. This class 
 * allows us to dynamically insert or update the elements inside a 
 * defined array with no limits to its intended size.
 * </p>
 * 
 * <p>
 * The size of an array, such as, int[] arr = new int[5], is that it has 
 * a DEFINITE size. Hence, there are limitations for this such as a need to
 * create a new array if a previous array is already full.
 * </p>
 * 
 * <p>
 * The ArrayList class is different from the LinkedList class since ArrayList
 * uses array to contain elements, and all values are accessed through an
 * index.
 * </p>
 * 
 * <p>
 * References:
 * https://www.w3schools.com/java/java_arraylist.asp 
 * </p>
 */
package main.java.dsa;

import java.util.ArrayList;

public class ArrayLists {

    private static ArrayList<Integer> phoneNumbers = new ArrayList<>();

    /* Challenge: 
     * You are tasked with creating a phone number management system using an ArrayList. Here are the requirements:
     *      1. Add Phone Numbers: Implement a method that allows adding phone numbers to the list. 
     *         The method should take an integer (representing a phone number) as an argument and add it to the phoneNumbers list.
     * 
     *      2. Remove Phone Numbers: Create another method to remove a phone number from the list. 
     *         The method should take an integer (the phone number to be removed) and delete it from the list.
     *      
     *      3. Check if a Phone Number Exists: Implement a method that checks whether a given phone number exists in the list. 
     *         The method should take an integer (the phone number to check) and return true if it’s in the list, or false otherwise.
     * 
     *      4. Print All Phone Numbers: Write a method that prints all the phone numbers currently stored in the phoneNumbers list.
     */

    /**
     * Allows to add phone number to the list, phoneNumbers : ArrayList<Integer>
     * @param phoneNumber
     */
    private static void addPhoneNumber(int phoneNumber) {
        // Validate if the phoneNumber is of type int
        if(!(phoneNumber == (int) phoneNumber)) 
            System.out.println("Please, enter a valid number. It must be type int");

        // Validate if the entry is a duplicate.
        // This ensures that all phone entries are unique
        if(!(isDuplicate(phoneNumber))) {
            System.out.println("Adding phone number: " + phoneNumber);
            phoneNumbers.add(phoneNumber);
        } else System.out.println("The phone number, " + phoneNumber + " already exists!");
        
    }



    /**
     * Checks if there is a duplicate phone number. 
     * This allows the phone directory to have unique entries. 
     * @return true if there is a duplicate found, otherwise false.
     */
    private static boolean isDuplicate(int phoneNumber) {
        return phoneNumbers.contains(phoneNumber);
    }



    /**
     * Checks if a phone number exists in the list
     * @param phoneNumber
     * @return true if a phone number is found, otherwise false
     */
    private static boolean isPhoneNumberExist(int phoneNumber) {
        boolean flag = false;
        int length = phoneNumbers.size();

        for(int i = 0; i < length; i++) {
            if(phoneNumber == phoneNumbers.get(i)) {
                flag = true;
            }
        }
        
        return flag;
    }



    /**
     * Deletes a phone number, but must first check if it exists in the list
     * @param phoneNumber
     */
    private static void deletePhoneNumber(int phoneNumber) {
        int indexToRemove = phoneNumbers.indexOf(phoneNumber);

        if(indexToRemove != -1) {
            phoneNumbers.remove(indexToRemove);
            System.out.println("Deleting phone number: " + phoneNumber);
        } else {
            System.out.println("The phone number to remove, " + phoneNumber + " from the directory does not exist");
        }
    }



    /**
     * Displays all phone nubmers in the given list
     */
    private static void displayAllPhoneNumbers() {
        for(int number : phoneNumbers) {
            System.out.println(number);
        }
    }


    public static void main(String[] args) {
        addPhoneNumber(87000);
        addPhoneNumber(87000);      // This should not be displayed because it is a duplicate
        addPhoneNumber(88085508);
        addPhoneNumber(2445667);

        deletePhoneNumber(2445667);

        displayAllPhoneNumbers();
    }

}

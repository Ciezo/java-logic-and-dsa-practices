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



    /**
     * Allows to add phone number to the list, phoneNumbers : ArrayList<Integer>
     * @param phoneNumber
     */
    private static void addPhoneNumber(int phoneNumber) {
        int temp = phoneNumber; 

        // Validate if the phoneNumber is of type int
        if(!(temp == (int) temp)) 
            System.out.println("Please, enter a valid number. It must be type int");

        // Validate if the entry is a duplicate.
        // This ensures that all phone entries are unique
        if(!(isDuplicate(temp))) {
            System.out.println("Adding phone number: " + temp);
            phoneNumbers.add(temp);
        } else System.out.println("The phone number, " + temp + " already exists!");
        
    }



    /**
     * Checks if there is a duplicate phone number. 
     * This allows the phone directory to have unique entries. 
     * @return false if there are not duplicates found, otherwise true.
     */
    private static boolean isDuplicate(int phoneNumber) {
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
        int numberToRemove = phoneNumber;
        int length = phoneNumbers.size();

        // If the phone number exists, then we can remove it
        if(isPhoneNumberExist(numberToRemove)) {
            for(int i = 0; i < length; i++) {
                if(numberToRemove == phoneNumbers.get(i)) {
                    System.out.println("Deleting phone number: " + numberToRemove);
                    phoneNumbers.remove(i);
                }
            }
        } else System.out.println("The phone number to remove, " + numberToRemove + " from the directory does not exist");
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

/**
 * @author Cloyd Van Secuya
 * 
 * What is a prime number?
 * a whole <b>number greater than 1</b> that <b>cannot be exactly divided</b> by any whole number <b>other than itself</b> 
 * and 1 (e.g. 2, 3, 5, 7, 11).
 * 
 * <p>
 * This Class explores how to write a progam in Java to check if a given number is 
 * prime or not.
 * </p>
 * 
 * <p>
 * This program takes a user input then, it will simply check if it is
 * a prime number through <code>boolean checkIfPrime(int number)</code> method.
 * </p>
 * 
 * <p>
 * Example: 
 *  boolean checkIfPrime(11)
 *      returns true;
 *  boolean checkIfPrime(15)
 *      returns false;
 * </p>
 */
package main.java.logic;

import java.util.Scanner;

/**
 * Question 1:
 * Write a program to check if a given number is a prime number.
 * Input: 
 * 11 
 * 15
 * 
 * Output: 
 * true
 * false
 */
public class CheckPrimeNumber {
    
    private static int number;
    private static boolean flag; 
    private static Scanner sc = new Scanner(System.in);
    
    public static boolean checkIfPrime(int number) {
        if(number <= 1) {
            return false; 
        } else { 
            for (int i = 2; i < number; i++) 
            if (number % i == 0) 
                return false; 
        }

        return true; 
    }
    
    public static void main(String[] args) {
        System.out.println("Enter a number");
        System.out.print(">> ");
        /** Make sure to check the user input */
        if(sc.hasNextInt()) {
            number = sc.nextInt(); 
        } else {
            System.out.println("Your input is wrong! Make sure it is integer! Please, try again!");
        }

        flag = checkIfPrime(number);

        System.out.println("Result: " + flag);
    
    }
}

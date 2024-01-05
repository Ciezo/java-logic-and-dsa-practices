package main.java.logic; 


/** 
 * Question 0: 
 * Write a program that swaps two integers using ONLY two variables
 * 
 * Example: 
 * Input: 
 * x = 10
 * y = 20
 * Output: 
 * x = 20
 * y = 10
 */
public class SwapTwoVariables {
    public static void main(String[] args) {
        int x = 10; 
        int y = 20;

        x = x + y;      // 10 + 20 = x = 30
        y = x - y;      // 30 - 20 = y = 10
        x = x - y;      // 30 - 10 = x = 20

        System.out.println("Final answer: ");
        System.out.println("X: " + x);
        System.out.println("Y: " + y);
    }
}
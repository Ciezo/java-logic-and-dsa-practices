/**
 * @author Cloyd Van Secuya
 * 
 * 
 * <p>
 * XOR (Exclusive OR), also known as bitwise operatior, is a logical operation where
 * if the given input in bits are the same therefore, the output is false (0). Otherwise, it's true (1). 
 * </p>
 */


package main.java.logic;

/** 
 * Question 0: 
 * Write a program that swaps two integers using ONLY two variables
 * 
 * Example: 
 * Input: 
 * x = 10
 * y = 20
 * 
 * Output: 
 * x = 20
 * y = 10
 * 
 */
public class XORSwapVariables {
    
    public static void swapVars(int x, int y) {
        // Use the XOR operation to swap the values
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
    
        System.out.println("Swapped values: \n x = " + x + ", \n y = " + y);
    }
    
    
    public static void main(String[] args) {
        int x = 20;
        int y = 10; 
        
        swapVars(x, y);
    }

}

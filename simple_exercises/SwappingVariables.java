/**
 * @author Cloyd Van Secuya 
 * 
 * <p>
 * Swapping Variables without a third variable 
 * involves the following two processes: 
 * 
 * 1. Using arithmetic operation
 * 2. Using XOR operators
 * </p>
 */
package simple_exercises;


public class SwappingVariables {

    
    /**
     * Use an arithmetic operation to swap the x and y variable
     * @param x a positve or negative integer
     * @param y a positive or negative integer
     * @return resultSet[2], an array of swapped x and y, where resultSet[0] = x and resultSet[1] = y 
     */
    public static int[] swapVariablesUsingArithmetic(int x, int y) {
        int[] resultSet = new int[2];

        x = x + y;              // x = x + y = X > y
        y = x - y;              // y = X - y = Y = x
        x = x - y;              // x = X - Y = X = y
        
        // Assign x and y value to the resultSet
        resultSet[0] = x;
        resultSet[1] = y;

        return resultSet;
    }



    /**
     * Swap variables using XOR operators
     * @param x a positive or negative integer
     * @param y a positive or negative integer
     * @return resultSet[2], an array of swapped x and y, where resultSet[0] = x and resultSet[1] = y 
     */
    public static int[] swapVariablesXOR(int x, int y) {
        int[] resultSet = new int[2];
        
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;

        // Assign x and y value to the resultSet
        resultSet[0] = x;
        resultSet[1] = y;

        return resultSet;
    }



    public static void main(String[] args) {
        int x = -505; 
        int y = 400; 

        int[] result = swapVariablesUsingArithmetic(x, y);

        System.out.println("x = " + result[0]);
        System.out.println("y = " + result[1]);

        x = 200; 
        y = 100;

        result = swapVariablesXOR(x, y);
        System.out.println("x = " + result[0]);
        System.out.println("y = " + result[1]);

    }

}
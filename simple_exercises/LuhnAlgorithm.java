/**
 * @author Cloyd Van Secuya
 * <p>
 * Luhn Algorithm procedure. 
 * 
 * This is a simple program to understand how the validation of credit cards and debit cards number 
 * are checked by banking systems if they are valid or not. 
 * 
 * The Luhn algorithm is a very simple formula which consists of a series of 
 * simple steps in multiplying the second to the last digit by 2 (from the tail) until it reaches the index 0 (or the head).
 * 
 * Once, the doubling operation (multiply by 2) is finished then, the next step is to get all the sum 
 * of all the elements from the input including the results of the previous operation. 
 * 
 * All elements within the list (input) in respective to its index must be added together, however the
 * results from the doubling operation must replace that of the original element in its respective index.
 * </p>
 */
package simple_exercises;

public class LuhnAlgorithm {

    // First, I need to check if the input is an unsigned number
    // Second, I need to check and do the doubling (by multplying to 2) of every second element from the tail.  
    //         If, the result of the doubling operation is greated than 9 therefore, the two resulting digits must be added together to form a single digit.
    // Third, after reaching the head (or index 0) of the input then, I proceed to do a summation of all elements. 
    //        Also, it is important that the results of the doubling operation must be substituted in respective to its original index.
    // Lastly, if the result of the summation is a multiple of 10, where sum % 10 = 0, is true therefore, the input is valid according to Luhn's Algorithm. 


    /**
     * Verifies if the input is a real unsigned number so, 
     * we will not have any negative products during the doubling operation.
     * Lastly, unsigned numbers are much easier to do modules operation. 
     * @param input
     * @return True if the input is usigned. Otherwise, false.
     */
    public static boolean checkIfUnsignedNumber(long input) {
        boolean flag = true; 
        if (input < 0) 
            flag = false;
        return flag;
    }

    /**
     * Convert a string to an integer array
     * @param tempInput the temporary String input to convert into
     * @param size intended size 
     * @return an array of Integer with converted elements 
     */
    public static int[] convertToArray(String tempInput, int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = tempInput.charAt(i) - '0';  
        }
        return arr;
    }

    /**
     * The entire operation for Luhn Algorithm.
     * @param input the number to be checked if it is a multiple of 10 after the entire operation. 
     * @return True if the input is valid according to Luhn's Algorithm. Otherwise, false.
     */
    public static boolean doLuhnAlgorithm(long input) {
        boolean isValid = false;    // flag to determine if result of Luhn's Algorithm is valid or not. 
        int[] elements = {};

        if (checkIfUnsignedNumber(input)) {
            // First, turn the long input to an int[] array 
            String temp = Long.toString(input);             // turn this temporarily to String 
            int tempSize = temp.length();
            elements = convertToArray(temp, tempSize);

            // Begin traversing starting from the tail with 2 steps
            int size = elements.length;
            for (int i = (size - 1); i >= 0; i -= 2) {
                int productRes = elements[i] * 2;
            }

        } else {
            System.out.println("Input is a negative number. Invalid operation!");
        }
        return isValid;

    }

    public static void main(String[] args) {
        long input = 79927398713L;   // valid input according to Luhn's Algorithm
        boolean result = doLuhnAlgorithm(input);
        // System.out.println("Is the input valid according to Luhn's Algorithm? " + result);
    }
}

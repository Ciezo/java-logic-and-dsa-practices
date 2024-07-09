package simple_exercises;

import java.util.Random;

/**
 * A prime number is a number that can only divided by itself 
 * which results to 1, and without remainder
 */
public class CheckIfNumberIsPrime {
    
    /**
     * Check if a given positive integer is a prime number or not
     * @param number a positive integer
     * @return true if the number is a prime, otherwise false
     */
    public static boolean checkPrimeNumber(int number) {
        /*
         * A prime number is true if,
         * number / 1 = 1               ; the number has resulted to 1
         * number / 1 = number          ; the number has resulted to itself
         * number % 2 == 1              ; the number has a remainder is an odd number
         */
        if (number <= 1) {
            return false;
        } else {
            if (number % 2 == 0) 
                return false;
            if (number / 1 == number || number / 1 == 1) 
                return true;

            for(int i = 2; i < number; i++) {
                if (number % i == 0) 
                    return false;
            }
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(Math.abs(100));
        System.out.println("Checking prime number for: " + number);
        System.out.println(checkPrimeNumber(number));
    }
}

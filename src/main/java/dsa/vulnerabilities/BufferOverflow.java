package main.java.dsa.vulnerabilities;

import java.util.Scanner;

/**
 * Simulate a buffer overflow exploit in Java.
 * In here, I am trying to prove that Java is a safer language 
 * than C/C++
 * 
 * 
 * A buffer overflow is occurring when a program writes more than what is 
 * assigned in the buffer memory. 
 * 
 * Example in C++
 * 
 * #include <stdlib>

    int main() 
    {
        char* buffer = (char*)malloc(10);
        // vulnerable strcpy function, no bounds checking
        strcpy(buffer, "Hello, World");
        free(buffer);
        
        return 0;
    }
 */

public class BufferOverflow {

    private static Scanner sc = new Scanner(System.in);
    private static char[] buffer = new char[10];
    private static String input; 
    public static void main(String[] args) throws Exception {
        System.out.println("Enter a sequence....");
        System.out.print(">> ");
        input = sc.nextLine();
        
        
        /**
         * In here, we are testing two scenarios.
         * 
         * Scenario 1: A simple for-loop which scans the 
         * user input to convert and initialize it to our 
         * "simulated buffer" or a.k.a memory.
         * 
         * In this scenario, it is expected that the Java language will
         * throw exception error, if, the input exceeds what is assigned 
         * to our buffer line. And so, it is why Java is safer than C/C++
         * because of its security features like this.
         * 
         * 
         * 
         * 
         * 
         * Scenario 2: Before the for-loop we are now using guard clause 
         * which is a much better implementation since it can check first 
         * the size of the user input before assigning it into our 
         * "simulated memory".
         */
        
        // Uncomment either scenarios to check each case.
        
        // Scenario 1: 
        // for(int i = 0; i < input.length(); i++) {
        //     /**
        //      * @note Here I am trying to simulate the buffer overflow
        //      * If the user has more than 10 characters then the 
        //      * program is expected to stop.
        //      *      The program will say that it is out of bounds...or something
        //      */
        //     buffer[i] = input.charAt(i);

        //     /**
        //      * If the input is within the constraints with the 
        //      * assigned number of characters in memory then, 
        //      * we will simply display it onto terminal
        //      */
        //     System.out.println("Input sequence....");
        //     System.out.print(buffer[i] + " ");
        // }


        // Scenario 2: 
        if (input.length() > buffer.length) {
            System.out.println("You have exceeded the assigned memory!");
            System.out.println("Please, try again!");
        } else {
            for(int i = 0; i < input.length(); i++) {
                /**
                 * @note Here I am trying to simulate the buffer overflow
                 * If the user has more than 10 characters then the 
                 * program is expected to stop.
                 *      The program will say that it is out of bounds...or something
                 */
                buffer[i] = input.charAt(i);

                /**
                 * If the input is within the constraints with the 
                 * assigned number of characters in memory then, 
                 * we will simply display it onto terminal
                 */
                System.out.println("Input sequence....");
                System.out.print(buffer[i] + " ");
            }
        }


    }
}

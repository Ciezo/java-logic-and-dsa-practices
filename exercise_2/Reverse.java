package exercise_2;

public class Reverse {
    /**
     * Write a function reverse() that takes a string as an argument and 
     * returns a string that contains the same sequence of characters as the argument string but in reverse order.
     * 
     * Reference: https://introcs.cs.princeton.edu/java/31datatype/
     */

    public String reverse(String s) {
        // Convert the string into a char array 
        char[] buffer = new char[s.length()];
        
        int counter = 0;    // to place the elements at index 0
        for (int i = (s.length()-1); i >= 0; i--) {
            buffer[counter++] = s.charAt(i);
        }
        
        return String.valueOf(buffer);
    }

    public static void main(String[] args) {
        Reverse re = new Reverse();
        String input = "minecraft";
        String output = re.reverse(input);
        System.out.println(output);
    }
}

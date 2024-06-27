/**
 * @author Cloyd Van Secuya
 * 
 * <p>
 * This programming exercise is very simple as its objective is to 
 * reverse a String value. 
 * </p> 
 * 
 * <p>
 * Example: 
 * Input: Foxtrot
 * Output: tortxoF 
 * </p> 
 */
package simple_exercises;

public class ReverseString {
    

    private static String reverseString(String str) {
        String originalStr = str;
        String reversedStr = "";

        // Create a char array to store the respective 
        // values at each index then, assign into reversed string
        int length = str.length();
        char[] strCharArr = new char[length];
        for (int i = 0; i < length; i++) {
            strCharArr[i] = originalStr.charAt(length - 1 - i);     // start backwards hence, length - 1 - i

            /*
             * Remember that arrays in Java are 0 based index
             * 
             * if, length = 5
             * 5 - 1 - 0 = 4
             * 5 - 1 - 1 = 3
             * 5 - 1 - 2 = 2 
             * 5 - 1 - 3 = 1
             * 5 - 1 - 4 = 0
             */
        }
        
        // Copy each char value 
        reversedStr = new String(strCharArr);

        return reversedStr;
    }


    public static void main(String[] args) {
        String input = "abcde";
        String result = reverseString(input);
        
        System.out.println("Result: " + result);
    }
}

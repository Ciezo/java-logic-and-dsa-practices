/**
 * @author Cloyd Van Secuya
 * 
 * <p>
 * This program allows us to get a boolean result 
 * if there is a vowel in a String. Using the {@link #checkStringVowels(String word)}
 * it can return true if a vowel is found within a string otherwise, it returns false.
 * </p>
 * 
 * <p>
 * The implementation for this exercise is very simple
 * as we need to define a method that takes a String as parameter, and 
 * define a char[] array to initialize vowels. A for loop is used 
 * to traverse the String input to compare against the set of vowels.
 * </p>
 */
package simple_exercises;

public class CheckStringForVowels {
    

    public static boolean checkStringVowels(String word) {
        
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (ch == vowels[i]) {
                return true;
            }    
        }
        
        return false;
    }

    public static void main(String[] args) {
        String word = "cry";
        boolean result = checkStringVowels(word);
        System.out.println("Result: " + result);
    }

}

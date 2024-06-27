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
 * 
 * Reference:
 * https://stackoverflow.com/questions/506105/how-can-i-check-if-a-single-character-appears-in-a-string
 */
package simple_exercises;

public class CheckStringForVowels {
    

    public static boolean checkStringVowels(String word) {
        
        // Define a string for vowels 
        String vowels = "aeiou";
        // Lowercase each character for consistent comparison
        word = word.toLowerCase();
         
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);                   // Get each individual character from the word
            if (vowels.indexOf(ch) != -1) {             // Check if the char occurs inside the vowels String
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        String[] words = {"cry", "apple", "banana", "growth", "land", "mine", "cyst", "center", "middle", "myth", "hyssop"};
        
        for(String word : words) {
            boolean result = checkStringVowels(word);
            System.out.println("Result: " + result);
        }

    }

}

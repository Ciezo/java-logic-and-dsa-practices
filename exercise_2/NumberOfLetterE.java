package exercise_2;

public class NumberOfLetterE {
    /**
     * Write a function that takes as input a string and returns the number of occurrences of the letter e.
     * 
     * Reference: https://introcs.cs.princeton.edu/java/31datatype/
     */

    public int countCharacterE(String s) {
        int count = 0; 

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'e') {
                count++; 
            }
        }

        return count; 
    }

    public static void main(String[] args) {
        NumberOfLetterE e = new NumberOfLetterE();
        System.out.println(e.countCharacterE("Happy")); 
        System.out.println(e.countCharacterE("Minecraft")); 
        System.out.println(e.countCharacterE("Bee")); 
        System.out.println(e.countCharacterE("Tree")); 
        System.out.println(e.countCharacterE("Fee")); 
        System.out.println(e.countCharacterE("Unique")); 
        
    }
}
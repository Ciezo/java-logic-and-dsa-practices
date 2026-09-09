package exercise_2;

public class StringComparison {
    /**
     * Write a function that takes two string arguments s and t 
     * and returns the index of the first character in s that appears in t 
     * (or -1 if no character in s appears in t).
     * 
     * Reference: https://introcs.cs.princeton.edu/java/31datatype/
     */

    public int compareStringCharacters(String s, String t) {
        int index = -1;

        /**
         * if ( s.charAt(i) == t.charAt(j) ) then; 
         *  return index of s
         */

        /** @todo
         * Needs optimal logic for per character comparison  
         * */
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < t.length(); j++) {
                if (s.charAt(i) == t.charAt(j)) {
                    index = i;
                } 
            }
        }

        return index;
    }

    public static void main(String[] args) {
        StringComparison sc = new StringComparison();
        int result = sc.compareStringCharacters("tree", "free");
        System.out.println(result);
    }
}

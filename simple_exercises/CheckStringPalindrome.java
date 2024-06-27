package simple_exercises;

public class CheckStringPalindrome {
    
    private static String myStr = "noon";
    private static String[] myStrArr = {"madam", "racecar", "kayak", "civic", "mom", "dad", "level", "sun"};


    public static boolean checkIfPalindrome(String str) {
        str = str.toLowerCase();
        String originalStr = str;
        String reverseString = "";
        int length = str.length();

        char[] convStr = new char[length]; 
        for (int i = (length-1); i >= 0; i--) {
            convStr[i] = originalStr.charAt(i);     // start at the last most index 
            reverseString = reverseString + convStr[i];
        }

        if (originalStr.equals(reverseString)) {
            System.out.println("String is palindrome");
            System.out.println(reverseString);
            return true;
        } else {
            System.out.println("String is not palindrome");
            return false;
        }

    }

    
    public static void main(String[] args) {
        checkIfPalindrome(myStr);

        for(int i = 0; i < myStrArr.length; i++) {
            checkIfPalindrome(myStrArr[i]);
        }
    }
}
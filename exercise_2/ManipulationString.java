package exercise_2;

public class ManipulationString {
    /**
     * Given a string s that represents the name of a web page, 
     * break it up into pieces, where each piece is separated by a period, 
     * e.g., http://www.cs.princeton.edu should be broken up into www, cs, princeton, and edu, with the http:// part removed. 
     * Use either the split() or indexOf() methods.
     */

    public static void breakdownString(String url) {
        String newUrl = url.replaceFirst("http://", "");
        String[] parse = newUrl.split("\\.");   // split by period
        String result = "";

        for (String elem : parse) {
            result += elem + ",";
        }

        System.out.println(result);
    }

    public static void main(String[] args) {
        ManipulationString.breakdownString("http://www.google.com");
    }
}
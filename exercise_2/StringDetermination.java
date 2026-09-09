package exercise_2;

public class StringDetermination {
    /**
     * Given a string s, determine whether it represents the name of a web page. 
     * Assume that any string starting with http:// is a web page.
     */

    public boolean checkUserInputForWebPage(String path) {
        if (path.startsWith("https://") || path.startsWith("http://")) {
            return true; 
        } 
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        String url = "https://www.google.com";
        StringDetermination sd = new StringDetermination(); 
        System.out.println(sd.checkUserInputForWebPage(url));
    }
}

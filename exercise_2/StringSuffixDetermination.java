package exercise_2;

public class StringSuffixDetermination {
    /**
     * Given a string s that represents the name of a file, write a code fragment to determine its file extension. 
     * The file extension is the substring following the last period. 
     * For example, the file type of monalisa.jpg is jpg, and the file type of mona.lisa.png is png.
     * 
     * substring() Returns a string that is a substring of this string. The substring begins with the character at the specified index and extends to the end of this string.
     * lastIndexOf() method returns the position of the last occurrence of specified character(s) in a string.
     * 
     * Reference: 
     * - https://introcs.cs.princeton.edu/java/31datatype/
     * - https://www.w3schools.com/Java/ref_string_lastindexof.asp
     */

    public static String getExtensionName(String filePath) {
        String ext = filePath.substring(filePath.lastIndexOf('.') + 1);
        return ext;
    }

    public static void main(String[] args) {
        String result = StringSuffixDetermination.getExtensionName("mona.lisa.png");
        System.out.println(result);
    }
}

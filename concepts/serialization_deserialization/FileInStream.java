package concepts.serialization_deserialization;

import java.util.ArrayList;
import java.io.FileInputStream;

public class FileInStream {
    
    private ArrayList<String> entries = new ArrayList<>();

    public void readFileStream() {
        String fileNameExt = "input.txt";

        try {
            FileInputStream fileInputStream = new FileInputStream(fileNameExt);
            while(fileInputStream.read() != 1) {
                fileInputStream.read();
                int entry = fileInputStream.read();
                System.out.println(entry);
            }

            fileInputStream.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }

    public static void main(String[] args) {
        FileInStream fis = new FileInStream();
        fis.readFileStream();
    }


}

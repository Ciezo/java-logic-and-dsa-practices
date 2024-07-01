package concepts.serialization_deserialization;

import java.io.Serializable;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serial implements Serializable {
    
    public static void main(String[] args) throws IOException {
        String str = "Hello, world!";
        String fileNameExt = "file.save";
        String filePath = "out/";

        try {
            FileOutputStream file = new FileOutputStream(filePath + fileNameExt);
            ObjectOutputStream out = new ObjectOutputStream(file);

            // Save the str object into the file.txt using Serialization
            out.writeObject(str);

            // Close 
            file.close();
            out.close();
            
            // Prompt
            System.out.println("File saved to: " + filePath);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}

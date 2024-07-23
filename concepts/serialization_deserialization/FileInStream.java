/**
 * @author Cloyd Van Secuya 
 * 
 * <p>
 * Read and stream contents from the input.txt file using `FileInputStream`
 * to prepare in Serializing the entries based on the file contents 
 * </p>
 * 
 */
package concepts.serialization_deserialization;

import java.util.ArrayList;
import java.io.FileInputStream;

public class FileInStream {
    
    public void readFileStream() {
        String fileName = "input.txt";

        // Store each line from the input.txt here
        ArrayList<String> entries = new ArrayList<>();

        try {
            FileInputStream fis = new FileInputStream(fileName); 
            while(fis.read() != -1) {
                System.out.println("Read...");
            }
            // Prompt
            System.out.println("Reached the end of the file: ");
            fis.close();

        } catch (Exception e) {
            System.out.println("Something went wrong in reading the file input!");
            e.printStackTrace();
        }
        
    }

    
}

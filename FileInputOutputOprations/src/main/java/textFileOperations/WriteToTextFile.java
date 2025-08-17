package textFileOperations;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteToTextFile {
    public static void main(String[] args) {

        try {
            File file = new File("C:\\Users\\Prash\\Zorba_Assignment_Submission\\FileInputOutputOprations\\src\\main\\resources\\sampleNew");
            boolean fileCreatedStatus = false;

            if (!file.exists()) {
                fileCreatedStatus = file.createNewFile();
            }
            if (!fileCreatedStatus) {
                //if file is created in the specified location then only perform the write operation.
                String outputText = "My pleasure";
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                fileOutputStream.write(outputText.getBytes());
                System.out.println("Successfully wrote to the file.");

            }

        }catch (IOException e){
            System.err.println(e.getMessage());
        }

    }
}

package textFileOperations;


/*
 * Reading content from Text file
 *
 * */

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadFromTextFile {
    public static void main(String[] args) {
        //load the txt file
        File file = new File("C:\\Users\\Prash\\Zorba_Assignment_Submission\\FileInputOutputOprations\\src\\main\\resources\\sample.txt");

        try {
            //Read from txt file
            FileInputStream fileInputStream = new FileInputStream(file);
            int data;
            String readData = "";

            while ((data = fileInputStream.read()) != -1) {
                readData =  readData + (char) data;
            }

            System.out.println(readData);

            fileInputStream.close();

        } catch (IOException e) {
            System.err.println("Error opening file");
        }
    }
}

package textFileOperations;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadFromTextFileUsingBufferedSteam {
    public static void main(String[] args) {

        try {
            //load the txt file
            File file = new File("C:\\Users\\Prash\\Zorba_Assignment_Submission\\FileInputOutputOprations\\src\\main\\resources\\sampleNew");
            FileInputStream fileInputStream = new FileInputStream(file);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

            int data;
            String readData = "";

            while ((data = bufferedInputStream.read()) != -1) {
                readData =  readData + (char) data;
            }
                System.out.println(readData.toString());

            //close the streams
            bufferedInputStream.close();
            fileInputStream.close();


        }catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}

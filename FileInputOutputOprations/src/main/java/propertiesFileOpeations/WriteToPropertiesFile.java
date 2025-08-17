package propertiesFileOpeations;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteToPropertiesFile {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\Prash\\Zorba_Assignment_Submission\\FileInputOutputOprations\\src\\main\\resources\\application.properties");
            FileInputStream fileInputStream = new FileInputStream(file);

            //Creating Properties Object
            Properties properties = new Properties();
            properties.load(fileInputStream);

            //Adding new content with the existing properties object
            properties.setProperty("userName", "test1");
            properties.setProperty("password", "test2");

            //Write back to file
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            properties.store(fileOutputStream, "Updated new properties....");
            System.out.println("Updated properties file successfully");


        }catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
}

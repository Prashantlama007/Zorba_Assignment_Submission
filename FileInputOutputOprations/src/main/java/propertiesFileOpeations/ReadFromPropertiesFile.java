package propertiesFileOpeations;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadFromPropertiesFile {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\Prash\\Zorba_Assignment_Submission\\FileInputOutputOprations\\src\\main\\resources\\application.properties");
            FileInputStream fileInputStream = new FileInputStream(file);

            //creating Properties Object
            Properties properties = new Properties();
            //loading the property file
            properties.load(fileInputStream);
            //Read the contents of the properties
            String  username = properties.getProperty("username");
            String password = properties.getProperty("password");

            System.out.println("Retrieved username: " +username + ": Retrieved password: " +password);

        } catch (IOException e){
            System.err.println(e.getMessage());
        }

    }
}

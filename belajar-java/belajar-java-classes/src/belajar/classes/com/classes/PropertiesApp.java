package belajar.classes.com.classes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesApp {
    public static void main(String[] args) {
        try {
            Properties properties = new Properties();

            properties.load(new FileInputStream("app.properties"));

            String host = properties.getProperty("db.host");
            String port = properties.getProperty("db.port");
            String username = properties.getProperty("db.username");
            String password = properties.getProperty("db.password");

            System.out.println(host);
            System.out.println(port);
            System.out.println(username);
            System.out.println(password);

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error load properties");
        }
    }
}

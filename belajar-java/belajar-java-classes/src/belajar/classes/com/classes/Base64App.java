package belajar.classes.com.classes;

import java.util.Base64;

public class Base64App {
    public static void main(String[] args) {
        String original = "Muhammad Fitron Ansori";

        // Encode
        String encoded = Base64.getEncoder().encodeToString(original.getBytes());
        System.out.println(encoded);

        // Decode
        byte[] bytes = Base64.getDecoder().decode(encoded);
        String result = new String(bytes);
        System.out.println(result);
    }
}

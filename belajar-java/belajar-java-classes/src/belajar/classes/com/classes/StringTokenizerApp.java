package belajar.classes.com.classes;

import java.util.StringTokenizer;

public class StringTokenizerApp {
    public static void main(String[] args) {
        String name = "Muhammad Fitron Ansori";

        StringTokenizer tokenizer = new StringTokenizer(name, " ");

        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            System.out.println(token);
        }
    }
}

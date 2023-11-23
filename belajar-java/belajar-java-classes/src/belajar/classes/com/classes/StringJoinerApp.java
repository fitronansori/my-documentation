package belajar.classes.com.classes;

import java.util.StringJoiner;

public class StringJoinerApp {
    public static void main(String[] args) {
        StringJoiner joiner = new StringJoiner(", ", "[", "]");

        joiner.add("Fitron");
        joiner.add("Fajar");
        joiner.add("Maulana");

        String value = joiner.toString();
        System.out.println(value);
    }
}

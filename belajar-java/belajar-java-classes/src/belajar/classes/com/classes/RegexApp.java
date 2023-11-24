package belajar.classes.com.classes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexApp {
    public static void main(String[] args) {
        String name = "Muhammad Fitron Ansori";

        Pattern pattern = Pattern.compile("[a-zA-Z]*[a][a-zA-Z]*");
        // [a-zA-Z]*[a][a-zA-Z]* = huruf kecil dan besar, * = 0 atau lebih, [a] = huruf a, [a-zA-Z]* = huruf kecil dan besar, * = 0 atau lebih

        Matcher matcher = pattern.matcher(name);

        while(matcher.find()){
            String result = matcher.group();
            System.out.println(result);
        }
    }
}

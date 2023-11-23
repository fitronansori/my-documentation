package belajar.classes.com.classes;

public class StringApp {
    public static void main(String[] args) {
        String name = "Fitron Ansori";

        String upperName = name.toUpperCase();
        String lowerName = name.toLowerCase();

        System.out.println(upperName);
        System.out.println(lowerName);
        System.out.println(name.length());
        System.out.println(name.startsWith("F"));
        System.out.println(name.endsWith("i"));

        // Split -> return array of string
        String[] names = name.split(" ");
        for (var value : names) {
            System.out.println(value);
        }
    }
}

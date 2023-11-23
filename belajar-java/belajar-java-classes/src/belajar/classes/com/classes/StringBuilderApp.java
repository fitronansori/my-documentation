package belajar.classes.com.classes;

public class StringBuilderApp {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append("Fitron");
        builder.append(" ");
        builder.append("Ansori");

        String name = builder.toString();
        System.out.println(name);
    }
}

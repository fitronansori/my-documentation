package belajar.classes.com.classes;

import java.util.Scanner;

public class ScannerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nama : ");
        String name = scanner.nextLine();

        System.out.print("Umur : ");
        int age = scanner.nextInt();

        System.out.print("Makanan Favorit : ");
        String favoriteFood = scanner.next();

        System.out.println("Hello " + name);
        System.out.println("Umur " + age + " tahun");
        System.out.println("Makanan Favorit " + favoriteFood);
    }
}

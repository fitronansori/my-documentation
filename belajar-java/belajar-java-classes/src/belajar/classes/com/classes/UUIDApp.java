package belajar.classes.com.classes;

import java.util.UUID;

public class UUIDApp {
    public static void main(String[] args) {
        var uuid = UUID.randomUUID().toString();
        System.out.println(uuid);
    }
}

package com.belajarcollection.collection;

import java.util.List;

public class IterableApp {
    public static void main(String[] args) {
        Iterable<String> names = List.of("Fitron", "Rizki", "Ramadhan");

        for (var name : names) {
            System.out.println(name);
        }
    }
}

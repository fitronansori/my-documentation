package com.belajarcollection.collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionApp {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();

        collection.add("Fitron");
        collection.add("Rizki");
        collection.add("Ramadhan");

        for (var value : collection) {
            System.out.println(value);
        }
    }
}

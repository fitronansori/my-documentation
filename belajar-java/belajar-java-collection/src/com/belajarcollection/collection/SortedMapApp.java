package com.belajarcollection.collection;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapApp {
    public static void main(String[] args) {
        SortedMap<String, String> sortedMap = new TreeMap<>();

        sortedMap.put("first", "Fitron");
        sortedMap.put("last", "Ansori");

        for (String key : sortedMap.keySet()) {
            System.out.println(key);
        }
    }
}

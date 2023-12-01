package com.belajarcollection.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetApp {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("Adnin");
        names.add("Rifandi");
        names.add("Sutanto");

        for (var name : names) {
            System.out.println(name);
        }

        Set<Integer> numbers = new LinkedHashSet<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        for (var number : numbers) {
            System.out.println(number);
        }
    }
}

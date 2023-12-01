package com.belajarcollection.collection;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetApp {
    public static void main(String[] args) {
        NavigableSet<String> names = new TreeSet<>();
        names.add("Adnin");
        names.add("Rifandi");
        names.add("Sutanto");

        NavigableSet<String> namesReverse = names.descendingSet();
        NavigableSet<String> rifandi = names.headSet("Rifandi", true);

        for (String name : namesReverse) {
            System.out.println(name);
        }

        for (String name : rifandi) {
            System.out.println(name);
        }
    }
}

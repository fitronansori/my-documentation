package com.belajarcollection.collection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DequeApp {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();

        deque.add("Fathur");
        deque.add("Rahman");
        deque.add("Fitron");


        for (var value : deque) {
            System.out.println(value);
        }

        // LIFO (Last In First Out)

        deque.pollLast();
        System.out.println("=== LIFO ===");
        for (var value : deque) {
            System.out.println(value);
        }
    }
}

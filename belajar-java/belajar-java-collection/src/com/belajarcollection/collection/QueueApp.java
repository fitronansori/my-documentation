package com.belajarcollection.collection;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueApp {
    public static void main(String[] args) {
        Queue<String> queue = new ArrayDeque<>();

        queue.add("A");
        queue.add("B");
        queue.add("C");

        for (var q : queue) {
            System.out.println(q);
        }
    }
}

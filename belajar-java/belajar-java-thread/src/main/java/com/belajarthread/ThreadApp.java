package com.belajarthread;

public class ThreadApp {
    public static void main(String[] args) {
        var name = Thread.currentThread().getName();
        System.out.println("Name of current thread: " + name);
    }
}

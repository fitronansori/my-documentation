package com.belajarthread;

import org.junit.jupiter.api.Test;

public class ThreadTest {
    @Test
    void mainThread() {
        String name = Thread.currentThread().getName();
        System.out.println("Name of current thread: " + name);
    }

    @Test
    void createThread() {
        Runnable runnable = () -> {
            System.out.println("Hello, I'm a thread!" + Thread.currentThread().getName());
        };

        Thread thread = new Thread(runnable);
        thread.start();
    }

    @Test
    void threadSleep() throws InterruptedException {
        Runnable runnable = () -> {
            try {
                Thread.sleep(2000);
                System.out.println("Hello, I'm a thread!" + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
        thread.join(); // Wait until the thread is finished
    }

    @Test
    void threadInterrupt() throws InterruptedException {
        Runnable runnable = () -> {
            try {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Thread" + Thread.currentThread().threadId() + " - i: " + i);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                System.out.println("Thread" + Thread.currentThread().threadId() + " is interrupted.");
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
        Thread.sleep(3000);
        thread.interrupt();
    }
}

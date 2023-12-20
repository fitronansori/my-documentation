package com.belajarthread;

import org.junit.jupiter.api.Test;

public class MainThreadTest {

    @Test
    void mainThread() {
        var name = Thread.currentThread().getName();
        System.out.println("Thread name: " + name);
    }

    @Test
    void createThread() {
        Runnable runnable = () -> {
            var name = Thread.currentThread().getName();
            System.out.println("Thread name: " + name);
        };

        var thread = new Thread(runnable);
        thread.start();
    }

    @Test
    void threadSleep() {
        Runnable runnable = () -> {
            try {
                Thread.sleep(1000);
                var name = Thread.currentThread().getName();
                System.out.println("Thread name: " + name);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        var thread = new Thread(runnable);
        thread.start();

        System.out.println("End");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    void threadJoin() throws InterruptedException {
        Runnable runnable = () -> {
            try {
                Thread.sleep(1000);
                var name = Thread.currentThread().getName();
                System.out.println("Thread name: " + name);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        var thread = new Thread(runnable);
        thread.start();
        System.out.println("Selesai");
        thread.join();
        System.out.println("End");
    }

    @Test
    void threadInterrupt() throws InterruptedException {
        Runnable runnable = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Runnable " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Thread di interrupt");
                    break;
                }
            }
        };

        var thread = new Thread(runnable);
        thread.start();
        Thread.sleep(5000);
        thread.interrupt();
        System.out.println("Selesai");
        thread.join();
        System.out.println("End");
    }
}

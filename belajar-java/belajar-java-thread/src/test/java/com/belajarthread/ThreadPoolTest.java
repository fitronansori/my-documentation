package com.belajarthread;

import org.junit.jupiter.api.Test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolTest {
    @Test
    void create() {

        var minThread = 10; // jumlah thread yang akan dibuat
        var maxThread = 100; // jumlah thread maksimal yang akan dibuat
        var alive = 1; // waktu thread akan dihapus
        var aliveTime = TimeUnit.MINUTES; // satuan waktu thread akan dihapus

        // untuk menampung task yang akan dijalankan oleh thread
        var queue = new ArrayBlockingQueue<Runnable>(100);

        // membuat executor untuk menjalankan thread
        var executor = new ThreadPoolExecutor(minThread, maxThread, alive, aliveTime, queue);
    }

    @Test
    void executeRunnable() throws InterruptedException {

        var minThread = 10; // jumlah thread yang akan dibuat
        var maxThread = 100; // jumlah thread maksimal yang akan dibuat
        var alive = 1; // waktu thread akan dihapus
        var aliveTime = TimeUnit.MINUTES; // satuan waktu thread akan dihapus

        // untuk menampung task yang akan dijalankan oleh thread
        var queue = new ArrayBlockingQueue<Runnable>(100);

        // membuat executor untuk menjalankan thread
        var executor = new ThreadPoolExecutor(minThread, maxThread, alive, aliveTime, queue);

        Runnable runnable = () -> {
            try {
                Thread.sleep(5000);
                System.out.println("Runnable from " + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Runnable runnable2 = () -> {
            try {
                Thread.sleep(5000);
                System.out.println("Runnable from " + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        // menjalankan runnable

        executor.execute(runnable);
        executor.execute(runnable2);

        Thread.sleep(6000);
    }

    @Test
    void shutdown() throws InterruptedException {

        var minThread = 10; // jumlah thread yang akan dibuat
        var maxThread = 100; // jumlah thread maksimal yang akan dibuat
        var alive = 1; // waktu thread akan dihapus
        var aliveTime = TimeUnit.MINUTES; // satuan waktu thread akan dihapus

        // untuk menampung task yang akan dijalankan oleh thread
        var queue = new ArrayBlockingQueue<Runnable>(100);

        // membuat executor untuk menjalankan thread
        var executor = new ThreadPoolExecutor(minThread, maxThread, alive, aliveTime, queue);

        for (int i = 0; i < 101; i++) {
            final var task = i;
            Runnable runnable = () -> {
                try {
                    Thread.sleep(1000);
                    System.out.println("Task " + task + "from thread" + Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            };
            executor.execute(runnable);
        }

        executor.shutdown();
//        executor.awaitTermination(1, TimeUnit.DAYS);

    }
}

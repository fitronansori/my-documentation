package com.application;

import com.error.DatabaseError;

public class DatabaseApp {
    public static void main(String[] args) {
        connectDatabase("fitron", "Rahasia");
        System.out.println("Sukses connect database");
    }

    public static void connectDatabase(String username, String password) {
        if (username == null || password == null) {
            throw new DatabaseError("Tidak bisa connect ke database");
        }
    }
}

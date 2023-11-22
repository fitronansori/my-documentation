package com.application;

import com.data.LoginRequest;

public class RecordApp {
    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest("fitronansori", "Test123");

        System.out.println(loginRequest);
    }
}

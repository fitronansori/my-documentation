package com.lambda.app;

import com.lambda.SimpleAction;

public class SimpleActionApp {
    public static void main(String[] args) {
        SimpleAction action = () -> {
            return "Hello, World!";
        };

        System.out.println(action.action());
    }
}

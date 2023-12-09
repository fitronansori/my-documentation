package com.lambda.app;

import com.lambda.LambdaParameter;

public class LambdaParameterApp {
    public static void main(String[] args) {
        LambdaParameter action = (name) -> {
            return "Hello " + name;
        };

        System.out.println(action.action("Fitron"));
    }
}

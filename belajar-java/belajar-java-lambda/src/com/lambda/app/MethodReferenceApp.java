package com.lambda.app;

import com.lambda.util.StringUtil;

import java.util.function.Predicate;

public class MethodReferenceApp {
    public static void main(String[] args) {
        Predicate<String> predicate = StringUtil::isLowerCase; // Method reference

        System.out.println(predicate.test("lambda"));
    }
}

package com.application;

public class StackTraceApp {
    public static void main(String[] args) {
        try {
            SampleError();
        } catch (RuntimeException exception) {
            exception.printStackTrace();
        }
    }

    public static void SampleError() {
        try {
            String[] names = {
                    "Fitron", "Kia", "Nara"
            };

            System.out.println(names[100]);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
}

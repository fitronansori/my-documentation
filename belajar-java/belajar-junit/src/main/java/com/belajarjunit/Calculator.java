package com.belajarjunit;

public class Calculator {
    public Integer add(Integer firstNumber, Integer secondNumber) {
        return firstNumber + secondNumber;
    }

    public Integer divide (Integer firstNumber, Integer secondNumber) {
        if (secondNumber == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        } else {
            return firstNumber / secondNumber;
        }
    }
}

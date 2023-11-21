package com.application;

import com.data.Car;
import com.data.Ferrari;

public class CarApp {
    public static void main(String[] args) {
        Car ferrari = new Ferrari();
        ferrari.drive();
        System.out.println("Tire: " + ferrari.getTire());
    }
}

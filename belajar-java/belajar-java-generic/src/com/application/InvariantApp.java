package com.application;

import com.generic.MyData;

public class InvariantApp {
    public static void main(String[] args) {
        MyData<String> stringMyData = new MyData<>("Fitron");
        // MyData<Object> objectMyData = stringMyData;
        // error
        // doIt(objectMyData); // error
        MyData<Object> objectMyData = new MyData<>(100);
        // MyData<Integer> integerMyData = objectMyData; // error
    }

    public static void doIt(MyData<Object> objectMyData) {
        // do something
    }
}

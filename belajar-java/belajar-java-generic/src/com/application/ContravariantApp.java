package com.application;

import com.generic.MyData;

public class ContravariantApp {
    public static void main(String[] args) {
        MyData<Object> objectMyData = new MyData<>("Fitron");
        MyData<? super String> myData = objectMyData; // contravariant
//        process(objectMyData);
    }

    public static void process(MyData<? super String> myData) {
        myData.setData("Fitron");
    }
}

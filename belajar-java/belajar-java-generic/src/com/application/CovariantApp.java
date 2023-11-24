package com.application;

import com.generic.MyData;

public class CovariantApp {
    public static void main(String[] args) {
        MyData<String> stringMyData = new MyData<>("Fitron");
        process(stringMyData);
    }
    public static void process(MyData<?> myData){
        System.out.println(myData.getData());
    }
}

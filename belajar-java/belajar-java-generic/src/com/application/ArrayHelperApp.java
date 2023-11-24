package com.application;

import com.util.ArrayHelper;

public class ArrayHelperApp {
    public static void main(String[] args) {
        String[] stringArray = {"Fitron", "Amalia", "Rizky", "Rizal"};
        Integer[] integerArray = {1, 2, 3, 4, 5};

        ArrayHelper.printArray(stringArray);
        ArrayHelper.printArray(integerArray);
    }
}

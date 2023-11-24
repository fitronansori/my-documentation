package belajar.classes.com.classes;

import java.util.Arrays;

public class ArraysApp {
    public static void main(String[] args) {
        int[] values = {
            1, 2, 3, 12, 14, 65, 23, 12, 11, 10
        };

        Arrays.sort(values);

        System.out.println(Arrays.toString(values));

        System.out.println(Arrays.binarySearch(values, 12));
        System.out.println(Arrays.binarySearch(values, 13));
    }
}

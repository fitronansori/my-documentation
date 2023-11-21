package com.application;

import com.data.City;
import com.data.Location;
import com.data.Product;

public class Application {
    public static void main(String[] args) {
//        Location location = new Location(); // Error: Location is abstract; cannot be instantiated

        City city = new City("New York");
        System.out.println(city.name);
    }
}

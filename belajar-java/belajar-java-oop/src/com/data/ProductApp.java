package com.data;

public class ProductApp {
    public static void main(String[] args) {
        Product product = new Product("Coca Cola", 5000);
        System.out.println("Product name: " + product.getName());
    }
}

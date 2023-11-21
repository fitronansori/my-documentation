package com.application;

import com.data.Category;

public class CategoryApp {
    public static void main(String[] args) {
        Category category = new Category();
        category.setId("ID-001");
        category.setExpensive(true);
        System.out.println(category.getId());
        System.out.println(category.isExpensive());

    }
}

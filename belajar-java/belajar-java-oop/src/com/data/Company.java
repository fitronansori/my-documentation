package com.data;

public class Company {
    private String name;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // inner class
    public class Employee {
        private String name;

        // inner class can access outer class property
        public String getCompany() {
            return Company.this.getName();
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}

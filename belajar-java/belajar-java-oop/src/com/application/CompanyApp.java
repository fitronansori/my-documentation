package com.application;

import com.data.Company;

public class CompanyApp {
    public static void main(String[] args) {
        Company company = new Company();
        company.setName("PT. Maju Mundur");

        Company.Employee employee = company.new Employee();
        employee.setName("Endy");

        System.out.println(employee.getName());
        System.out.println(employee.getCompany());
    }
}

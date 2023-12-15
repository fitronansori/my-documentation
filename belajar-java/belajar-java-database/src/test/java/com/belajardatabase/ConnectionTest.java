package com.belajardatabase;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;

public class ConnectionTest {

    @BeforeAll
    static void beforeAll(){
        try {
            Driver mysqlDriver = new com.mysql.cj.jdbc.Driver();
            java.sql.DriverManager.registerDriver(mysqlDriver);
        } catch (java.sql.SQLException e) {
            Assertions.fail(e);
        }
    }

    @Test
    void testConnection() {
        String jdbcUrl = "jdbc:mysql://localhost:3306/belajar_java_database";
        String username = "root";
        String password = "fitron";

        try {
           Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
           System.out.println("Sukses Terkoneksi");
           connection.close();
           System.out.println("Sukses Menutup Koneksi");
        } catch (java.sql.SQLException e) {
           Assertions.fail(e);
        }
    }
}

package com.belajardatabase;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.SQLException;

public class DataSourceTest {
    @Test
    void testHikariCP() {
        HikariConfig config = new HikariConfig();
        config.setDriverClassName("com.mysql.cj.jdbc.Driver");
        config.setJdbcUrl("jdbc:mysql://localhost:3306/belajar_java_database");
        config.setUsername("root");
        config.setPassword("fitron");

        config.setMaximumPoolSize(10); // maksimal koneksi
        config.setMinimumIdle(5); // koneksi yang idle
        config.setIdleTimeout(60_000); // waktu idle
        config.setMaxLifetime(10 * 60_000); // waktu maksimal koneksi

        try {
            HikariDataSource dataSource = new HikariDataSource(config);
            Connection connection = dataSource.getConnection();
            connection.close();
            dataSource.close();
        } catch (Throwable throwable) {
            System.out.println("Error testHikariCP");
        }
    }

    @Test
    void testUtil() {
        try {
            Connection connection = ConnectionUtil.getDataSource().getConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

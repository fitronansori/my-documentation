package com.belajardatabase;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class ConnectionUtil {
    private static final HikariDataSource dataSource;

    static {
        HikariConfig config = new HikariConfig();
        config.setDriverClassName("com.mysql.cj.jdbc.Driver");
        config.setJdbcUrl("jdbc:mysql://localhost:3306/belajar_java_database");
        config.setUsername("root");
        config.setPassword("fitron");

        config.setMaximumPoolSize(10); // maksimal koneksi
        config.setMinimumIdle(5); // koneksi yang idle
        config.setIdleTimeout(60_000); // waktu idle
        config.setMaxLifetime(10 * 60_000); // waktu maksimal koneksi

        dataSource = new HikariDataSource(config);
    }

    public static HikariDataSource getDataSource() {
        return dataSource;
    }
}

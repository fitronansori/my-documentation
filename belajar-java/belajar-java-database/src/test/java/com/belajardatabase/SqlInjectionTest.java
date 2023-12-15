package com.belajardatabase;

import org.junit.jupiter.api.Test;

import java.sql.*;

public class SqlInjectionTest {
    @Test
    void testSqlInjection() {
        try {
            Connection connection = ConnectionUtil.getDataSource().getConnection();

            Statement statement = connection.createStatement();

            String username = "admin";
            String password = "admin";

            String sql = "SELECT * FROM admin WHERE username = '" + username + "' AND password = '" + password + "'";

            ResultSet resultSet = statement.executeQuery(sql);

            if (resultSet.next()) {
                System.out.println("Sukses login");
            } else {
                System.out.println("Gagal login");
            }

            statement.close();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    void testPreparedStatement() {
        try {
            Connection connection = ConnectionUtil.getDataSource().getConnection();

            String username = "admin";
            String password = "admin";

            String sql = """
                    SELECT * FROM admin
                    WHERE username = ? AND password = ?
                    """;

            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                System.out.println("Sukses login");
            } else {
                System.out.println("Gagal login");
            }

            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

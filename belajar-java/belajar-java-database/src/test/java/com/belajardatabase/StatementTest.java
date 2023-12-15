package com.belajardatabase;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementTest {
    @Test
    void testCreateStatment() {
        try {
            Connection connection = ConnectionUtil.getDataSource().getConnection();

            Statement statement = connection.createStatement();

            statement.close();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    @Disabled
    void testExecuteUpdate() {
        try {
            Connection connection = ConnectionUtil.getDataSource().getConnection();

            Statement statement = connection.createStatement();

            String sql = """
                    INSERT INTO customers(id, name, email)
                    VALUES ("001", "Fitron", "fitronansori7@gmai.com")
                    """;

            statement.executeUpdate(sql);

            statement.close();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    void testQuery() {
        try {
            Connection connection = ConnectionUtil.getDataSource().getConnection();

            Statement statement = connection.createStatement();

            String sql = """
                    SELECT * FROM customers
                    """;

            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                String id = resultSet.getString("id");
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");

                System.out.println("Id: " + id);
                System.out.println("Name: " + name);
                System.out.println("Email: " + email);
            }

            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

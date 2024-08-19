package com.example.chapter34;

import java.sql.*;

public class SimpleJDBC {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        // Load the JDBC driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver Loaded");

        // Connect to the database
        Connection connection = DriverManager.getConnection("jdbc:mysql://prometheus.gtc.edu/tjelinek_test?" +
                "user=tjelinek&password=GTC$@mple22");

        System.out.println("Database Connected");

        // Create statement
        Statement statement = connection.createStatement();
        System.out.println("statement created");

        // Execute the statement
        ResultSet resultSet = statement.executeQuery("select firstName, mi, lastName from Staff where lastName "
                + " = 'Smith'");

        // Iterate through the result and print the student names
        while (resultSet.next())
            System.out.println(resultSet.getString(1) + "\t" +
                    resultSet.getString(2) + "\t" + resultSet.getString(3));

        // close the connection
        connection.close();

    }

}
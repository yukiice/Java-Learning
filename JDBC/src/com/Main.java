package com;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        try (
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java-sql", "root", "123456789"); Statement statement = connection.createStatement()) {
            ResultSet set = statement.executeQuery("select * from  testnow");
            while (set.next()) {
                Student student = new Student(set.getInt(1), set.getString(2));
                student.getMsg();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

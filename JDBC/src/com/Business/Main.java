package com.Business;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java-sql","root","123456789"); Statement statement = connection.createStatement();){
            connection.setAutoCommit(false); // 关闭自动提交，改为手动提交
            statement.executeUpdate("insert into testnow (name) values ('yukiice1')");
            statement.executeUpdate("insert into testnow (name) values ('yukiice2')");
            statement.executeUpdate("insert into testnow (name) values ('yukiice3')");
            connection.rollback();
            connection.commit();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}

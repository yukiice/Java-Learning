import java.sql.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
//        Class.forName("com.mysql.cj.jdbc.Driver");
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java-sql", "root", "123456789"); Statement statement = connection.createStatement()) {
//            ResultSet set = statement.executeQuery("select * from students");
//            while (set.next()){
//                System.out.println(set.getString(1));
//            }
//插入操作
            // int i = statement.executeUpdate("insert into testnow (name) values('yukiice')");
//            System.out.println(i);

//            执行dql操作
           ResultSet set =  statement.executeQuery("select * from students");
           while (set.next()){
               System.out.println(set.getString(2));
           }

//           批处理
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
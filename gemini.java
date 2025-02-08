package practice;

import java.sql.*;

public class gemini {
    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE",
                "system",
                "oracle")) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM boards");
            while (resultSet.next()) {
                int bno = resultSet.getInt("bno");
                String btitle = resultSet.getString("btitle");
                String bcontent = resultSet.getString("bcontent");
                // ...
                System.out.println("bno: " + bno + ", btitle: " + btitle + ", bcontent: " + bcontent);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}


package practice;

import java.sql.*;

public class BoardDeleteExample {
    public static void main(String[] args) {
        Connection conn = null;
        try{
            Class.forName("oracle.jdbc.OracleDriver");

            conn = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:XE",
                    "system",
                    "oracle"
            );
            String sql = "DELETE FROM boards WHERE bwriter=?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,"winter");

            int rows = pstmt.executeUpdate();
            System.out.println("저장된 행 수: " + rows);

            pstmt.close();
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        } catch (SQLException e){
            e.printStackTrace();
        } finally {
            if(conn != null){
                try{
                    conn.close();
                    System.out.println("연결 끊기");
                } catch (SQLException e){}
            }
        }
    }
}

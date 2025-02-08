package practice;

import java.lang.reflect.Type;
import java.sql.*;

public class ProcedureCallExample {
    public static void main(String[] args) {
        Connection conn = null;
        try{
            Class.forName("oracle.jdbc.OracleDriver");
            conn = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:XE",
                    "system",
                    "oracle"
            );

            String sql = "{call user_create(?,?,?,?,?,?)}";
            CallableStatement cstmt = conn.prepareCall(sql);
            cstmt.setString(1,"summer");
            cstmt.setString(2,"한여름");
            cstmt.setString(3,"12345");
            cstmt.setInt(4,26);
            cstmt.setString(5,"summer@mycompany.com");
            cstmt.registerOutParameter(6, Types.INTEGER);

            cstmt.execute();
            int rows = cstmt.getInt(6);
            System.out.println("저장된 행 수: " + rows);

            cstmt.close();
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            if(conn != null){
                try{
                    conn.close();
                } catch (SQLException e){

                }
            }
        }
    }
}

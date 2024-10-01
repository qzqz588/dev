package CH23;

import java.sql.*;

public class C01DBCONN {
    public static void main(String[] args)  {

        //DB CONN DATA
        String id = "root";
        String pw = "1111";
        String url = "jdbc:mysql://localhost:3306/testdb";

        //JDBC참조변수
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        //
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Loading Success...");
            conn = DriverManager.getConnection(url, id, pw);
            System.out.println("DB CONNECTED...");
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

package CH23;

import java.sql.*;

public class C04DELETE {
    public static void main(String[] args)  {

        //DB CONN DATA DB 연결에 필요한 항목
        String id = "root";
        String pw = "1111";
        String url = "jdbc:mysql://localhost:3306/testdb";

        //JDBC참조변수 DB연결 이후 처리할 항목
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        //
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Loading Success...");
            conn = DriverManager.getConnection(url, id, pw); //DB연결 정보를 이용해서 Connetion 객체를 참조변수에 연결
            System.out.println("DB CONNECTED...");
            //
            int result =  result = pstmt.executeUpdate("drop tbl_std");
            if (result == 0) {
                System.out.println("Delete 성공!");
            } else {
                System.out.println("Delete 실패!");
            }
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

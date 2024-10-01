package CH23;

import java.sql.*;

public class C03UPDATE {
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
            pstmt = conn.prepareStatement("update tbl_std set age=? where name=?");//테이블 Column 순서 / INSERT into > UPDATE
            //prepareStatement = 미리 sql문장을 만든 후 (준비한 후) 연결
            pstmt.setInt(1,22); //sql 테이블 자료형에 맞게 사용해야함
            pstmt.setString(2, "홍길동");
            int result =  pstmt.executeUpdate();//DML(INSERT,UPDATE,DELETE)
            if (result > 0) {
                System.out.println("INSERT 성공!");
            } else {
                System.out.println("INSERT 실패!");
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

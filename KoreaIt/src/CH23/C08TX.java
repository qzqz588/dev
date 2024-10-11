package CH23;

import java.sql.*;

public class C08TX {
    public static void main(String[] args)  {

        //DB CONN DATA DB 연결에 필요한 항목
        String id = "root";
        String pw = "1111";
        String url = "jdbc:mysql://localhost:3306/bookdb";

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
            conn.setAutoCommit(false);//자동 커밋 해제(직접 커밋하게 만들어줌)
            pstmt = conn.prepareStatement("insert into tbl_user values('a','1','R',false)");//테이블 Column 순서
            pstmt.executeUpdate();//DML(INSERT,UPDATE,DELETE)
            pstmt = conn.prepareStatement("insert into tbl_user values('b','1','R',false)");//테이블 Column 순서
            pstmt.executeUpdate();//DML(INSERT,UPDATE,DELETE)
            pstmt = conn.prepareStatement("insert into tbl_user values('a','1','R',false)");//테이블 Column 순서
            pstmt.executeUpdate();//DML(INSERT,UPDATE,DELETE)
            pstmt = conn.prepareStatement("insert into tbl_user values('d','1','R',false)");//테이블 Column 순서
            pstmt.executeUpdate();//DML(INSERT,UPDATE,DELETE)
            conn.commit();
            //prepareStatement = 미리 sql문장을 만든 후 (준비한 후) 연결

        } catch (Exception e) {
            e.printStackTrace();
            try {
                conn.rollback();
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
        }finally{
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

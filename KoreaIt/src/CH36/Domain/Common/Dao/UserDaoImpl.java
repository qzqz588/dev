package CH36.Domain.Common.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import CH36.Domain.Common.Dao.connectionPool.ConnectionPoolByHikari;
import CH36.Domain.Common.Dto.UserDto;

public class UserDaoImpl {
    //DBCONN 속성
//    private String id="root";
//    private String pw="1111";
//    private String url="jdbc:mysql://localhost:3306/bookDB";

//    private Connection conn ;

    private PreparedStatement pstmt;
    private ResultSet rs;

    ConnectionPoolByHikari connectionPool;

    //싱글톤 패턴
    private UserDaoImpl() throws Exception{
//        Class.forName("com.mysql.cj.jdbc.Driver");
//        conn = DriverManager.getConnection(url,id,pw);
//        System.out.println("UserDaoImpl DB Connection Success");
        this.connectionPool = ConnectionPoolByHikari.getInstance();
    };
    private static UserDaoImpl instance;
    public static UserDaoImpl getInstance() throws Exception {
        if(instance==null)
            instance = new UserDaoImpl();
        return instance;
    }

    //CRUD
    public List<UserDto> select(){
        return null;
    }
    public UserDto select(UserDto userDto) {
        return null;
    }

    public int insert(UserDto dto) throws SQLException {
        Connection conn = connectionPool.getConnection();
        pstmt = conn.prepareStatement("insert into tbl_user values(?,?,?,?)");
        pstmt.setString(1, dto.getUsername());
        pstmt.setString(2, dto.getPassword());
        pstmt.setString(3, dto.getRole());
        pstmt.setBoolean(4, false);

        int result = pstmt.executeUpdate();
        pstmt.close();
        return result;
    }

    public int update(UserDto dto) throws Exception {
        Connection conn = connectionPool.getConnection();
        pstmt = conn.prepareStatement("update tbl_user set password=? ,Role=? where username=?");
        pstmt.setString(1,dto.getPassword());
        pstmt.setString(2,dto.getRole());
        pstmt.setString(3, dto.getUsername());
        int result = pstmt.executeUpdate();
        pstmt.close();
        return result;
    }
    public int delete(String username) throws Exception {
        Connection conn = connectionPool.getConnection();
        pstmt = conn.prepareStatement("delete from tbl_book where username=?");
        pstmt.setString(1, username);
        int result = pstmt.executeUpdate();
        pstmt.close();
        return result;
    }

}
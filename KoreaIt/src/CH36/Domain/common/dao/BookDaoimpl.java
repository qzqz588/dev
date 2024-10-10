package CH36.Domain.common.dao;

import CH36.Domain.common.dto.BookDto;

import java.awt.print.Book;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BookDaoimpl {
    //DBCONN속성
    private String id ="root";
    private String pw ="1111";
    private String url="jdbc:mysql://localhost:3306/bookdb";

    private Connection conn;
    private PreparedStatement pstmt;
    private ResultSet rs;



    //싱글톤 패턴
    private BookDaoimpl() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection(url, id, pw);
        System.out.println("BookDaoImpl DB Connection Success");
    };
    private static BookDaoimpl instance = null;
    public static BookDaoimpl getInstance() throws Exception {
        if(instance == null)
            instance = new BookDaoimpl();
        return instance;
    }
    //CRUD
    public List<BookDto> select() throws Exception{
        List<BookDto> list = new ArrayList();

        pstmt = conn.prepareStatement("select * from tbl_book");

        rs = pstmt.executeQuery();
        BookDto dto = null;
        if(rs !=null) {
            while (rs.next()) {
                dto = new BookDto();
                dto.setBookCode(rs.getLong("bookcode"));
                dto.setBookName(rs.getString("bookname"));
                dto.setPublisher(rs.getString("publisher"));
                dto.setIsbn(rs.getString("isbn"));
                list.add(dto);
            }
        }
        return list;
    }
    public BookDto select2(long bookCode) throws Exception{

            pstmt = conn.prepareStatement("select * from tbl_book where bookCode=?");
            pstmt.setLong(1,bookCode);

            rs = pstmt.executeQuery();
            BookDto dto = null;
            if(rs !=null) {
              rs.next();
              dto = new BookDto();
              dto.setBookCode(rs.getLong("bookcode"));
              dto.setBookName(rs.getString("bookname"));
              dto.setPublisher(rs.getString("publisher"));
              dto.setIsbn(rs.getString("isbn"));
            }
            return dto;
    }
    public int insert(BookDto dto) throws Exception {
        pstmt = conn.prepareStatement("insert into tbl_book values(?,?,?,?)");
        pstmt.setLong(1, dto.getBookCode());
        pstmt.setString(2,dto.getBookName());
        pstmt.setString(3,dto.getPublisher());
        pstmt.setString(4,dto.getIsbn());

        int result = pstmt.executeUpdate();

        //자원제거
        pstmt.close();;

        return result;
    }
    public int update(BookDto dto) throws Exception {
        pstmt = conn.prepareStatement("update tbl_book set bookname=? ,publisher=? ,isbn=? where bookcode=?");
        pstmt.setString(1,dto.getBookName());
        pstmt.setString(2,dto.getPublisher());
        pstmt.setString(3,dto.getIsbn());
        pstmt.setLong(4, dto.getBookCode());


        int result = pstmt.executeUpdate();
        pstmt.close();
        return result;
    }

    public int delete(long bookcode) throws SQLException {
        pstmt = conn.prepareStatement("delete from tbl_book where bookcode=?");
        pstmt.setLong(1,bookcode);

        int result = pstmt.executeUpdate();
        pstmt.close();
        return result;
    }

}

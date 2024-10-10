package CH36.Domain.common.dao;

import CH36.Domain.common.dto.BookDto;
import CH36.controller.FrontController;
import org.junit.jupiter.api.Test;

import java.awt.print.Book;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;
class BookDaoimplTest {


//    void BookDaoInsert() throws Exception{
//        BookDaoimpl dao = BookDaoimpl.getInstance();
//        dao.insert(new BookDto(2, "이것이리눅스다", "한빛미디어", "111 - 111"));
//    }
//    void BookDaoUpdate() throws Exception{
//        BookDaoimpl dao = BookDaoimpl.getInstance();
//        dao.update(new BookDto(30000002255346, "이것이자바다", "한빛미디어", "222 - 222"));
//    }
//void BookDaodelete() throws Exception{
//            dao.delete(1);
//    BookDaoimpl dao = BookDaoimpl.getInstance();
//}
//    void BookDaoSelect2() throws Exception{
//        BookDaoimpl dao = BookDaoimpl.getInstance();
//        dao = dao.select2(30000002294604);
//        System.out.println(dao);
//    }
    @Test
    void FcControllerTests(){
    FrontController fc = new FrontController();
    Map<String,Object> params = new HashMap();
        params.put("endPoint", "/user");
        fc.execute(params);
    }
}
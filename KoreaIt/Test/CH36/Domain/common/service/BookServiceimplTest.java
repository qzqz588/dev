package CH36.Domain.common.service;

import CH36.Domain.common.dto.BookDto;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BookServiceTests {


    @Test
    void bookServiceImpl_1 () throws Exception {
        BookServiceimpl service = BookServiceimpl.getInstance();
        boolean isSuccess=
        service.bookRegistration(new BookDto(1122l, "이것이C언어다", "오렌지미디어", "121212"));
        System.out.println("도서 등록여부 : " + isSuccess);
    }
    @Test
    void bookServiceImpl_2 () throws Exception {
        BookServiceimpl service = BookServiceimpl.getInstance();
        List<BookDto> list = service.getBooks();
        list.forEach(el-> System.out.println(el));
    }
}
package CH36.Domain.common.service;

import CH36.Domain.common.dao.BookDaoimpl;
import CH36.Domain.common.dto.BookDto;

import java.util.List;

public class BookServiceimpl {

    //BookDao연결
    private BookDaoimpl bookDaoimpl;

    //싱글톤 패턴 처리코드
    private  BookServiceimpl() throws Exception {
        System.out.println("[SERVICE] BookServiceImpl()...");
        bookDaoimpl = BookDaoimpl.getInstance();
    };

    private static BookServiceimpl instance;
    public static BookServiceimpl getInstance() throws Exception {
        if(instance ==null)
            instance = new BookServiceimpl();
        return instance;
    }

    //도서등록
    public boolean bookRegistration(BookDto Dto) throws Exception {
        //추가사항(role에 따른 사용가능 여부 체크, 비즈니스 유효성 체크, 트랜잭션(Tx)처리[중요])
       return bookDaoimpl.insert(Dto)>0;
    }
    //도서내용수정
    public boolean bookUpdate(BookDto dto) throws Exception {
        return bookDaoimpl.update(dto) > 0;
    }
    //도서삭제
    public boolean bookRemove(long bookCode) throws Exception {
        return bookDaoimpl.delete(bookCode) > 0;
    }
    //도서조회(단건)
    public BookDto getBook(long bookCode) throws Exception {
        return bookDaoimpl.select2(bookCode);
    }
    //도서조회(다건)
    public List<BookDto> getBooks() throws Exception {
        return bookDaoimpl.select();
    }
}

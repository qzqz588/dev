package CH36.Domain.common.dto;

public class BookDto {

    private long bookCode;
    private String bookName;
    private String publisher;
    private String isbn;
    //디폴트생성자
    public BookDto(){}

    //모든인자 생성자
    public BookDto(long bookCode, String bookName, String publisher, String isbn) {
        this.bookCode = bookCode;
        this.bookName = bookName;
        this.publisher = publisher;
        this.isbn = isbn;
    }
    //getter and setter
    public long getBookCode() {
        return bookCode;
    }

    public void setBookCode(long bookCode) {
        this.bookCode = bookCode;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    //toString 재정의
    @Override
    public String toString() {
        return "BookDto{" + "bookCode=" + bookCode + ", bookName='" + bookName + '\'' + ", publisher='" + publisher + '\'' + ", isbn='" + isbn + '\'' + '}';
    }
}

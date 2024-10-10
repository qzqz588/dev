package CH36.controller;

import CH36.Domain.common.dto.BookDto;
import CH36.Domain.common.service.BookServiceimpl;

import java.util.HashMap;
import java.util.Map;

public class BookController implements SubController {

    public Map<String,Object> ExceptionHandler(Exception e){
        Map<String, Object> exMap = new HashMap();
        exMap.put("success", false);
        exMap.put("message", e.getMessage());
        exMap.put("exception", e);
        return exMap;
    }

    private BookServiceimpl bookServiceimpl;
    public BookController(){
        try {
            bookServiceimpl = BookServiceimpl.getInstance();
        } catch (Exception e) {
            ExceptionHandler(e);
        }
    }

    @Override
    public Map<String, Object> execute(Map<String, Object> params) {
        System.out.println("[SC] BookController execute()...");
        //파라미터 받기
        Integer serviceNo = (Integer) params.get("serviceNo");
        BookDto bookDto = (BookDto) params.get("bookDto");
        //뷰전달 변수
        Map<String, Object> returnValue = new HashMap();

        try {
                switch (serviceNo) {
                    case 1:     //add
                        System.out.println("[SC] BookController add()...");
                        //유효성확인(Data)
                        if (!isValid(bookDto)) {
                            //유효성체크 실패시 처리
                            returnValue.put("success", false);
                            returnValue.put("message", "도서 등록을 실패하였습니다.");
                            return returnValue;
                        }
                        //서비스요청
                        System.out.println("[SC] BookController dto : " + bookDto);
                        boolean isAdded = bookServiceimpl.bookRegistration(bookDto);

                        //뷰로 전달
                        if(isAdded) {
                            returnValue.put("success", true);
                            returnValue.put("message", "도서 등록을 완료하였습니다.");
                        }else{
                                returnValue.put("success", false);
                                returnValue.put("message", "도서 등록을 실패하였습니다.");
                            }
                        break;


                    case 2:     //update
                        System.out.println("[SC] BookController update()...");
                        break;
                    case 3:     //delete
                        System.out.println("[SC] BookController delete()...");
                        break;
                    case 4:     //select
                        System.out.println("[SC] BookController select()...");
                        break;
                    case 5:     //selectALL
                        System.out.println("[SC] BookController selectALL()...");
                        break;
                    default:
                        break;
                }
            } catch (Exception e) {
              return ExceptionHandler(e);
        }

        //유효성(Data)

        //서비스 요청

        //뷰로 전달
        return returnValue;
    }

    private boolean isValid(BookDto dto) {
        if (dto.getBookCode()==0)
            return false;
        else if (dto.getBookName().trim()==null||dto.getBookName().trim().equals(""))
            return false;

        return true;
    }
}

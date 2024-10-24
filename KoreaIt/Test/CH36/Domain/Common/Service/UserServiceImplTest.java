package CH36.Domain.Common.Service;


import CH36.Controller.FrontController;
import CH36.Domain.Common.Dto.BookDto;
import CH36.Domain.Common.Dto.SessionDto;
import CH36.Domain.Common.Dto.UserDto;
import CH36.Domain.Common.Service.BookServiceImpl;
import CH36.Domain.Common.Service.UserServiceImpl;
import org.junit.jupiter.api.Test;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

class ServiceTests {

    public UserServiceImpl service;

//    @Test
//    void bookServiceImpl_1() throws Exception {
//        BookServiceImpl service = BookServiceImpl.getInstance();
//        boolean isSuccess =
//                service.bookRegistration(new BookDto(1122L, "이것이C언어다", "오렌지미디어", "121212"),1);
//        System.out.println("도서 등록여부 : " + isSuccess);
//    }

    void bookServiceImpl_2() throws Exception {
        BookServiceImpl service = BookServiceImpl.getInstance();
        List<BookDto> list = service.getBooks();
        list.forEach(el -> System.out.println(el));
    }

    @Test
    void userServiceImpl_login() throws Exception {
        FrontController fc = new FrontController();
        Map<String, Object> params = new LinkedHashMap();
        params.put("endPoint", "/user");
        params.put("serviceNo", 6);
        params.put("userDto", new UserDto("123", "111", "-", false));
        Map<String, Object> result = fc.execute(params);
        for (String key : result.keySet()) {
            System.out.println(key + " : " + result.get(key));
        }
    }

    @Test
    void userServiceImpl_logout() throws Exception {

        Map<String, Object> response = service.logout(9);
        for (String key : response.keySet()) {
            System.out.println(key + " : " + response.get(key));
        }
    }
    @Test
    void bookServiceImpl_session() throws Exception {
        BookServiceImpl service = BookServiceImpl.getInstance();
        Map<String, Object> response =
                service.bookRegistration(new BookDto(1122L, "이것이C언어다", "오렌지미디어", "1234"),11);
        for (String key : response.keySet()) {
            System.out.println(key + " : " + response.get(key));
        }
    }

}


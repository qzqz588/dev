package CH36.controller;

import CH36.Domain.common.dto.BookDto;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ControllerTests {

//    @Test
//    void FcControllerTests() {
//        FrontController fc = new FrontController();
//        Map<String, Object> params = new HashMap();
//        params.put("endPoint", "/book");
//        params.put("serviceNo", 4);
//        fc.execute(params);
//    }

    @Test
    void FcControllerTests_3() {
        //요청사항 받을 FC 생성
        FrontController fc = new FrontController();
        //전달할 파라미터 준비
        Map<String,Object> params = new HashMap();
        params.put("endPoint", "/book");
        params.put("serviceNo", 1);
        params.put("bookDto", new BookDto(11223344L,"","한빛미디어","1234"));
        //요청사항 전달
        Map<String,Object> rValue = fc.execute(params);
        boolean isSuccess = (Boolean)rValue.get("success");
        String message = (String)rValue.get("message");
        System.out.println("성공여부 : " + isSuccess);
        System.out.println("message : " + message);

    }
    @Test
    void FcControllerTests_4() {
        //요청사항 받을 FC 생성
        FrontController fc = new FrontController();
        //전달할 파라미터 준비
        Map<String,Object> params = new HashMap();
        params.put("endPoint", "/book");
        params.put("serviceNo", 1);
        params.put("bookDto", new BookDto(99999L,"자(지)바의 정석","한빛미디어","1234"));
        //요청사항 전달
        Map<String,Object> rValue = fc.execute(params);
        boolean isSuccess = (Boolean)rValue.get("success");
        String message = (String)rValue.get("message");
        Exception ex = (Exception) rValue.get("exception");
        System.out.println("성공여부 : " + isSuccess);
        System.out.println("message : " + message);
        System.out.println("exception : " + ex);

    }
}
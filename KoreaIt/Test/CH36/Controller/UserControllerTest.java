package CH36.Controller;

import CH36.Domain.Common.Dao.UserDaoImpl;
import CH36.Domain.Common.Dto.UserDto;
import org.junit.jupiter.api.Test;

import java.util.LinkedHashMap;
import java.util.Map;

class UserControllerTest {

    void UserControllerTest_1(){
        FrontController fc = new FrontController();
        Map<String, Object> params = new LinkedHashMap();
        params.put("endPoint", "/user");
        params.put("serviceNo", 1);
        params.put("userDto", new UserDto("bbb", "1234", "ROLE_USER", false));
        Map<String, Object> result = fc.execute(params);

        System.out.println("isSuccess : " + result.get("success"));
        System.out.println("message : " + result.get("message"));
        System.out.println("exception : " + result.get("exception"));

    }
    @Test
    void UserControllerTest_2() {
        FrontController fc = new FrontController();
        Map<String, Object> params = new LinkedHashMap();
        params.put("endPoint", "/user");
        params.put("serviceNo", 2);
        params.put("userDto", new UserDto("bbb", "sexsex", "ROLE_USER", false));
        Map<String, Object> result = fc.execute(params);

        System.out.println("isSuccess : " + result.get("success"));
        System.out.println("message : " + result.get("message"));
        System.out.println("exception : " + result.get("exception"));
    }

    @Test
    void UserDaoTest_Pool() throws Exception {
        UserDaoImpl dao = UserDaoImpl.getInstance();
        dao.insert(new UserDto("ccc", "123", "ROLE_USER", false));
    }

}
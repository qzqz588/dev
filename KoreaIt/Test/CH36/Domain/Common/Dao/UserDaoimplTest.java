package CH36.Domain.Common.Dao;

import CH36.Domain.Common.Dto.UserDto;
import org.junit.jupiter.api.Test;

class UserDaoimplTest {
    @Test
        void UserDaoInsert() throws Exception{
        UserDaoImpl dao = UserDaoImpl.getInstance();
        int result = dao.insert(new UserDto("aaa", "111", "ROLE_USER", false));
        System.out.println("계정 INSERT 성공여뷰 : " + result);
    }
}
import org.junit.Test;
import top.faroz.dao.UserDao;
import top.faroz.dao.impl.UserDaoImpl;
import top.faroz.pojo.User;

import java.util.List;

/**
 * @ClassName UserDaoTest
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/5/14 上午10:33
 * @Version 1.0
 **/
public class UserDaoTest {

    private UserDao userDao = new UserDaoImpl();

    @Test
    public void selectByNameTest() {
        List<User> admins = userDao.selectByName("admin");
        System.out.println(admins);
    }

    @Test
    public void selectByIdTest() {
        User user = userDao.selectById(1);
        System.out.println(user);
    }

}

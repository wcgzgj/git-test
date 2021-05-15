import org.junit.Test;
import top.faroz.pojo.User;
import top.faroz.service.UserService;
import top.faroz.service.impl.UserServiceImpl;

/**
 * @ClassName UserServiceTest
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/5/14 上午10:56
 * @Version 1.0
 **/
public class UserServiceTest {

    private UserService userService = new UserServiceImpl();

    @Test
    public void loginTest() {
        boolean res = userService.login(new User(null, "admin", "23"));
        System.out.println(res);
    }
}

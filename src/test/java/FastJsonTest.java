import com.alibaba.fastjson.JSON;
import org.junit.Test;
import top.faroz.pojo.User;
import top.faroz.resp.CommonResp;

import javax.jws.soap.SOAPBinding;

/**
 * @ClassName FastJsonTest
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/5/15 下午2:56
 * @Version 1.0
 **/
public class FastJsonTest {
    @Test
    public void fastJson() {
        CommonResp<User> resp = new CommonResp<>();

        User user = new User(1, "kkk", "dqwd");
        resp.setContent(user);
        String str = JSON.toJSONString(resp);
        System.out.println(str);
    }
}

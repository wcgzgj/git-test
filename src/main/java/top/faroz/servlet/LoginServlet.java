package top.faroz.servlet;

import top.faroz.pojo.User;
import top.faroz.service.UserService;
import top.faroz.service.impl.UserServiceImpl;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

/**
 * @ClassName LoginServlet
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/5/13 下午11:31
 * @Version 1.0
 **/
@WebServlet(name = "login",urlPatterns = "/login")
public class LoginServlet extends HttpServlet {

    private static UserService userService = new UserServiceImpl();

    public LoginServlet() {
    }

    @Override
    public void init(ServletConfig config) throws ServletException {

    }

    /**
     * 用户登录验证，只允许使用post
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("进入登录验证");

        Map<String, String[]> params = req.getParameterMap();
        User user = new User();
        user.setName(params.get("userName")[0]);
        user.setPassword(params.get("password")[0]);
        boolean flag = userService.login(user);
        if (flag) {
            // 如果登录成功，将登陆信息存入session中
            req.getSession().setAttribute("user",user);
            System.out.println("session存值");

            //登录成功，跳转到成功页面（转发）
            req.getRequestDispatcher("success.jsp").forward(req,resp);
        } else {
            //登录失败，跳转到失败页面（重定向）
            resp.sendRedirect("fail.jsp");
        }

        /**
         * 这里发现一个问题，只要前端请求登录5次以上，马上就会出现阻塞
         * 初步认为是数据库连接池的问题
         */
        System.out.println("登录验证结束！");
        System.out.println("\n\n");
    }
}

package top.faroz.servlet;

import top.faroz.pojo.User;
import top.faroz.service.UserService;
import top.faroz.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @ClassName RegisterServlet
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/5/15 下午1:31
 * @Version 1.0
 **/
@WebServlet(name = "register",urlPatterns = "/register-check")
public class RegisterServlet extends HttpServlet {

    private UserService userService = new UserServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userName = req.getParameter("userName");
        User user = userService.selectByName(userName);

        System.out.println("查询出的用户为:"+user);

        PrintWriter writer = resp.getWriter();
        if (user==null) {
            writer.println("账户可用");
        } else {
            writer.println("账户已被注册");
        }
    }
}

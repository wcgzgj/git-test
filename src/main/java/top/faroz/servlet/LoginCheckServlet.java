package top.faroz.servlet;

import jdk.nashorn.internal.ir.RuntimeNode;
import top.faroz.pojo.User;
import top.faroz.service.UserService;
import top.faroz.service.impl.UserServiceImpl;
import top.faroz.util.JSONUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @ClassName AutoFillServlet
 * @Description 检查当前用户存在不存在，
 *                 存在，返回用户信息，实现自动填充
 *                 不存在，返回错误信息，前端显示
 * @Author FARO_Z
 * @Date 2021/5/15 下午3:18
 * @Version 1.0
 **/
@WebServlet(name = "check",urlPatterns = "/login-check")
public class LoginCheckServlet extends HttpServlet {

    private UserService userService = new UserServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        User user = userService.selectByName(name);
        if (user==null) {
            //未查到用户，传送失败信息
            JSONUtil.send(resp,null,false,"用户不存在");
        } else {
            //查到该用户，传送成功信息
            JSONUtil.send(resp,user);
        }
    }
}

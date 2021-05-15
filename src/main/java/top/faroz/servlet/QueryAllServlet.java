package top.faroz.servlet;

import javafx.geometry.Pos;
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
import java.util.List;

/**
 * @ClassName QueryAllServlet
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/5/15 下午2:31
 * @Version 1.0
 **/
@WebServlet(name = "all",urlPatterns = "/all")
public class QueryAllServlet extends HttpServlet {

    UserService userService = new UserServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<User> users = userService.queryAll();
        JSONUtil.send(resp,users);
    }
}

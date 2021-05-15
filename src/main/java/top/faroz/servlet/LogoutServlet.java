package top.faroz.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @ClassName LogoutServlet
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/5/14 下午4:03
 * @Version 1.0
 **/
@WebServlet(name = "logout",urlPatterns = "/logout")
public class LogoutServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //删除用户信息
        req.getSession().removeAttribute("user");
        System.out.println("session 清值");
        //重定向到登录页面
        resp.sendRedirect("login.jsp");

        Cookie cookie = new Cookie("haha", "哈哈哈");
        resp.addCookie(cookie);
    }
}

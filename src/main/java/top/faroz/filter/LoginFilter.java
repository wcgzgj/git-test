package top.faroz.filter;

import com.sun.xml.internal.bind.v2.model.core.ID;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Objects;

/**
 * @ClassName LoginFilter
 * @Description 过滤用户访问 success.jsp的请求
 * @Author FARO_Z
 * @Date 2021/5/14 下午6:19
 * @Version 1.0
 **/
public class LoginFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse resp = (HttpServletResponse) response;
        HttpSession session = req.getSession();
        Object user = session.getAttribute("user");
        if (user==null) {
            System.out.println("未登录的用户，尝试访问 success.jsp页面，被我发现了");
            resp.sendRedirect("login.jsp");
        }
        chain.doFilter(req,response);
    }

    @Override
    public void destroy() {

    }
}

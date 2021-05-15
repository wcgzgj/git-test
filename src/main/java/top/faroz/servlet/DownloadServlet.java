package top.faroz.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;

/**
 * @ClassName DownlodaServlet
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/5/15 下午5:59
 * @Version 1.0
 **/

@WebServlet(name = "download" ,urlPatterns = "/download")
public class DownloadServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name=req.getParameter("filename");
        String url="uploadfile/"+name;
        //将响应的内容设置为通用的二进制流
        resp.setContentType("application/octet-stream");
        //为了让url中的图片名称，不显示为乱码
        name= URLEncoder.encode(name,"utf-8");
        //attachment 告诉浏览器以附件的方式下载文件(弹出下载框)
        resp.addHeader("Content-Disposition","attachment;filename="+name);
        req.getRequestDispatcher(url).forward(req, resp); //清空缓冲区:将服务端缓冲区的文件内容,立即权并不传送给客户端 response.flushBuffer();
    }
}

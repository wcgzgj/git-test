package top.faroz.servlet;

import com.jspsmart.upload.File;
import com.jspsmart.upload.SmartUpload;
import com.jspsmart.upload.SmartUploadException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.jsp.JspFactory;
import javax.servlet.jsp.PageContext;
import java.io.IOException;

/**
 * @ClassName UpLoadServlet
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/5/15 下午5:12
 * @Version 1.0
 **/

@WebServlet(name = "upload",urlPatterns = "/upload")
public class UpLoadServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            //创建上传文件对象
            SmartUpload smartUpload = new SmartUpload();
            //获得pageContext对象
            JspFactory factory=JspFactory.getDefaultFactory();
            PageContext pagecontext= factory.
                            getPageContext(this, req,resp,null,false,1024,true);
            smartUpload.initialize(pagecontext);
            //设置编码
            smartUpload.setCharset("utf-8"); //实现文件数据的上传 su.upload();

            //上传（这里应该是放入缓存）
            smartUpload.upload();

            File file = smartUpload.getFiles().getFile(0); //得到文件的基本信息
            String filename=file.getFileName();
            String type=file.getContentType();
            System.out.println("type="+type);


            String url="uploadfile/"+filename; //将上传文件保存到指定目录
            file.saveAs(url, SmartUpload.SAVE_VIRTUAL); // SAVE_VIRTUAL 存为虚拟路径

            //将文件名称，放入请求当中
            req.setAttribute("filename",filename);
            // String uname=smartUpload.getRequest().getParameter("uname");
            // System.out.println("uname="+uname);

            //重定向到新的页面，展示上传的文件
            req.getRequestDispatcher("show.jsp").forward(req,resp);

        } catch (SmartUploadException e) {
            e.printStackTrace();
        }
    }
}

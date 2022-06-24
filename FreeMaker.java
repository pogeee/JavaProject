package xxx;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@WebServlet("/f01")
public class FreeMaker extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("msg","hello,freeMaker");
        req.setAttribute("date",new Date());

        req.setAttribute("age",18 );
        req.setAttribute("num1",5.547);
        req.setAttribute("num2",10000);

        String[] stars = new String[]{"林俊杰","周杰伦","TyLor"};
        req.setAttribute("stars",stars);

        List list = Arrays.asList("厦门","北京","广州");
        req.setAttribute("list",list);


        req.getRequestDispatcher("template/f01.ftl").forward(req,resp);
    }}

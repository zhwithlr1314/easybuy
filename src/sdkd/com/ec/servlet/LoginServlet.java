package sdkd.com.ec.servlet;

import sdkd.com.ec.dao.impl.EbUserDao;
import sdkd.com.ec.model.EbUser;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by zhaoshuai on 2016/7/6.
 */
@WebServlet(name = "LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
             doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         String userName = request.getParameter("userName");
         String passWord = request.getParameter("passWord");
         String veryCode = request.getParameter("veryCode");
         EbUserDao userDao = new EbUserDao();
         System.out.println("here --> " + userName);
         if(userDao.CheckUser(userName,passWord) == true){
             request.setAttribute("userName",userName);
             System.out.println("right !!!!!!!!");
                request.getRequestDispatcher("/Index.Servlet").forward(request,response);
         }  else {
                request.setAttribute("hint","用户名或密码错误");
                request.getRequestDispatcher("index.jsp").forward(request,response);
         }
    }
}

package sdkd.com.ec.servlet;

import sdkd.com.ec.dao.impl.EbUserDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by zhaoshuai on 2016/7/6.
 */
@WebServlet(name = "RegisterServlet")
public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
           doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userName = request.getParameter("userName");
        String passWord = request.getParameter("passWord");

        EbUserDao userDao = new EbUserDao();
        System.out.println("here --> " + userName);
        if(userDao.InsertUser(userName,passWord) == true){
            System.out.println("right !!!!!!!!");
            request.setAttribute("userName",userName);
            request.getRequestDispatcher("reg-result.jsp").forward(request,response);
        }  else {
            request.getRequestDispatcher("register.jsp").forward(request,response);
        }
    }
}

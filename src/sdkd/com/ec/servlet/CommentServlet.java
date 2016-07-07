package sdkd.com.ec.servlet;

import sdkd.com.ec.dao.impl.EbCommentDao;
import sdkd.com.ec.model.EbComment;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by zhaoshuai on 2016/7/6.
 */
@WebServlet(name = "CommentServlet")
public class CommentServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
          doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        EbCommentDao mydao = new EbCommentDao();
        List<EbComment> CommentList = mydao.getComments();
        request.setAttribute("commentlist"  , CommentList);
        request.getRequestDispatcher("guestbook.jsp").forward(request,response);
    }
}

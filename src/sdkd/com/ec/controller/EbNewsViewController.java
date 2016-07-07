package sdkd.com.ec.controller;

import sdkd.com.ec.dao.impl.EbNewsDao;
import sdkd.com.ec.model.EbNews;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by zhangjiwen on 2016/7/6.
 */
public class EbNewsViewController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int id =Integer.parseInt(request.getParameter("id"));
        EbNewsDao newsDao = new EbNewsDao();
        List<EbNews> list = newsDao.getNews();
        EbNews ebn = null;
        for(EbNews ebn1: list)
        {
            if(ebn1.getEnId().equals(id))
            {
                ebn=ebn1;
                break;
            }
        }

         /* String newstitle = ebn.getEnTitle();
        System.out.println(newstitle);*/
        request.setAttribute("ebn", ebn);


        //跳转
        request.getRequestDispatcher("/news-view.jsp").forward(request, response);
    }

}

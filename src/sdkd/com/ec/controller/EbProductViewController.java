package sdkd.com.ec.controller;

import sdkd.com.ec.dao.impl.EbNewsDao;
import sdkd.com.ec.dao.impl.EbProductDao;
import sdkd.com.ec.model.EbNews;
import sdkd.com.ec.model.EbProduct;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by zhangjiwen on 2016/7/6.
 */
@WebServlet(name = "EbProductViewController")
public class EbProductViewController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int id =Integer.parseInt(request.getParameter("id"));
        EbProductDao productDao = new EbProductDao();

        productDao.ViewProductForOneTime(request.getParameter("id"));
        //增加一次该产品的浏览量

        List<EbProduct> list = productDao.getProducts();
        EbProduct ebp = null;
        System.out.println(id + " --> " + list.size());
        for(EbProduct ebp1: list)
        {
            if(ebp1.getEpId().equals(""+id))
            {
                ebp=ebp1;
                break;
            }
        }


        System.out.println(ebp.getEpName());
        request.setAttribute("product", ebp);

        //跳转
        request.getRequestDispatcher("/product-view.jsp").forward(request, response);
    }
}

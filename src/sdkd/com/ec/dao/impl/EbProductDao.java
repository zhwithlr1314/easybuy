package sdkd.com.ec.dao.impl;

import sdkd.com.ec.dao.BaseDao;
import sdkd.com.ec.model.EbNews;
import sdkd.com.ec.model.EbProduct;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhaoshuai on 2016/7/6.
 */
public class EbProductDao extends BaseDao{
         public List<EbProduct>  getProducts(){
             List<EbProduct> all = new ArrayList<EbProduct>();
             String sql = "select * from easybuy_product";
             try {
                 ResultSet rs = this.executeSearch(sql,null);
                 while (rs.next()){
                     EbProduct te = new EbProduct();
                     te.setEpId(rs.getString("ep_id"));
                     te.setEpName(rs.getString("ep_name"));
                     te.setEpDescription(rs.getString("ep_description"));
                     te.setEpPrice(rs.getString("ep_price"));
                     te.setEpStock(rs.getString("ep_stock"));
                     te.setEpcProductIcon(rs.getString("ep_product_icon"));
                     te.setEpBaPrice(rs.getString("ep_ba_price"));
                     te.setEpBargain(rs.getString("ep_bargain"));
                     te.setEpViewCount(rs.getString("ep_view_count"));
                     all.add(te);
                 }
             } catch (SQLException e) {
                 e.printStackTrace();
             }
             return all;
         }
         public boolean ViewProductForOneTime(String id){
                String sql = "update easybuy_product set ep_view_count = ep_view_count + 1 where ep_id = ?";
                List<String> params = new ArrayList<String>();
                params.add(id);
                int res = this.exeucteModify(sql , params);
                return (res > 0);
         }
}

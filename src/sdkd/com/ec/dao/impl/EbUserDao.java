package sdkd.com.ec.dao.impl;


import sdkd.com.ec.dao.BaseDao;
import sdkd.com.ec.model.EbUser;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EbUserDao extends BaseDao {
    public List<EbUser> getEbUsers() {
        List<EbUser> all = new ArrayList<EbUser>();
        String sql = "select * from easybuy_user";
        ResultSet rs = this.executeSearch(sql, null);
        try {
            while (rs.next()) {
                EbUser te = new EbUser();
                te.setEuUserName(rs.getString("eu_user_name"));
                te.setEuPassword(rs.getString("eu_password"));
                all.add(te);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return all;
    }

    /*
       判定特定的验证用户名和密码
       如果存在返回真， 否则返回假
    */
    public boolean CheckUser(String EuUserName, String EuPassword) {
        List<EbUser> all = new ArrayList<EbUser>();
        String sql = "select * from easybuy_user where eu_user_name = ? and eu_password = ?";
        List<String> params = new ArrayList<String>();
        params.add(EuUserName);
        params.add(EuPassword);
        ResultSet rs = this.executeSearch(sql, params);
        try {
            if (rs.next())
                return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean InsertUser(String EuUserName, String EuPassword) {
        List<EbUser> all = new ArrayList<EbUser>();
        String userId = "33";
        String sql = "insert into easybuy_user (eu_user_id,eu_user_name,eu_password) values(?,?,?)";
        List<String> params = new ArrayList<String>();
        params.add(userId);
        params.add(EuUserName);
        params.add(EuPassword);
        int res = this.exeucteModify(sql,params);
        return (res > 0);
    }
}
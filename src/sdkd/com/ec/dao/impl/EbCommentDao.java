package sdkd.com.ec.dao.impl;

import sdkd.com.ec.dao.BaseDao;
import sdkd.com.ec.model.EbComment;
import sdkd.com.ec.model.EbNews;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhaoshuai on 2016/7/6.
 */
public class EbCommentDao extends BaseDao{

    public List<EbComment> getComments(){
        List<EbComment> all = new ArrayList<EbComment>();
        String sql = "select * from easybuy_comment";
        try {
            ResultSet rs = this.executeSearch(sql,null);
            while (rs.next()){
                EbComment te = new EbComment();
                te.setEcReply(rs.getString("ec_reply"));
                te.setEcContent(rs.getString("ec_content"));
                te.setEcCreateTime(rs.getString("ec_create_time"));
                te.setEcReplyTime(rs.getString("ec_reply_time"));
                te.setEcNickName(rs.getString("ec_nick_name"));
                System.out.println(te.getEcNickName()  + " ---  ");
                //添加到集合中
                all.add(te);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return all;
    }
    public boolean InsertComment(String name,String title, String content , String datetime){
           EbCommentDao mydao = new EbCommentDao();

        /*
        * ec_id
                ec_reply
        ec_content
                ec_create_time
        ec_reply_time
                ec_nick_name
        * */
        String id = "" + (mydao.getComments().size() + 1);
        String sql = "insert into easybuy_comment (ec_id , ec_content , ec_nick_name , ec_create_time) values(?,?,?,?)";
        ArrayList<String> params = new ArrayList<String>();
        params.add(id);
        params.add(name);
        params.add(title);
        params.add(datetime);
        int res = this.exeucteModify(sql , params);
        return (res>0);
    }
}

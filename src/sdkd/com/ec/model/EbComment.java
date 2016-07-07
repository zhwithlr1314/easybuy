package sdkd.com.ec.model;

/**
 * Created by zhaoshuai on 2016/7/6.
 */
public class EbComment {
    /*
ec_id
ec_reply
ec_content
ec_create_time
ec_reply_time
ec_nick_name
*/
    String ecId;
    String ecReply;
    String EcContent;
    String EcCreateTime;
    String EcReplyTime;
    String EcNickName;

    public String getEcId() {
        return ecId;
    }

    public void setEcId(String ecId) {
        this.ecId = ecId;
    }

    public String getEcReply() {
        return ecReply;
    }

    public void setEcReply(String ecReply) {
        this.ecReply = ecReply;
    }

    public String getEcContent() {
        return EcContent;
    }

    public void setEcContent(String ecContent) {
        EcContent = ecContent;
    }

    public String getEcCreateTime() {
        return EcCreateTime;
    }

    public void setEcCreateTime(String ecCreateTime) {
        EcCreateTime = ecCreateTime;
    }

    public String getEcNickName() {
        return EcNickName;
    }

    public void setEcNickName(String ecNickName) {
        EcNickName = ecNickName;
    }

    public String getEcReplyTime() {
        return EcReplyTime;
    }

    public void setEcReplyTime(String ecReplyTime) {
        EcReplyTime = ecReplyTime;
    }

}

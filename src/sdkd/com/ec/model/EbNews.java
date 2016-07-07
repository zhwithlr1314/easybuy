package sdkd.com.ec.model;

import java.util.Date;

/**
 * Created by SDUST-132 on 2016/7/6.
 */
public class EbNews {
    private Integer enId;
    private String enTitle;
    private String enContent;
    private String enCreateTime;

    public Integer getEnId() {
        return enId;
    }

    public void setEnId(Integer enId) {
        this.enId = enId;
    }

    public String getEnTitle() {
        return enTitle;
    }

    public void setEnTitle(String enTitle) {
        this.enTitle = enTitle;
    }

    public String getEnContent() {
        return enContent;
    }

    public void setEnContent(String enContent) {
        this.enContent = enContent;
    }

    public String getEnCreateTime() {
        return enCreateTime;
    }

    public void setEnCreateTime(String enCreateTime) {
        this.enCreateTime = enCreateTime;
    }
}

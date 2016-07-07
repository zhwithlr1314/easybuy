package sdkd.com.ec.model;

/**
 * Created by zhaoshuai on 2016/7/6.
 */
public class EbProduct {
    /*
    ep_id
ep_name
ep_description
ep_price
ep_stock
epc_id
epc_child_id
ep_file_name

*/
     String EpId;
     String EpName;
     String EpPrice;
     String EpDescription;
     String EpStock;
     String EpcId;//分类ID
     String EpcChildId; //二级分类ID
     String EpFileName; //文件名
     String EpProductIcon;
     String EpBargain;
     String EpBaPrice;
     String EpViewCount;

    public String getEpProductIcon() {
        return EpProductIcon;
    }

    public void setEpProductIcon(String epProductIcon) {
        EpProductIcon = epProductIcon;
    }

    public String getEpBargain() {
        return EpBargain;
    }

    public void setEpBargain(String epBargain) {
        EpBargain = epBargain;
    }

    public String getEpBaPrice() {
        return EpBaPrice;
    }

    public void setEpBaPrice(String epBaPrice) {
        EpBaPrice = epBaPrice;
    }

    public String getEpViewCount() {
        return EpViewCount;
    }

    public void setEpViewCount(String epViewCount) {
        EpViewCount = epViewCount;
    }

    public String getEpcProductIcon() {
        return EpProductIcon;
    }

    public void setEpcProductIcon(String epcProductIcon) {
        EpProductIcon = epcProductIcon;
    }

    public String getEpDescription() {
        return EpDescription;
    }

    public void setEpDescription(String epDescription) {
        EpDescription = epDescription;
    }

    public String getEpId() {
        return EpId;
    }

    public void setEpId(String epId) {
        EpId = epId;
    }

    public String getEpName() {
        return EpName;
    }

    public void setEpName(String epName) {
        EpName = epName;
    }

    public String getEpPrice() {
        return EpPrice;
    }

    public void setEpPrice(String epPrice) {
        EpPrice = epPrice;
    }

    public String getEpStock() {
        return EpStock;
    }

    public void setEpStock(String epStock) {
        EpStock = epStock;
    }

    public String getEpcId() {
        return EpcId;
    }

    public void setEpcId(String epcId) {
        EpcId = epcId;
    }

    public String getEpcChildId() {
        return EpcChildId;
    }

    public void setEpcChildId(String epcChildId) {
        EpcChildId = epcChildId;
    }

    public String getEpFileName() {
        return EpFileName;
    }

    public void setEpFileName(String epFileName) {
        EpFileName = epFileName;
    }
}

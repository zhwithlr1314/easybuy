package sdkd.com.ec.model;

/**
 * 用户表
 * Created by SDUST-132 on 2016/7/5.
 */
public class EbUser {
    /*
    eu_user_id
eu_user_name
eu_password
eu_sex
eu_birthday
eu_identity_code
eu_email
eu_mobile
eu_address
eu_status

    */
    String EuUserId;
    String EuUserName;
    String EuPassword;
    String EuSex;
    String EuBirthday;
    String EuIdentityCode;
    String EuEmail;
    String EuMoblie;
    String EuAddress;
    String EuStatus;

    public String getEuUserId() {
        return EuUserId;
    }

    public void setEuUserId(String euUserId) {
        EuUserId = euUserId;
    }

    public String getEuUserName() {
        return EuUserName;
    }

    public void setEuUserName(String euUserName) {
        EuUserName = euUserName;
    }

    public String getEuPassword() {
        return EuPassword;
    }

    public void setEuPassword(String euPassword) {
        EuPassword = euPassword;
    }

    public String getEuSex() {
        return EuSex;
    }

    public void setEuSex(String euSex) {
        EuSex = euSex;
    }

    public String getEuBirthday() {
        return EuBirthday;
    }

    public void setEuBirthday(String euBirthday) {
        EuBirthday = euBirthday;
    }

    public String getEuIdentityCode() {
        return EuIdentityCode;
    }

    public void setEuIdentityCode(String euIdentityCode) {
        EuIdentityCode = euIdentityCode;
    }

    public String getEuEmail() {
        return EuEmail;
    }

    public void setEuEmail(String euEmail) {
        EuEmail = euEmail;
    }

    public String getEuMoblie() {
        return EuMoblie;
    }

    public void setEuMoblie(String euMoblie) {
        EuMoblie = euMoblie;
    }

    public String getEuAddress() {
        return EuAddress;
    }

    public void setEuAddress(String euAddress) {
        EuAddress = euAddress;
    }

    public String getEuStatus() {
        return EuStatus;
    }

    public void setEuStatus(String euStatus) {
        EuStatus = euStatus;
    }
}

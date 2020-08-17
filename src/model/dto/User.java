package model.dto;

public class User extends Person {

    int userID;
    String account;
    String password;
    String position;
    Boolean isLogin = false;

    public User(int userID, String account, String password, String userName, boolean gender,
            String dateOfBirth, String address, String phoneNumber, String indentityNumber, String position) {
        this.setUserID(userID);
        this.setAccount(account);
        this.setPassword(password);
        this.setName(userName);
        this.setGender(gender);
        this.setDateOfBirth(dateOfBirth);
        this.setAddress(address);
        this.setPhoneNumber(phoneNumber);
        this.setIndentityNumber(indentityNumber);
        this.setPosition(position);
    }

    public User() {
    }

    public String getDateOfBirth(){
        return dateOfBirth;
    }
    
    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Boolean getIsLogin() {
        return isLogin;
    }

    public void setIsLogin(Boolean isLogin) {
        this.isLogin = isLogin;
    }

    public void login() {
    }

    public void logout() {
    }

}

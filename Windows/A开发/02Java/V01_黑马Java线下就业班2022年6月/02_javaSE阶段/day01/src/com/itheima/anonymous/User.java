package com.itheima.anonymous;
/*
    Javabean
 */
public class User {
    private String username;
    private String password;
    private String phoneNumber;
    private String confirm;
    private String email;
    private String sex;
    private String birthday;

    public User() {
    }

    public User(String username, String password, String phoneNumber, String confirm, String email, String sex, String birthday) {
        this.username = username;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.confirm = confirm;
        this.email = email;
        this.sex = sex;
        this.birthday = birthday;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getConfirm() {
        return confirm;
    }

    public void setConfirm(String confirm) {
        this.confirm = confirm;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}

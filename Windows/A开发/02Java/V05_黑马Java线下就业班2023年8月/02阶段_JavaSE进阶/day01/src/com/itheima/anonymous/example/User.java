package com.itheima.anonymous.example;

public class User {
    private String name;
    private String phoneNumber;
    private String password;
    private String confirm;
    private String email;
    private String sex;
    private String birthday;

    public User() {
    }

    public User(String name, String phoneNumber, String password, String confirm, String email, String sex, String birthday) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.confirm = confirm;
        this.email = email;
        this.sex = sex;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

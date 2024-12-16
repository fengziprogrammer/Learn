package com.atguigu.pojo;

import java.io.Serializable;
import java.util.Objects;

public class Account implements Serializable {
    private Integer aid;
    private String username;
    private String password;
    private Integer balance;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(aid, account.aid) && Objects.equals(username, account.username) && Objects.equals(password, account.password) && Objects.equals(balance, account.balance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(aid, username, password, balance);
    }

    public Account() {
    }

    public Account(Integer aid, String username, String password, Integer balance) {
        this.aid = aid;
        this.username = username;
        this.password = password;
        this.balance = balance;
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
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

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }
}

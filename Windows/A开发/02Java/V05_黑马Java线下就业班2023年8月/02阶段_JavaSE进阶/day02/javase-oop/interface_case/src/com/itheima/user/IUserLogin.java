package com.itheima.user;

import com.itheima.domain.User;

//接口： 仅仅只是制定规则
public interface IUserLogin {

    //接口通常书写：抽象方法
    /**
     * 功能： 用户登录
     * @param user   用户对象
     * @return       boolean类型：true表示成功， false表示失败
     */
    public abstract boolean login(User user);
}

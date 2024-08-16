package com.itheima.user;

import com.itheima.domain.User;

//必须按照接口中制定的规则编写代码
public class UserLogin implements IUserLogin{
    @Override
    public boolean login(User user) {
        return false;
    }
}

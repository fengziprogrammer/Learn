package com.itheima.sh.h_proxy_08;
/*
    重写抽象方法快捷键：ctrl+i
 */
public class UserServiceImpl implements UserService{

    @Override
    public void login() {
        //获取系统时间
        long start = System.currentTimeMillis();
        try {
            //模拟登录，去数据库查询数据
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("登录....");
        long end = System.currentTimeMillis();
        //输出耗时
        System.out.println("耗时:"+(end-start));
    }

    @Override
    public void delete() {
        //获取系统时间
        long start = System.currentTimeMillis();
        try {
            //模拟删除，去数据库删除数据
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("删除....");
        long end = System.currentTimeMillis();
        //输出耗时
        System.out.println("耗时:"+(end-start));
    }

    @Override
    public void query() {
        //获取系统时间
        long start = System.currentTimeMillis();
        try {
            //模拟查询，去数据库查询数据
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("查询....");
        long end = System.currentTimeMillis();
        //输出耗时
        System.out.println("耗时:"+(end-start));
    }
}

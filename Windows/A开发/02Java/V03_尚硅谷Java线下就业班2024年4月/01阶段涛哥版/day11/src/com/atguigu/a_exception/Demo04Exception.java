package com.atguigu.a_exception;

import java.io.FileNotFoundException;

public class Demo04Exception {
    public static void main(String[] args)throws FileNotFoundException {
        String s = "abc.txt1";
        /*
          method方法使用了throws异常处理方案
          往上抛异常,但是抛的是编译时期异常
          此异常让调用处接收了
          也就是说:method(s)接收了一个下面抛过来的编译时期异常
          所以此处爆红
         */
        add(s);

        System.out.println("删除功能");
        System.out.println("修改功能");
        System.out.println("查询功能");
    }

    public static void add(String s)throws FileNotFoundException {
        if (!s.endsWith(".txt")){
            //创建异常对象
            throw new FileNotFoundException();
        }
        System.out.println("我要执行");
    }
}

package com.atguigu.a_exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo05Exception {
    public static void main(String[] args)throws /*FileNotFoundException,*//*IOException*/Exception {
        String s = "abc.txt1";
        /*
          method方法使用了throws异常处理方案
          往上抛异常,但是抛的是编译时期异常
          此异常让调用处接收了
          也就是说:method(s)接收了一个下面抛过来的编译时期异常
          所以此处爆红
         */
        add(s);
    }

    public static void add(String s)throws /*FileNotFoundException,*//*IOException*/Exception {
        if (s==null){
            //创建异常对象
            throw new IOException("IO异常了");
        }

        if (!s.endsWith(".txt")){
            //创建异常对象
            throw new FileNotFoundException("文件找不到异常");//利用有参构造设置异常信息
        }

        System.out.println("我要执行");
    }
}

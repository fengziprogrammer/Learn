package com.atguigu.i_file;

import java.io.File;

public class Demo02File {
    public static void main(String[] args) {
        String path1 = "E:\\Idea\\io\\27.jpg";
        System.out.println(path1);

        /*
          写代码要通用,一次编写到处运行
         */

        String path2 = "E:"+ File.separator+"Idea"+File.separator+"io"+File.separator+"27.jpg";
        System.out.println(path2);
    }
}

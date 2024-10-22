package com.atguigu.a_file;

import java.io.File;

public class Demo01File {
    public static void main(String[] args) {
        method01();
        method02();
    }

    private static void method02() {
        /*
          如果直接写\,就写的太死了
          因为:
            win: \
            linux: /

          java代码要求:一次编写,到处运行
         */
        //String path = "E:\\Idea\\io";
        String path = "E:"+File.separator+"Idea"+File.separator+"io";
        System.out.println(path);
    }

    private static void method01() {
        //static String pathSeparator :与系统有关的路径分隔符，为了方便，它被表示为一个字符串
        System.out.println(File.pathSeparator); //  ;
        //static String separator:与系统有关的默认名称分隔符，为了方便，它被表示为一个字符串
        System.out.println(File.separator);// \
    }
}

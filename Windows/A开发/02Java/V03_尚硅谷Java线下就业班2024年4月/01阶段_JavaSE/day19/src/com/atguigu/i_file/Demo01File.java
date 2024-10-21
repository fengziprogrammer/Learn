package com.atguigu.i_file;

import java.io.File;

public class Demo01File {
    public static void main(String[] args) {
        //static String pathSeparator 与系统有关的路径分隔符，为了方便，它被表示为一个字符串。
        String pathSeparator = File.pathSeparator;
        System.out.println("pathSeparator = " + pathSeparator); // ;
        //static String separator     与系统有关的默认名称分隔符，为了方便，它被表示为一个字符串
        String separator = File.separator;
        System.out.println("separator = " + separator);  //   \
    }
}

package com.atguigu.a_file;

import java.io.File;

public class Demo08File {
    public static void main(String[] args) {
        //1.创建File对象,指明要遍历的文件夹路径
        File file = new File("E:\\Idea\\io\\aa");
        method(file);
    }

    public static void method(File file) {
        //2.调用listFiles方法,遍历文件夹,返回File数组
        File[] files = file.listFiles();
        //3.遍历File数组,在遍历的过程中,判断,是否为文件
        for (File file1 : files) {
            //4.如果是文件,获取文件名称,判断是否以.jpg结尾,如果是,直接输出此文件
            if (file1.isFile()) {
                String name = file1.getName();
                if (name.endsWith(".jpg")) {
                    System.out.println(name);
                }
            } else {
                //5.如果不是文件,肯定是文件夹,就继续遍历此文件夹,重复2 3 4 5的步骤
                method(file1);
            }

        }
    }
}

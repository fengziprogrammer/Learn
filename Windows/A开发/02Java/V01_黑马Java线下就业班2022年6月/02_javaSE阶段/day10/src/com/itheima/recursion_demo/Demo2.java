package com.itheima.recursion_demo;

import java.io.File;

/*
    需求 : 使用递归删除计算机中指定的文件夹

    删除D盘中的aaa文件夹!

    File类 : delete()可以直接删除文件 或者 空文件夹

    aaa
        --bbb
            --ddd.txt
        --ccc.txt
 */
public class Demo2 {
    public static void main(String[] args) {
        File file = new File("D:\\aaa");
        deleteFiles(file);
    }

    // 此方法接收一个File路径(目录) , 删除此路径下所有的内容
    public static void deleteFiles(File file) {
        // 先获取所有儿子辈文件
        File[] files = file.listFiles();

        // 提高代码的健壮性
        if(files == null){
            return;
        }

        // 遍历数组
        for (File f : files) {
            if (f.isFile()) {
                // 如果是文件, 直接删除
                f.delete();
            } else {
                // 目录
                deleteFiles(f);
            }
        }

        // 删除当前目录
        file.delete();
    }
}
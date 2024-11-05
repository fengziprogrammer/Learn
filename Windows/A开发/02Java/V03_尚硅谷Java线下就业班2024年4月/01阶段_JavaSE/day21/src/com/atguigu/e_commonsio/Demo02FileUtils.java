package com.atguigu.e_commonsio;

import org.apache.commons.io.FileUtils;

import java.io.File;

public class Demo02FileUtils {
    public static void main(String[] args) throws Exception{
        //method01();
        //method02();
        method03();
    }

    /**
     * - 静态方法：String readFileToString(File file)读取文本文件，返回字符串。
     */
    private static void method03()throws Exception {
        String s = FileUtils.readFileToString(new File("day21_IO_Net\\commons.txt"));
        System.out.println(s);
    }

    /**
     * - 静态方法：writeStringToFile(File file,String str)写字符串到文本文件中。
     */
    private static void method02()throws Exception {
        FileUtils.writeStringToFile(new File("day21_IO_Net\\commons.txt"),"哈啊哈哈");
    }

    /**
     * - 静态方法：FileUtils.copyDirectoryToDirectory(File src,File dest);
     *            传递File类型的目录，进行整个目录的复制，自动进行递归遍历。
     *
     *            参数:
     *              src:要复制的文件夹路径
     *              dest:要将文件夹粘贴到哪里去
     */
    private static void method01()throws Exception {
        FileUtils.copyDirectoryToDirectory(new File("E:\\Idea\\io\\aa"),new File("E:\\Idea\\io\\bb"));
    }
}

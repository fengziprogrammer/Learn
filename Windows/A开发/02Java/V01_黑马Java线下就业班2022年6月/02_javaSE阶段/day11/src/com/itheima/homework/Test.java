package com.itheima.homework;

import java.io.FileOutputStream;
import java.io.IOException;

/*
    请使用FileOutputStream向文件输出：HelloWorld

    要求：

    1. 用 `try-catch-finally` 方式处理异常。
    2. 用 `try-with-resource` 方式处理异常。
 */
public class Test {
    public static void main(String[] args) {
        // 自动释放资源
        try (FileOutputStream fos = new FileOutputStream("day12_demo\\a.txt")) {
            fos.write("HelloWorld".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
        // fos.close();// 必须执行!
    }

    private static void method() {
        // 局部变量 , 局部变量在使用前必须给定初始化值
        FileOutputStream fos = null;

        try {
            // System.out.println(3 / 0);

            fos = new FileOutputStream("day12_demo\\a.txt");

            fos.write("HelloWorld".getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();// 必须执行!
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

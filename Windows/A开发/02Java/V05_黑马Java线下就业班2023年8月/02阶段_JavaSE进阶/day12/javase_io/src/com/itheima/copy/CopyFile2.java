package com.itheima.copy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile2 {
    /*文件复制：
     *    需要源文件： 使用字节输入流读文件数据
     *    需要目标文件： 使用字节输出流向文件中写入数据
     * */

    public static void main(String[] args) {
        String srcPath = "f:/files/111.jpg";
        String destPath = "files/111.jpg";  //必须是目标文件，而不是目标目录

        long beginTime = System.currentTimeMillis();
        copy(srcPath, destPath);
        long endTime = System.currentTimeMillis();

        System.out.println("文件复制花费：" + (endTime - beginTime) + "毫秒");//6毫秒
    }

    /**
     * 文件复制 :读多个个字节数据，写入多个个字节数据
     *
     * @param src  源文件路径
     * @param dest 目标文件路径
     */
    public static void copy(String src, String dest) {
        //循环：读取源文件中的数据，向目标文件中写入数据
        //字节输入流，并联源文件
        //字节输出流，并联目标文件
        try (FileInputStream fis = new FileInputStream(src);
             FileOutputStream fos = new FileOutputStream(dest);
        ) {
            //字节数组
            byte[] buf = new byte[1024*8]; //一次读取1K
            //读取字节数据的个数
            int len = -1;

            while ((len = fis.read(buf)) != -1) {
                //向目标文件中写入实际读取到的字节数据
                fos.write(buf, 0, len);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

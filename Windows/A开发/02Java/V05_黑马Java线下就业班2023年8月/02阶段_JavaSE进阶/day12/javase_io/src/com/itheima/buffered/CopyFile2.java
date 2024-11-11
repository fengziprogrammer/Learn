package com.itheima.buffered;

import java.io.*;

public class CopyFile2 {
    //使用字符缓冲流复制纯文本文件
    public static void main(String[] args) {
        String src = "f:/files/斗罗大陆.txt";
        String dest = "files/copy.txt";

        copy(src, dest);
    }

    private static void copy(String src, String dest) {

          try(BufferedReader br = new BufferedReader(new FileReader(src));
              BufferedWriter bw = new BufferedWriter(new FileWriter(dest));
          ) {
              char[] cbuf = new char[1024];
              int len=-1;

              while((len=br.read(cbuf)) != -1){
                  //把实际读取到的字符数据，写入到文本文件中
                  bw.write(cbuf , 0 , len);
              }

          } catch (IOException e) {
              e.printStackTrace();
          }


    }
}

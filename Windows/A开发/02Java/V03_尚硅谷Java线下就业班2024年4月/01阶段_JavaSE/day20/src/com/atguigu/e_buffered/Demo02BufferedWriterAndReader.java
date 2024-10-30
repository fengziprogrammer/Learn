package com.atguigu.e_buffered;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Demo02BufferedWriterAndReader {
    public static void main(String[] args)throws Exception {
        //method01();
        method02();
    }

    private static void method02()throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("day20_IO\\5.txt"));
        //String s = br.readLine();
        //System.out.println(s);

        String line = null;
        while((line = br.readLine())!=null){
            System.out.println(line);
        }

        br.close();
    }

    private static void method01() throws Exception {
        BufferedWriter bw = new BufferedWriter(new FileWriter("day20_IO\\5.txt",true));
        bw.write("鹅鹅鹅");
        bw.newLine();
        bw.write("曲项向天歌");
        bw.newLine();
        bw.write("白毛浮绿水");
        bw.newLine();
        bw.write("红掌拨清波");
        bw.newLine();
        bw.close();
    }
}

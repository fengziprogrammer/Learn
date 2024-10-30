package com.atguigu.e_buffered;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;

public class Demo03Exam {
    public static void main(String[] args)throws Exception {
        //1.创建BufferedReader,用于读取每一行内容
        BufferedReader br = new BufferedReader(new FileReader("day20_IO\\in.txt"));
        //2.创建BufferedWriter,用于将排好序的数据写到out.txt
        BufferedWriter bw = new BufferedWriter(new FileWriter("day20_IO\\out.txt"));
        //3.创建一个ArrayList集合,将读取到的每一行数据一个一个的放到集合中
        ArrayList<String> list = new ArrayList<>();
        String line = null;
        while((line = br.readLine())!=null){
            list.add(line);
        }
        //4.利用Collections.sort,排序
        Collections.sort(list);
       /* for (String s : list) {
            System.out.println(s);
        }*/
        //5.遍历ArrayList集合,将排好序的每一段遍历出来,写到out.txt中
        for (String s : list) {
            bw.write(s);
            bw.newLine();
        }

        bw.close();
        br.close();
    }
}

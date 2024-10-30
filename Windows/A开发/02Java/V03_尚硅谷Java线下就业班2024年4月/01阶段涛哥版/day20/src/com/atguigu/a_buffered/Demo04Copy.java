package com.atguigu.a_buffered;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;

public class Demo04Copy {
    public static void main(String[] args) throws Exception{
        //1.创建一个ArrayList集合,用于保存读取到的内容,进行排序
        ArrayList<String> list = new ArrayList<>();
        //2.创建BufferedReader,用于读取每一行数据
        BufferedReader br = new BufferedReader(new FileReader("day20_IO\\io\\in.txt"));
        //3.创建BufferedWriter,将读取到的内容写到out.txt中
        BufferedWriter bw = new BufferedWriter(new FileWriter("day20_IO\\io\\out.txt"));
        //4.边读,边往Arraylist集合中存
        String line;
        while((line = br.readLine())!=null){
            list.add(line);
        }
        //5.利用Collections.sort进行排序
        Collections.sort(list);
        //6.遍历集合,边遍历边写到out.txt中
        for (String s : list) {
            bw.write(s);
            bw.newLine();
        }

        bw.close();
        br.close();
    }
}

package com.itheima.buffered;

import java.io.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CharBufferedStream {
    public static void main(String[] args) throws IOException {
        //创建字符输入缓冲流
        BufferedReader br = new BufferedReader(new FileReader("files/helloworld.txt"));
        //读取一行数据
        String s = br.readLine();

        //创建字符输出缓冲流
        BufferedWriter bw = new BufferedWriter(new FileWriter("files/helloworld.txt"));

        //按照空格切割字符串
        String[] strs = s.split(" ");//{"33","22","11","55","4"}

        //转换为Stream流对象
        Stream<String> stream = Stream.of(strs);
        //把Stream流中的String类型元素，变为Integer类型元素,对Integer类型的元素进行排序
        List<Integer> list = stream.map(str -> Integer.parseInt(str))
                .sorted()
                .collect(Collectors.toList());//收集到List集合中

        //把集合转换为字符串
        String s1 = list.toString();
        //去除字符串中的中括号，把字符串中的逗号变为空格
        s1 = s1.substring(1, s1.length() - 1).replace(","," ");

        //把排序后的字符串写入到文件中
        bw.write(s1);

        //释放流资源
        bw.close();
    }
}

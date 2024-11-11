package com.atguigu.e_stream;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Demo01Stream {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("张三丰");
        list.add("张大彪");
        list.add("吕不韦");
        list.add("张三");
        list.add("赵姬");
        list.add("张翠山");
        list.add("嫪毐");

      /*  //1.获取姓张的元素
        ArrayList<String> listZhang = new ArrayList<>();
        for (String s : list) {
            if (s.startsWith("张")){
                listZhang.add(s);
            }
        }
        //2.获取张姓三个字的名字
        ArrayList<String> listThree = new ArrayList<>();
        for (String s : listZhang) {
            if (s.length()==3){
                listThree.add(s);
            }
        }

        //3.展示集合中的数据
        for (String s : listThree) {
            System.out.println(s);
        }*/

        Stream<String> stream = list.stream();
        stream.filter(s -> s.startsWith("张")).filter(s -> s.length()==3).forEach(s -> System.out.println(s));
    }
}

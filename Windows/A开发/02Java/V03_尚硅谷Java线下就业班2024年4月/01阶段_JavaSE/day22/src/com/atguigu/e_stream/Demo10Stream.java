package com.atguigu.e_stream;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Demo10Stream {
    public static void main(String[] args) {
        ArrayList<String> one = new ArrayList<>();
        one.add("迪丽热巴");
        one.add("宋远桥");
        one.add("苏星河");
        one.add("老子");
        one.add("庄子");
        one.add("孙子");
        one.add("洪七公");

        ArrayList<String> two = new ArrayList<>();
        two.add("古力娜扎");
        two.add("张无忌");
        two.add("张三丰");
        two.add("赵丽颖");
        two.add("张二狗");
        two.add("张天爱");
        two.add("张三");

        Stream<String> stream1 = one.stream();
        Stream<String> stream2 = two.stream();
        //完成第一个队伍
        //Stream<String> streamA = stream1.filter(s -> s.length() == 3).limit(3);
        //完成第二个队伍
        //Stream<String> streamB = stream2.filter(s -> s.startsWith("张")).skip(2);

        //Stream.concat(streamA,streamB).forEach(s -> System.out.println(s));
        Stream.concat(stream1.filter(s -> s.length() == 3).limit(3),stream2.filter(s -> s.startsWith("张")).skip(2)).forEach(s -> System.out.println(s));
    }
}

package com.itheima.homework.work;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/*
    现在有两个`ArrayList`集合存储队伍当中的多个成员姓名，要求使用Stream流**依次**进行以下若干操作步骤：

        1. 第一个队伍只要名字为3个字的成员姓名；

        2. 第一个队伍筛选之后只要前3个人；

        3. 第二个队伍只要姓张的成员姓名；

        4. 第二个队伍筛选之后不要前2个人；

        5. 将两个队伍合并为一个队伍；

        6. 根据姓名创建`Person`对象；
        7. 打印整个队伍的Person对象信息。
 */
public class Test3 {
    public static void main(String[] args) {
        List<String> one = new ArrayList<>();
        one.add("陈玄风");
        one.add("梅超风");
        one.add("陆乘风");
        one.add("曲灵风");
        one.add("武眠风");
        one.add("冯默风");
        one.add("罗玉风");


        Stream<String> stream1 = one.stream().filter((String s) -> { // 第一个队伍只要名字为3个字的成员姓名；
            return s.length() == 3;
        }).limit(3);// 2. 第一个队伍筛选之后只要前3个人；

        List<String> two = new ArrayList<>();
        two.add("宋远桥");
        two.add("俞莲舟");
        two.add("俞岱岩");
        two.add("张松溪");
        two.add("张翠山");
        two.add("殷梨亭");
        two.add("莫声谷");
        two.add("张无忌");

        Stream<String> stream2 = two.stream().filter((String s) -> { //   3. 第二个队伍只要姓张的成员姓名；
            return s.startsWith("张");
        }).skip(2);// 4. 第二个队伍筛选之后不要前2个人；

        // 5. 将两个队伍合并为一个队伍；
        // public static <T> Stream<T> concat(Stream<? extends T> a, Stream<? extends T> b)
        Stream<String> stream = Stream.concat(stream1, stream2);
        stream.forEach((String s) -> {
            Person p = new Person(s);
            System.out.println(p);
        });
    }
}

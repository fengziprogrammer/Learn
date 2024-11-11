package com.atguigu.f_method;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class Demo01Method {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("柳岩", "三上", "曼曼", "涛哥", "有菜");

        /*
            a.被引用的方法必须在重写方法之中
            b.被引用的方法和所在的重写的方法 从参数上,返回值上要一致
            c.将重写方法的参数干掉, -> 干掉,被引用方法的参数干掉
         */
        //stream.forEach(new Consumer<String>() {
            /*
              a.println方法在重写的accept方法中使用
              b.accept有一个参数,类型为String,没有返回值
              c.println有一个参数,类型为String,没有返回值
             */
            //@Override
            //public void accept(String s) {
            //    System.out.println(s);
            //}
        //});

        System.out.println("=============================");

        stream.forEach(System.out::println);
    }
}

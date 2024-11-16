package com.atguigu.e_newjdk;

import java.io.FileWriter;

public class Demo02TryCatch {
    public static void main(String[] args)throws Exception {
        //method01();
        method02();
    }

    /**
     * jdk9开始,可以IO流对象在外面初始化,直接在try中写对象名
     *
     * 1.减轻try的压力
     * 2.自动关流
     * @throws Exception
     */
    private static void method02()throws Exception{
        FileWriter fw = new FileWriter("day23_newjdk\\1.txt");
        try(fw){
            fw.write("jdk9-17新特性");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     * jdk8以及之前异常处理
     */
    private static void method01() {
        try(FileWriter fw = new FileWriter("day23_newjdk\\1.txt");){
            fw.write("jdk9-17新特性");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

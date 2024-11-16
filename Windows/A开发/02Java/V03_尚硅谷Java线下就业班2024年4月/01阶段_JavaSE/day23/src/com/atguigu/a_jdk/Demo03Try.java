package com.atguigu.a_jdk;

import java.io.FileWriter;

public class Demo03Try {
    public static void main(String[] args)throws Exception {
        //method01();
        method02();
    }

    /**
     * jdk9对try升级了
     * 能在try中直接写IO流的对象名了
     *
     * 好处:
     *   1.减轻了try中的压力
     *   2.也会自动关闭
     */
    private static void method02()throws Exception{
        FileWriter fw = new FileWriter("day23_reflect/io.txt");
        try(fw){
            fw.write("涛哥");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     * jdk7的try...catch集合IO流使用
     */
    private static void method01() {
        try(FileWriter fw = new FileWriter("day23_reflect/io.txt");){
            fw.write("哈哈");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

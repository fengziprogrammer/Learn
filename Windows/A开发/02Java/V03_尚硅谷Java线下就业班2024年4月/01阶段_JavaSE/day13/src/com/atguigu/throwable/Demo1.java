package com.atguigu.throwable;

import java.io.FileInputStream;
import java.io.IOException;

public class Demo1 {

    /*
    JDK1.7之后try...catch 新写法
        格式
        	try{
                // 可能会发生异常的代码
        	}catch(异常类型 对象名){
                // 处理异常的代码
        	}finally{
                // 一定会执行的代码 ,不写逻辑业务相关代码,只做资源的释放
        	}
      JDK1.7之后的写法,自动资源的释放(前提: 资源类 实现接口 Closeable)
            try(
                资源类的声明
            ){
                // 可能会发生异常的代码
        	}catch(异常类型 对象名){
                // 处理异常的代码
        	}
     */
    public static void main(String[] args) {

        // JDK1.7之前
       /* FileInputStream fis = null;
        try{
            fis = new FileInputStream("222.txt");
            int[] arr = {1,2,3,4,5};
            System.out.println(arr[8]);
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            try {
                if(fis != null){
                    fis.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }*/

        // JDK1.7之后
        try(FileInputStream   fis = new FileInputStream("222.txt");){
            int[] arr = {1,2,3,4,5};
            System.out.println(arr[8]);
        }catch(Exception e){
            e.printStackTrace();
        }



    }
}

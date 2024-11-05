package com.itheima.synchronized_demo3;

/*
    finally : 关键字 , 单独使用没有任何意义 , 和try...catch 或者 try 搭配使用


    try{
        可能会出现问题的代码
    } catch(异常类型 变量名){
        处理异常的方案
    } catch(异常类型 变量名){
        处理异常的方案
    }...finally {
        这里的代码一定会执行!!!
        释放资源 , 清理垃圾的作用!
    }
 */
public class FinallyDemo {
    public static void main(String[] args) {
//        try {
//            int[] arr = {33, 22, 11};
//            System.out.println(arr[3]);
//        } catch (StringIndexOutOfBoundsException e) {
//            e.printStackTrace();
//        } finally {
//            System.out.println("这里的代码一定会执行!!!");
//        }

        System.out.println(method());
    }

    public static int method() {
        try {
            // return 100; // finally一样执行
            System.exit(0); // finally不执行
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("这里执行了吗?");
            return 200;
        }
    }
}

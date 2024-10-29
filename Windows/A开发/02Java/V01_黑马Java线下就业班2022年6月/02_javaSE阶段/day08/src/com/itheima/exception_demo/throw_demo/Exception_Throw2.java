package com.itheima.exception_demo.throw_demo;
/*
    抛出异常存在的意义所在 :
        1 在方法中，当传递的参数有误，没有继续运行下去的意义了，则采取抛出处理，表示让该方法结束运行。
        2 告诉调用者方法中出现了问题

    练习   : 定义一个方法 , 方法的参数接收一个数组 , 在方法中遍历数组 .
    需求1  : 如果方法接收的数组为null  , 使用输出语句提示
    需求2  : 如果方法接收的数组为null  , 使用抛出异常解决

    思考   : 两种方式的区别在哪里 ?
        使用输出语句 , 只是把错误信息打印在了控制台 , 并不能把错误信息返回给调用者
        使用抛出异常 , 会把异常对象抛给调用者
 */
public class Exception_Throw2 {
    public static void main(String[] args) {
//        printArr1(null);
        printArr2(null);
    }

    public static void printArr1(int[] arr){
        if(arr == null){
            System.out.println("数组不能为null...");
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void printArr2(int[] arr){
        if(arr == null){
            throw new NullPointerException();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

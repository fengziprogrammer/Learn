package com.itheima;

/*
    案例: 字符串相加

    当+号遇到字符串,就不是算数+了,而是字符串连接符
    字符串连接符可以让字符串和任意类型进行数据进行串联(拼接)

    后面我们常见于打印结果
        "sum:" + sum
        "avg:" + avg
        "姓名:" + name
 */
public class Demo04 {
    public static void main(String[] args) {
        //结果?
        System.out.println("it" + "heima"); //"itheima"
        System.out.println("itheima" + 666); //"itheima666"
        System.out.println(1 + 99 + "年黑马"); // "100年黑马"
        //结果?
        System.out.println("5+5=" + 5 + 5); //"5+5=55"
        //如何让结果满足正常算式的结果?
        System.out.println("5+5=" + (5 + 5)); //"5+5=10"
    }
}

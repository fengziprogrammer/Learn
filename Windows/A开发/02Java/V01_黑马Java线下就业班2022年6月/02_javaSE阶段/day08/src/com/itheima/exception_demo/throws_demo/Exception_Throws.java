package com.itheima.exception_demo.throws_demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
    1 声明异常—— throws
        格式 : 修饰符   返回值类型  方法名(参数列表) throws 异常类型1 , 异常的类型2...   {  ...  }
        举例 : public void show() throws NullPointerException , ArrayIndexOutOfBoundsException  { .... }
        作用 :
            1 表示告知调用者当前的方法可能会出现某些异常,使用时需要注意哦!
            2 如果当前方法没有出现任何异常, 那么代码会正常执行
            3 如果当前方法中出现了异常 , 会把异常交给本方法调用者处理(甩锅)

    2 需求 :
        练习 : 定义两个方法一个运行时期异常 , 一个声明编译时期异常 !

    3 注意 :
        1 编译时异常因为在编译时就会检查，所以必须要写在方法后面进行显示声明
        2 运行时异常因为在运行时才会发生，所以在方法后面可以不写
        3 如果声明多个异常有子父类关系 , 那么只要声明一个父类即可(多态)
 */
public class Exception_Throws {
    public static void main(String[] args) throws ParseException {
        int[] arr = new int[3];
        arr = null;
        method1(arr);

        System.out.println("===========");

        method2("2021-11-11");
    }

    /*
        此方法声明了一个运行时期异常 : NullPointerException
        如果传入的参数没有问题 , 那么此方法会正常执行
        如果传入的参数有误 , 那么会在异常的位置创建异常的对象 , 并把异常的对象交给方法的调用者处理
        如果方法声明的是运行时期异常那么此异常可以省略
     */
    public static void method1(int[] arr) throws NullPointerException ,IndexOutOfBoundsException {
//    public static void method1(int[] arr){
        for (int i = 0; i < arr.length; i++) {// new NullPointerException()
            System.out.println(arr[i]);
        }
    }
    /*
        如果方法中出现了编译时期异常 , 那么此异常必须处理 , 不处理的话无法执行程序
        如果传入的参数没有问题 , 那么此方法会正常执行
        如果传入的参数有误 , 那么会在异常的位置创建异常的对象 , 并把异常的对象交给方法的调用者处理

        编译时期异常无法省略 , 必须处理
     */
    public static void method2(String strDate) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd"); // new ParseException()
        Date date = sdf.parse(strDate);
        System.out.println(date);
    }
}

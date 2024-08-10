package com.atguigu.inner;

public class Demo2 {

    /*
        内部类
            1> 如何创建内部类
            2> 内部类访问外部类成员的特点
        分类
            成员内部类
                静态成员内部类
                     1> 如何创建内部类
                        外部类名.内部类名 对象名 = new 外部类名.内部类对象();
                     2> 内部类访问外部类成员的特点
                            静态的只能访问静态的
                非静态成员内部类
                    注意: 不能定义静态的成员
                    1> 如何创建内部类
                        外部类.内部类 对象名 = new 外部类对象().new 内部类对象();
                        外部类.内部类 对象名 = new 外部类名.内部类对象();
                    2> 内部类访问外部类成员的特点
                            可以访问外部类的所有成员,包括私有
            局部内部类


     */
    public static void main(String[] args) {

        /*Outer.Inner1 inner1 = new Outer.Inner1();
        // inner1.method1();
        inner1.method2();*/

        Outer.Inner2 inner2 = new Outer().new Inner2();
        inner2.method2();
    }
}

class Outer{// 外部类

    private static String a = "----Outer------static----------a--------1";
    private static String b = "----Outer------static----------b--------2";
    private String c = "----Outer------非static----------c--------3";
    private String d = "----Outer------非static----------d--------4";

    // 静态成员内部类
    static class Inner1{
        private static String a = "----Inner1------static----------a--------5";
        private String c = "----Inner1------非static----------c--------6";

        public static void method1(){
            System.out.println(a);//5
            System.out.println(b);//2
            // System.out.println(c);//报错  静态的只能访问静态的
            System.out.println(new Inner1().c);//6 报错
            System.out.println(new Outer().c);//6 报错
            // System.out.println(d);// 报错  静态的只能访问静态的
        }

        public void method2(){
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            // System.out.println(d);// 静态的只能访问静态的
        }
    }

    // 非静态成员内部类
    class Inner2{
        private String c = "----Inner1------非static----------c--------6";


        public void method2(){
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            System.out.println(d);//
        }
    }

}


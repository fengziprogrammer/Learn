package com.atguigu.test;

public class Demo5 {

    /*
        构造器 构造方法
        作用
            构造对象,对属性赋值
        格式
            权限修饰符 类名(){}

            特点
                1> 没有定义构造器时,系统给出一个空参构造
                2> 没有自定义构造器时,系统将不再给出一个空参构造
                3> 每创建一个对象,对应调用对应的构造

          成员变量与局部变量的区别
            书写代码位置
                局部变量:归属于方法,写在方法内或者方法的声明上
                成员变量:归属于对象,写在类中方法外
            内存空间
                局部变量:栈内存
                成员变量:堆内存
            生命周期
                局部变量:归属于方法,随着方法的调用而产生,随着方法的结束而消失
                成员变量:归属于对象,随着对象的创建而创建,随着对象的消失而消失(GC垃圾回收机制)
           初始默认值
                局部变量:没有默认值
                成员变量:有默认值

                匿名对象
                    没有名字的对象  使用时 代码更加简洁
                    匿名对象只能使用一次 ;结束变成垃圾

                    应用场景
                        一般是当做参数进行使用

     */
    public static void main(String[] args) {

        // 创建了一个Test对象
        /*Test test1 = new Test();
        System.out.println(test1);

        Test test2 = new Test();
        System.out.println(test2);
        System.out.println(test2.num);// 0
        System.out.println("-----------");
        System.out.println(new Test().num);

        Test test3 = new Test(3);
        System.out.println(test3);
        System.out.println(test3.num);//3?*/

        Test test1 = new Test();
        test1.num = 10;
        test1.num = 20;
        System.out.println(test1.num);
        test1.method1();
        test1.method2();

        new Test().num = 88;
        System.out.println(new Test().num);//
        new Test().method1();
        new Test().method2();

        show(test1);

        Test test2 = new Test();
        show(test2);
        show(new Test());
        // show(int a); show(3)

    }

    public static void show(Test test){

    }
}


class Test{
    int num;//成员变量  有默认值 0

    public Test(){
        //System.out.println("----------空参构造");
    }

    public Test(int a){
         num= a;
        //System.out.println("----------有参构造");
    }

    public void method1(){
        System.out.println("-------method1-");
    }
    public void method2(){
        System.out.println("-------method1-");
    }
}

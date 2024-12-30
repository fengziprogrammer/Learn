package com.itheima.sh.d_reflect_04;

import org.junit.Test;

import java.lang.reflect.Method;

public class MethodTest02 {

    @Test
    public void test01() throws Exception{
        //需求：使用反射技术执行Person类中的方法show
        /*
            分析：show方法是无参，无返回值的公共方法
         */
        //1.获取Person类的Class对象
        Class clazz = Person.class;
        //2.获取Method对象
        Method m = clazz.getDeclaredMethod("show");
        //3.使用对象m调用Method类中的方法执行show
        /*
             Object invoke(Object obj, Object... args) 对带有指定参数的指定对象调用由此 Method 对象表示的底层方法。
                    参数：
                        Object obj：表示要运行方法的依赖的对象，例如运行show方法，那么obj就必须是show方法所属类Person对象
                        args：方法实参
         */
//        Person p1 = new Person();
//        Person p2 = new Person();
        /*
            public void show(){
                System.out.println("show.....");
            }
         */
//        m.invoke(p1)
        //clazz.newInstance() 表示调用Person类中公共的无参构造方法创建Person类的对象
        m.invoke(clazz.newInstance());
    }

    @Test
    public void test02() throws Exception{
        //需求：使用反射技术执行Person类中的方法method
        //1.获取Person类的Class对象
        Class<?> clazz = Class.forName("com.itheima.sh.d_reflect_04.Person");
        //2.获取method方法
        /*
            private static String method(int x,String s){
                    System.out.println("method....x="+x+"---"+s);
                    //返回给调用者
                    return s;
                }
         */
        //"method" 方法名
        // int.class, String.class 表示获取的方法 method(int x,String s)的形参Class类型
        Method m = clazz.getDeclaredMethod("method", int.class, String.class);
        //3.暴力反射
        m.setAccessible(true);
        //4.执行方法
        /*
            使用Method类中的方法：
                Object invoke(Object obj, Object... args) 对带有指定参数的指定对象调用由此 Method 对象表示的底层方法。
                    参数：
                        Object obj：表示要运行方法的依赖的对象，例如运行method方法，
                            那么obj就必须是method方法所属类Person对象
                        args：方法实参

                注意：
                    1.由于获取的方法method属于静态方法，所以invoke方法第一个参数可以书写null或者给对象
                    2.由于获取的方法method具有返回值，所以这里底层会将返回值赋值给obj
         */
        Object obj = m.invoke(null, 20, "尼古拉斯赵四");

        //输出
        System.out.println("obj = " + obj);


    }
}

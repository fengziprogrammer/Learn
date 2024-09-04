package com.atguigu.genericity;

public class Demo11 {


    /*
     定义方法时 ,需要泛型
        位置
            在【修饰符】与返回值类型之间

            实例方法:
                1> 如果一个方法的泛型与类的泛型是一致的  方法上的泛型可以省略  推荐省略
                2> 如果一个方法的泛型与类的泛型是不一致的  方法上的泛型必须声明
            静态方法
                1> 如果定义的是静态方法,推荐使用的泛型要和类的泛型不一致
                2> 如果定义的是静态方法,即使定义的泛型类型字母与类的泛型一致,编译运行时,也会被当做是两个不一致的类型
     */
    public static void main(String[] args) {

        ClassCC<String> cc1 = new ClassCC<>();
        cc1.method1("aaa");
        cc1.method1("bb");
        // cc1.method1(33);// 报错   必须只能和类的泛型一致

        cc1.method2(33);// 不报错   可以和类的泛型不一致

        cc1.method3(true);// 不报错  肯定和类的泛型不一致

        System.out.println("-----------------------------");
        cc1.method4(99);
        ClassCC.method4(true);

        ClassCC.method5('c');
    }
}

class ClassCC<S>{

    // 如果一个方法的泛型与类的泛型是一致的  方法上的泛型可以省略  推荐省略
    public void method1(S s){
        System.out.println(s);
    }

    public <S>void method2(S s){// 没有省略  不推荐
        System.out.println(s);
    }

    // 如果一个方法的泛型与类的泛型是不一致的  方法上的泛型必须声明
    public<W> void method3(W w){
        System.out.println(w);
    }

    // 1> 如果定义的是静态方法,推荐使用的泛型要和类的泛型不一致    推荐
    public static <F>void method4(F f){
        System.out.println(f);
    }

     // 2> 如果定义的是静态方法,即使定义的泛型类型字母与类的泛型一致,编译运行时也会被当做是两个不一致的类型
     public static <S>void method5(S s){
         System.out.println(s);
     }
}

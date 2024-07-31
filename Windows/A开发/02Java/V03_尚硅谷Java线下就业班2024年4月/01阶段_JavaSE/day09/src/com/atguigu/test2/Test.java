package com.atguigu.test2;

public class Test {

    /*
        虚方法
        多态的状态下
            编译 :看父类
                优先级  1> 最匹配 2> 找兼容
            运行
                如果有重写 -> 子类  没有重写 -> 父类
     */
    public static void main(String[] args) {

        MyClass my = new MySub();

        Father f = new Father();
        Son s = new Son();
        Daughter d = new Daughter();

        // my.method(f);//1            3
        // my.method(s);//2               2
        my.method(d);//1      3
    }
}

class MyClass{
    public void method(Father f) {
        System.out.println("fu-----father------1");
    }
    public void method(Son s) {
        System.out.println("fu-----son--------2");
    }
}
class MySub extends MyClass{
    public void method(Father d) {// 1方法的重写
        System.out.println("sub--father--------3");
    }
    public void method(Daughter d) {
        System.out.println("sub--daughter-------4");
    }
}
class Father{

}
class Son extends Father{

}
class Daughter extends Father{

}

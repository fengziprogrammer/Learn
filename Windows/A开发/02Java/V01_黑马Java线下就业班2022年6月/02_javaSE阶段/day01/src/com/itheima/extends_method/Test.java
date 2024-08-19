package com.itheima.extends_method;
/*
    继承中成员方法访问特点: 就近原则

    先去子类中找 , 子类没有找父类非私有成员 , 如果父类在没有那么就会报错

    注意 : Java中所有的类都会间接或者直接继承Object(祖宗类)
 */
public class Test {
    public static void main(String[] args) {
        Son s = new Son();
        // s.method();
        s.show();
        s.useFatherSow();
        // System.out.println(s.toString());
    }
}
//class Father {
class Father extends Object{
    public void show(){
        System.out.println("父类的show方法");
    }

    public void method(){
        System.out.println("父类的method方法");
    }

//    public String toString(){
//        return "父类的toString方法";
//    }
}

class Son extends Father{

    public void useFatherSow(){
        super.show();
    }


    public void show(){
        System.out.println("子类的show方法");
    }

//    public String toString(){
//        return "子类的toString方法";
//    }
}

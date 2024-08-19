package com.itheima.extends_contructor;
/*
    this : 本类对象引用
    super: 父类数据存储内存空间(父类对象引用)

    使用方式 :
        访问成员变量
            this.成员变量名
            super.成员变量名
        访问成员方法
            this.成员方法名(参数)
            super.成员方法名(参数)
        访问构造方法 : 必须在构造方法中使用 , 而且必须是构造方法的第一行有效数据位置
            this(参数);
            super(参数);
 */
public class Test3 {

}

class Father{

    public Father(){}
    public Father(int a){}

    int age = 50;
    public void show(){
        System.out.println("父类中的show方法");
    }
}

class Son extends Father{
    int num ;
    public Son(){
        this(10);
    }
    public Son(int a){
        super();
        this.num = a;
    }

    int age = 30;
    public void show(){
        System.out.println("子类中的show方法");
    }

    public void method(){
        System.out.println(this.age);// 30
        System.out.println(super.age);// 50

        this.show();// 本类中的show方法
        super.show();// 父类中的show方法
    }
}
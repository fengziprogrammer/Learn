package com.atguigu.test;

public class Demo6 {

    /*
        代码块
            格式:
                非静态代码块
                    {}
                静态代码块
                    static{}
             加载时机
                非静态代码块
                    每创建一次对象,执行一次,优先于构造器执行
                静态代码块
                    随着类的加载而加载
              在继承下静态代码块与非静态代码块执行时机
                 静态优先
                 父类优先

                fu静态代码块 >zi静态代码块> fu非静态代码块> fu构造代码块 > z非静态代码块> z构造代码块

     */
    public static void main(String[] args) {

        ClassYY yy1 = new ClassYY();
        //ClassXX xx2 = new ClassXX();
        //ClassXX xx3 = new ClassXX(3);

    }
}

class ClassXX{

    int num;

    {
        System.out.println("-ClassXX------非static-----代码块");
    }

    static {
        System.out.println("-ClassXX------static-----代码块");
    }

    public ClassXX(){
        System.out.println("--fu------空参构造");
    }

    public ClassXX(int num){
        this.num = num;
        System.out.println("---fu-----有参参构造");
    }

}

class ClassYY extends ClassXX{

    {
        System.out.println("-zi------非static-----代码块");
    }

    static {
        System.out.println("-zi------static-----代码块");
    }

    public ClassYY() {

        System.out.println("---zi------空参构造-");
    }

    public ClassYY(int num) {
        super(num);
        System.out.println("---zi------有参构造-");
    }
}

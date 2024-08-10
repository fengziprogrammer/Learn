package com.atguigu.inner;

public class Demo1 {

    public static void main(String[] args) {

    }
}

class Driver{ // 外部类

    String name;
    private int age;

    class Car{// 仅对该类的驾驶员提供服务   内部类

        public void run(){
            System.out.println("驾汽车行驶在路上");
        }
    }

    public void run(){
        new Car().run();
        //System.out.println("驾驶汽车行驶在路上");
    }
}



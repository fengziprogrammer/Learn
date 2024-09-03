package com.itheima.innerclass_demo.anonymous_innerclass;

/*
     以匿名对象的方式使用
       1 使用父类型变量多态接收该匿名子类对象。
       2 以匿名对象的方式使用
            1) 直接调用方法使用
            2) 当做方法的参数传递  !!!
            3) 当做方法的返回值使用
 */
public class Test2 {
    public static void main(String[] args) {
        // 1) 直接调用方法使用
        new Flyable() {
            @Override
            public void fly() {
                System.out.println("飞~");
            }
        }.fly();



        //  2) 当做方法的参数传递  !!!
        useFly(new Flyable() {
            @Override
            public void fly() {
                System.out.println("飞~");
            }
        });

    }
    /*
        Flyable flyable = new Flyable() {
            @Override
            public void fly() {
                System.out.println("飞~");
            }
        }
     */
    public static void useFly(Flyable flyable) {
        flyable.fly();
    }


    public static Flyable getFlyable(){
        return new Flyable() {
            @Override
            public void fly() {
                System.out.println("飞~");
            }
        };
    }

}

// 接口
interface Flyable {
    public abstract void fly();
}
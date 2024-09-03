package com.itheima.innerclass_demo.anonymous_innerclass;

/*
    匿名内部类格式 :
        new  抽象类名/接口名(){
            重写抽象方法
        };

        注意 : 匿名内部类创建的是一个  子类/实现类  对象
 */
public class Test1 {
    public static void main(String[] args) {
//        Swimming s = new Swimming(){
//            @Override
//            public void swim() {
//                System.out.println("游泳");
//            }
//        };
//
//        s.swim();


        useSwimming(new Swimming() {
            @Override
            public void swim() {
                System.out.println("游泳");
            }
        });
    }

    // 方法的参数是一个接口 , 那么调用此方法需要传入此接口的实现类对象
    /*
        Swimming swimming = new SwimmingImpl()
     */
    public static void useSwimming(Swimming swimming) {
        swimming.swim();
    }
}

// 接口
interface Swimming {
    public abstract void swim();
}

package com.itheima.lambda_demo;

/*
    Lambda表达式体验 :
 */
public class LambdaDemo {
    public static void main(String[] args) {
        // useSwimming(new SwimmingImpl());

        useSwimming( new Swimming() {
            @Override
            public void swim() {
                System.out.println("铁汁, 我们去游泳吧...");
            }
        } );

        useSwimming(() -> {System.out.println("铁汁, 我们去游泳吧...");});
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

//// 接口的实现类
//class SwimmingImpl implements Swimming {
//    @Override
//    public void swim() {
//        System.out.println("铁汁, 我们去游泳吧...");
//    }
//}
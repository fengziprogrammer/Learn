package com.itheima.lambda_demo.lambda_test2;

import java.util.Random;

/*
    1 首先存在一个接口（RandomNumHandler）
    2 在该接口中存在一个抽象方法（getNumber），该方法是无参数但是有返回值
    3 在测试类（RandomNumHandlerDemo）中存在一个方法（useRandomNumHandler），方法的的参数是RandomNumHandler类型的
        在方法内部调用了RandomNumHandler的getNumber方法
 */
public class LambdaTest3 {
    public static void main(String[] args) {
        useRandomNumHandler(new RandomNumHandler() {
            @Override
            public int getNumber() {
                // System.out.println("第二步");
                Random r = new Random();
                return r.nextInt(10) + 1;
            }
        });

        System.out.println("=====================");

        useRandomNumHandler(() ->
                new Random().nextInt(10) + 1
        );
    }

    public static void useRandomNumHandler(RandomNumHandler randomNumHandler) {
        // System.out.println("第一步");
        int result = randomNumHandler.getNumber();
        // System.out.println("第三步");
        System.out.println(result);
    }
}

@FunctionalInterface
interface RandomNumHandler {
    public abstract int getNumber();
}
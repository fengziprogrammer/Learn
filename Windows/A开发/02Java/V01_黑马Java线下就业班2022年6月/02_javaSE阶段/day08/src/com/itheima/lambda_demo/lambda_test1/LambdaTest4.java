package com.itheima.lambda_demo.lambda_test1;

/*
    1 首先存在一个接口（Calculator）
    2 在该接口中存在一个抽象方法（calc），该方法是有参数也有返回值
    3 在测试类（CalculatorDemo）中存在一个方法（useCalculator）
        方法的的参数是Calculator类型的
        在方法内部调用了Calculator的calc方法
 */
public class LambdaTest4 {
    public static void main(String[] args) {
        useCalculator(new Calculator() {
            @Override
            public int calc(int a, int b) {
                return a > b ? a : b;
            }
        });

        System.out.println("=======================");

        useCalculator((int x, int y) -> {
            return x > y ? x : y;
        });

    }

    public static void useCalculator(Calculator calculator) {
        int max = calculator.calc(20, 10);
        System.out.println(max);
    }
}

@FunctionalInterface
interface Calculator {
    public abstract int calc(int a, int b);
}

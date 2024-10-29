package com.itheima.lambda_demo.lambda_test2;

/*
    Lambda表达式的使用前提 :
        1 有一个接口
        2 接口中有且仅有一个抽象方法

    练习1：
        1 编写一个接口（ShowHandler）
        2 在该接口中存在一个抽象方法（show），该方法是无参数无返回值
        3 在测试类（ShowHandlerDemo）中存在一个方法（useShowHandler），方法的的参数是ShowHandler类型的，在方法内部调用了ShowHandler的show方法
 */
public class LambdaTest1 {
    public static void main(String[] args) {
        useShowHandler(new ShowHandler() {
            @Override
            public void show() {
                System.out.println("匿名内部类的实现方式...");
            }
        });

        System.out.println("=======================");

        useShowHandler(() -> System.out.println("lambda实现方式"));
    }

    /*
        ShowHandler showHandler = new ShowHandler() {
            @Override
            public void show() {
                System.out.println("匿名内部类的实现方式...");
            }
        }

        ShowHandler showHandle = () -> {System.out.println("lambda实现方式");}

     */
    public static void useShowHandler(ShowHandler showHandler) {
        showHandler.show();
    }
}

@FunctionalInterface
interface ShowHandler {
    public abstract void show();
}

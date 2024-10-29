package com.itheima.lambda_demo.lambda_test2;

/*
    1 首先存在一个接口（StringHandler）
    2 在该接口中存在一个抽象方法（printMessage），该方法是有参数无返回值
    3 在测试类（StringHandlerDemo）中存在一个方法（useStringHandler），
        方法的的参数是StringHandler类型的，
        在方法内部调用了StringHandler的printMessage方法
 */
public class LambdaTest2 {
    public static void main(String[] args) {
        useStringHandler(new StringHandler() {
            @Override
            public void printMessage(String s) {
                System.out.println(s);
            }
        });

        System.out.println("==========================");

        useStringHandler(s -> System.out.println(s));
    }

    /*
        StringHandler stringHandler = new StringHandler() {
            @Override
            public void printMessage(String s) {
                System.out.println(s);
            }
        }

        StringHandler stringHandle = (String s)->{ System.out.println(s); }
     */
    public static void useStringHandler(StringHandler stringHandler) {
        stringHandler.printMessage("传递给printMessage方的值...");
    }
}

@FunctionalInterface
interface StringHandler {
    public abstract void printMessage(String s);
}
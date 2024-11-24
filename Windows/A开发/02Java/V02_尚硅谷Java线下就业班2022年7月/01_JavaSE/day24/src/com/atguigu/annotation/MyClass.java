package com.atguigu.annotation;

/*
"尚硅谷“就是 MyAnnotation注解中 String value(); 抽象方法的返回值
    等价于

    @Override
    public String value(){
        return "尚硅谷";
    }
 */
@MyAnnotation(value="尚硅谷",info="atguigu")
@YourAnnotaion
public class MyClass {
}

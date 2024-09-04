package com.atguigu.exception;

import java.io.FileNotFoundException;

/*
如果方法签名中有throws，对于方法重写有什么影响？
（1）如果父类或父接口被重写方法，没有throws“编译时异常”，重写方法时，就不能throws编译时异常，但是可以throws运行时异常
（2）如果父类或父接口被重写方法，有throws“编译时异常”，
A：重写方法时，可以不throws编译时异常，
B：重写方法时，可以throws编译时异常，但是要求 <= 被重写方法的异常类型
C：对于运行时异常来说，没有限制。

总结：运行时异常，编译器不管。
     编译器异常： <=
 */
public class TestOverride {
    public static void main(String[] args) {

    }
}

class Father{
    public void method()throws Exception {
        //....
    }
}
class Son extends Father{
    @Override
    public void method()throws FileNotFoundException{
        //....
    }
}
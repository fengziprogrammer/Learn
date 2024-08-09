package com.atguigu.constructor;

public class Son extends Father {
    public Son(){
//        super();//调用父类的无参构造 ，可以省略
    }
    public Son(String info){
        super(info);//调用父类的有参构造
    }
}

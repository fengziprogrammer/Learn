package com.atguigu.b_private;

public class Person {
    String name;

    /**
     * 哪个对象调用的this所在的方法
     * this就代表哪个对象
     * @param name
     */
    public void speak(String name){
        System.out.println(this+"........this");
        System.out.println(this.name+"您好,我是"+name);
    }
}

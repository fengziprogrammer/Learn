package com.itheima.sh.a_junit_test_01;


import org.junit.Test;

public class Junit01Test {

    //定义测试方法
    //如果idea集成了junit包，那么直接按快捷键：alt+enter则有提示
    //@Test 属于注解：标注解释，@Override 是否重写父类方法
    //如果某个方法上面有@Test注解，那么可以使用junit测试框架运行该方法
    /*
        1.被测试的方法必须是公共无参无返回值的方法，被测试的方法不需要被其他方法调用，只是用来测试方法体是否有逻辑问题
        2.运行测试类中的全部测试方法，那么在测试类上右键运行，只会运行有@Test注解的方法
        3.被junit测试框架运行的类，要求类名不能是Test,那么和junit中的@Test注解重名了，那么就不会使用junit的@Test注解了
     */
    @Test
    public void show(){
//        int i =1/0;
        System.out.println("show....");
    }

    @Test
    public void show1(){
//        int i =1/0;
        System.out.println("show1....");
    }

    public void show2(){
//        int i =1/0;
        System.out.println("show2....");
    }
}

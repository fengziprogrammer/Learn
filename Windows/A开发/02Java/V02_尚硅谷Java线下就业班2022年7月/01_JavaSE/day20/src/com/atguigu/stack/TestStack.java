package com.atguigu.stack;

import org.junit.Test;

import java.util.Stack;

//Stack就是顺序栈，它是Vector的子类。
public class TestStack {
    @Test
    public void test02() {
        Stack<String> stack = new Stack<>();
        stack.push("hello");//push压栈
        stack.push("java");
        stack.push("world");

        System.out.println(stack.peek());//查看当前栈顶元素，但是不弹出
        System.out.println(stack.peek());//查看当前栈顶元素，但是不弹出
        System.out.println(stack.peek());//查看当前栈顶元素，但是不弹出
        System.out.println(stack.peek());//查看当前栈顶元素，但是不弹出
        System.out.println(stack.peek());//查看当前栈顶元素，但是不弹出
    }
    @Test
    public void test01(){
        Stack<String> stack = new Stack<>();
        stack.push("hello");//push压栈
        stack.push("java");
        stack.push("world");
        System.out.println(stack);

        /*System.out.println(stack.pop());//pop弹栈，弹出栈顶元素
        System.out.println(stack.pop());//pop弹栈，弹出栈顶元素
        System.out.println(stack.pop());//pop弹栈，弹出栈顶元素
        System.out.println(stack.pop());//pop弹栈，弹出栈顶元素*/
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}

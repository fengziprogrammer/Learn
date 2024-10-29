package com.atguigu.stack;

import java.util.LinkedList;

//LinkedList是链式栈。
public class TestLinkedList {
    public static void main(String[] args) {
        LinkedList<String> stack = new LinkedList<>();
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

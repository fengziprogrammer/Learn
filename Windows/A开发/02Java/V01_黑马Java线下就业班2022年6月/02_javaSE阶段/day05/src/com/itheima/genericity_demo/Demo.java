package com.itheima.genericity_demo;


public class Demo {
    public static void main(String[] args) {
        // 存储数据10
        Node<Integer> node1 = new Node<>();
        // 存储数据20
        Node<Integer> node2 = new Node<>();
        // 存储数据30
        Node<Integer> node3 = new Node<>();

        node1.element = 10;
        node1.next = node2;
        node2.next = node3;

        node2.element = 20;
        node3.element = 20;
        node3.next = null;

    }
}

class Node<E>{
    E element;
    Node<E> next;
}

package com.atguigu.exer.exer9;

import java.util.Iterator;

/*
SingleLinked：单链表
结点：
 */
public class SingleLinked implements Iterable{
    private Node first;//记录第一个结点的地址

    public void add(Object element){
        Node newNode = new Node(element, null);//新结点没有下一个结点

        if(first == null){//first为null，表示当前链表中没有结点，新结点就是第一个结点
            first = newNode;
        }else{
//            链表中最后一个结点.next = newNode;
            //找到当前链表的最后一个结点
            Node node = first;
            while(node.next!= null){//结束循环的时机  node.next = null
                node = node.next;
            }
//            node是最后一个结点
            node.next = newNode;
        }
    }

    @Override
    public Iterator iterator() {
        return new Itr(); //这里要创建一个Iterator接口的实现类对象
    }

    private class Itr implements Iterator{
        Node node = first;

        @Override
        public boolean hasNext() {//判断是否有下一个元素
            return node != null;
        }

        @Override
        public Object next() {//取出下一个元素
            Object element = node.data;
            node = node.next;
            return element;
        }
    }

    private static class Node{
        Object data;//记录数据对象的地址
        Node next;//记录下一个结点的地址

        public Node(Object data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
}


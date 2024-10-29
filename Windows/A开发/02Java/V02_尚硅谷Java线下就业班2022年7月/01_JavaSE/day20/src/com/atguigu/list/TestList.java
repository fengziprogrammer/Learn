package com.atguigu.list;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

/*
2、List系列的集合
（1）List特点：
有序、可以重复、线性、可以根据索引操作元素。

（2）List接口的方法
java.util.List<E>，注意不要导错包了（java.awt.List）
List接口是Collection的子接口，所以Collection接口的所有方法，它都有。
我们下面主要介绍它新增的方法，比Collection接口多的方法。
A：添加
* void add(int index, E ele)
* boolean addAll(int index, Collection<? extends E> eles)
B、删除
E remove(int index)：指定位置删除元素

C：修改
E set(int index, E ele)

D：查询
 E get(int index) ：获取指定位置的元素
 int indexOf(Object o) ：查询o对象在当前List集合的位置，如果有重复的多个相同元素，只返回第1个。
 int lastIndexOf(Object o) ：查询o对象在当前List集合的位置，如果有重复的多个相同元素，只返回最后1个。
 List<E> subList(int fromIndex, int toIndex) ：截取一段[fromIndex, toIndex)

E：遍历
ListIterator<E> listIterator()
ListIterator<E> listIterator(int index)

Iterator<E>接口：
boolean hasNext()
E next()
void remove();

ListIterator<E>是Iterator<E>的子接口。比Iterator功能更强大，
A：可以支持，从任意位置开始从前往后遍历，也支持从后往前遍历。
boolean hasPrevious()
E previous()
B：在遍历过程中，可以显示下标信息
int nextIndex();
int previousIndex()
C：还可以在遍历的过程中添加和修改元素
void add(E e)
void set(E e)
 */
public class TestList {
    @Test
    public void test14() {
        List<String> list = new ArrayList<>();
        list.add("hello");//[0]
        list.add("java");//[1]
        list.add("world");//[2]
        list.add("atguigu");//[3]

        ListIterator<String> iterator = list.listIterator();
        //把"java"替换成"chai"
        while(iterator.hasNext()){
            String str = iterator.next();
            if(str.equals("java")){
                iterator.set("chai");
            }
        }
        System.out.println(list);
    }

    @Test
    public void test13() {
        List<String> list = new ArrayList<>();
        list.add("hello");//[0]
        list.add("java");//[1]
        list.add("world");//[2]
        list.add("atguigu");//[3]

        ListIterator<String> iterator = list.listIterator(list.size());
        //在java前面添加一个"chai"
        while(iterator.hasPrevious()){
            String str = iterator.previous();
            if(str.equals("java")){
                iterator.add("chai");
            }
        }
        System.out.println(list);
    }
    @Test
    public void test12() {
        List<String> list = new ArrayList<>();
        list.add("hello");//[0]
        list.add("java");//[1]
        list.add("world");//[2]
        list.add("atguigu");//[3]

        ListIterator<String> iterator = list.listIterator();
        //在java后面添加一个"chai"
        while(iterator.hasNext()){
            String str = iterator.next();
            if(str.equals("java")){
                iterator.add("chai");
            }
        }
        System.out.println(list);
    }

    @Test
    public void test11() {
        List<String> list = new ArrayList<>();
        list.add("hello");//[0]
        list.add("java");//[1]
        list.add("hello");//[2]
        list.add("world");//[3]
        list.add("hello");//[4]
        list.add("atguigu");//[5]

        ListIterator<String> iter = list.listIterator(3);
        while(iter.hasPrevious()){
            System.out.println(iter.previousIndex() + ":" + iter.previous());
        }
    }

    @Test
    public void test10() {
        List<String> list = new ArrayList<>();
        list.add("hello");//[0]
        list.add("java");//[1]
        list.add("hello");//[2]
        list.add("world");//[3]
        list.add("hello");//[4]
        list.add("atguigu");//[5]

        ListIterator<String> iter = list.listIterator(list.size());
        while(iter.hasPrevious()){
            System.out.println(iter.previousIndex() + ":" + iter.previous());
        }
    }
    @Test
    public void test09() {
        List<String> list = new ArrayList<>();
        list.add("hello");//[0]
        list.add("java");//[1]
        list.add("hello");//[2]
        list.add("world");//[3]
        list.add("hello");//[4]
        list.add("atguigu");//[5]

        ListIterator<String> iter = list.listIterator();
        while(iter.hasNext()){
            System.out.println(iter.nextIndex() + ":" + iter.next());
        }
        System.out.println("----------------");
        while(iter.hasPrevious()){
            System.out.println(iter.previousIndex() + ":" + iter.previous());
        }
    }
    @Test
    public void test08() {
        List<String> list = new ArrayList<>();
        list.add("hello");//[0]
        list.add("java");//[1]
        list.add("hello");//[2]
        list.add("world");//[3]
        list.add("hello");//[4]
        list.add("atguigu");//[5]

        ListIterator<String> iter = list.listIterator();
        while(iter.hasNext()){
            System.out.println(iter.nextIndex() + ":" + iter.next());
        }
    }

    @Test
    public void test07() {
        List<String> list = new ArrayList<>();
        list.add("hello");//[0]
        list.add("java");//[1]
        list.add("hello");//[2]
        list.add("world");//[3]
        list.add("hello");//[4]
        list.add("atguigu");//[5]

        ListIterator<String> iter = list.listIterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }
    @Test
    public void test06() {
        List<String> list = new ArrayList<>();
        list.add("hello");//[0]
        list.add("java");//[1]
        list.add("hello");//[2]
        list.add("world");//[3]
        list.add("hello");//[4]
        list.add("atguigu");//[5]

        System.out.println(list.get(2));//"hello"
        System.out.println(list.subList(2,6));
        System.out.println(list.indexOf("hello"));//0
        System.out.println(list.lastIndexOf("hello"));//4
    }

    @Test
    public void test05() {
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("java");
        list.add(0, "world");

        list.set(1,"柴");
        System.out.println(list);
    }
    @Test
    public void test04(){
        List<Integer> list = new ArrayList<>();//泛型擦除
        list.add(10);
        list.add(20);
        list.add(30);
        list.remove(1);//删除20
        System.out.println(list);

        list.remove(Integer.valueOf(10));
        System.out.println(list);
    }

    @Test
    public void test03() {
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("java");
        list.add(0, "world");

        list.remove(1);
        System.out.println(list);
    }
    @Test
    public void test02(){
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("java");

        List<String> list2 = Arrays.asList("h5", "atguigu");
        list.addAll(1, list2);
        System.out.println(list);
    }

    @Test
    public void test01(){
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("java");
        list.add(0, "world");
        System.out.println(list);
    }
}

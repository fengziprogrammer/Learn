package com.itheima.genericity_demo.genericity_interface;

/*
    模拟一个Collection接口，表示集合，集合操作的数据不确定。
    定义一个接口MyCollection具体表示

    接口泛型指定时机
        1 可以在实现类实现接口时，确定接口中的泛型的类型
        2 如果实现类和接口不指定具体的类型 ,继续使用泛型指定，变成含有泛型的类使用。
 */
public interface MyCollection<E> {
    public abstract void add(E element);

    public abstract void remove(E element);
}

// 如果泛型不指定 , 默认Object类型
class MyCollectionImpl1 implements MyCollection{

    @Override
    public void add(Object element) {

    }

    @Override
    public void remove(Object element) {

    }
}

//1 可以在实现类实现接口时，确定接口中的泛型的类型
class MyCollectionImpl2 implements MyCollection<String>{
    @Override
    public void add(String element) {
    }

    @Override
    public void remove(String element) {
    }
}

//2 如果实现类和接口不指定具体的类型 ,继续使用泛型指定，变成含有泛型的类使用。
class MyCollectionImpl3<E> implements MyCollection<E>{

    @Override
    public void add(E element) {

    }

    @Override
    public void remove(E element) {

    }
}
class Test{
    public static void main(String[] args) {
        MyCollectionImpl3<Integer> collectionImpl3 = new MyCollectionImpl3<>();
    }
}
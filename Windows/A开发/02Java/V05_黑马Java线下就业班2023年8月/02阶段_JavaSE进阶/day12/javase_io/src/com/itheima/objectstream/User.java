package com.itheima.objectstream;

import java.io.Serializable;

//明确：当前类对象要进行序列化或反序列化操作时，必须保证当前类有实现Serializable接口
public class User implements Serializable {
    //默认：添加一个serialVersionUID（会随着序列化操作，把serialVersionUID写入到文件中）
    //在从文件中读取对象时，会比较流中的serialVersionUID 和当前类中的serialVersionUID是否相同

    //只要修改User类中的代码，serialVersionUID值会改变

    //解决方案：手动添加serialVersionUID的值
    private static final long serialVersionUID = 1L;


    private String name;
    private Integer age;
    private transient String address;//当前成员变量不参与序列化操作

    public User() {
    }

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public User(String name, Integer age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

package io;

import java.io.Serializable;
import java.util.Arrays;

/**
 * 使用当前类测试对象流的对象读写操作
 *
 * Serializable接口中没有定义任何抽象方法。而这个接口称为签名接口，是编译器
 * 敏感的一个接口，当编译器编译一个类是如果发现实现了这个接口，则会在编译后的
 * class文件中添加一个方法，作用是将当前类按照结构转换为一组字节。对象输出流
 * 就是利用这个方法将当前对象转换为字节后写出的。由于只有实现该接口编译器才会
 * 添加这个方法，因此对象流写出对象时要求必须实现这个接口，否则会出现异常。
 */
public class Person implements Serializable {
    private String name;
    private int age;
    private String gender;
    /*
        transient关键字
        当一个类实现了序列化接口后，可以通过这个关键字修饰某个属性，那么当
        这个类实例序列化时会忽略这个属性的值。达到对象瘦身的目的。
     */
    private transient String[] otherInfo;

    public Person(String name, int age, String gender, String[] otherInfo) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.otherInfo = otherInfo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String[] getOtherInfo() {
        return otherInfo;
    }

    public void setOtherInfo(String[] otherInfo) {
        this.otherInfo = otherInfo;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", otherInfo=" + Arrays.toString(otherInfo) +
                '}';
    }
}

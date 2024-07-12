package com.itheima;
/*
    类: 对一类具有共同属性和行为事物的描述 (设计图)
    对象: 根据类创建出来的实体 (看得见摸得着的实体)

    类的组成:
        1.属性: 成员变量
        2.行为: 成员方法

    private:
        是一个权限修饰符,可以修饰成员,表示私有
        被private修饰的城规院,只能在本类中访问
        针对被私有的成员变量,我们要提供对应公共的访问方式

    this:
        this可以调用本类成员
        谁调用方法,方法中的this就代表谁
        解决了局部变量和成员变量重名的问题

    构造方法:
        public 方法名(){}
        public Teacher(){}

        我们如果不提供构造,系统会提供一个默认的空参构造
        如果我们提供了带参构造,系统就不会提供空参了!
        结论: 两种构造都手动提

 */
public class Teacher {
    //1.成员变量
    private String name;
    private int age;

    //2.构造方法
    public Teacher() {
    }

    public Teacher(String name, int age) {
        //借助构造方法的加载时机,完成对象赋值
        this.name = name;
        this.age = age;
    }

    //3.成员方法
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

    //4.成员方法
    public void teach(){
        System.out.println("老师在上课..");
    }
}

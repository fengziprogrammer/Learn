package com.itheima.homework.test6;

/*
    创建一个类学生类，定义属性姓名，年龄，性别。要求性别使用枚举类型只能是男或者女两种值。
    创建测试类，定义两个学生对象，设置属性值如下：

    姓名：小明，年龄：18，性别：男
    姓名：小红，年龄：19，性别：女

    要求：枚举名使用Sex，枚举常量名 BOY表示男，Girl表示女。
 */
public class Test6 {
    public static void main(String[] args) {
        Student s = new Student("小明", 18, Sex.BOY);
        s.show();

        Student s2 = new Student("小红", 19, Sex.GIRL);
        s2.show();

    }
}

class Student {
    private String name;
    private int age;
    private Sex sex;

    public Student() {
    }

    public Student(String name, int age, Sex sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
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

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public void show() {
        System.out.println("姓名：" + name + "，年龄：" + age + "，性别：" + sex.getSex());
    }
}


enum Sex {
    BOY("男"), GIRL("女");

private String sex;

private Sex(String sex) {
        this.sex = sex;
        }

public String getSex() {
        return sex;
        }

public void setSex(String sex) {
        this.sex = sex;
        }
        }
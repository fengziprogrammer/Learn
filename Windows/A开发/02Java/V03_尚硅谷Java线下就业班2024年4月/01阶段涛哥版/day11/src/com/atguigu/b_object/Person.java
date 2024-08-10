package com.atguigu.b_object;

import java.util.Objects;

public class Person{
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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

    //重写toString

   /* @Override
    public String toString() {
        return name+","+age;
    }*/

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    /**
     *
     * @param obj
     * @return
     *
     * 问题1:为啥用obj调用name和age报错? 因为此时obj为Object类型接收了Person类型的p2
     *      此处为多态,name和age是Person中的特有属性,多态前提下,不能直接调用子类特有成员,所以报错
     * 解决问题1:
     *      向下转型
     *
     * 问题2:如果传递的不是Person类型,会出现类型转换异常
     * 解决问题2:加个类型判断,如果传递过来的数据属于Person类型,在强转成Person类型
     *
     * 问题3:如果equals方法接收的是null,我们就没有必要判断类型了
     * 解决问题3:直接做非空判断,提高点效率
     *
     * 问题4:如果equals方法接收的是自己,就会出现自己和自己比较,自己跟自己比肯定为true,就没有必要
     *      判断类型,向下转型,比较了
     * 解决问题4:加判断,如果地址值一样,直接返回true
     *
     */
    /*public boolean equals(Object obj){
        if (this==obj){
            return true;
        }

        if (obj==null){
            return false;
        }

        if (obj instanceof Person){
            Person p2 = (Person)obj;
            return this.name.equals(p2.name) && this.age == p2.age;
        }

        return false;

    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

}

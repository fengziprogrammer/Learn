package com.itheima.set_demo;

public class Person {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        return name != null ? name.equals(person.name) : person.name == null;
    }

//    // 存在的意义是为了减少equals方法的执行
//    @Override
//    public int hashCode() {
//        /*
//            p1 : 3 + 7 = 10
//            p2 : 7 + 3 = 10
//         */
//        return age + name.hashCode();
//    }


    @Override
    public int hashCode() {
        /*
            p1 = 220
            p2 = 100
         */
        int result = name != null ? name.hashCode() : 0;
        // 31 :  1,质数   2,不大不小   3,2的五次方-1
        result = 31 * result + age;
        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

package com.itheima.homework.work3;

import java.util.HashSet;

public class Student extends Person {
    private String id;


    public Student(String name, int age, String id) {
        super(name, age);
        this.id = id;
    }

    public Student() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        return id != null ? id.equals(student.id) : student.id == null && super.equals(o) ;
    }

    @Override
    public int hashCode() {
        return (id != null ? id.hashCode() : 0 ) + super.hashCode();
    }
}

class Person{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
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

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }
}
class Test{
    public static void main(String[] args) {
        HashSet<Student> hs = new HashSet<>();

        Student s1 =new Student("张三" , 23 , "it001");
        Student s2 =new Student("张三" , 23 , "it001");
        Student s3 =new Student("李四" , 24 , "it001");

        hs.add(s1);
        hs.add(s2);
        hs.add(s3);

        System.out.println(hs);
    }
}

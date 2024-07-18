package cn;

//IDEA设置自动导包

import com.Student;

public class StudentTest {
    public static void main(String[] args) {
        //不同包下创建Student对象,[1]书写全类名(包名+类名)
        //com.Student stu = new com.Student();

        ///不同包下创建Student对象,[2]导包(IDEA设置自动导包)
        Student stu = new Student();
    }
}

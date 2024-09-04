package com.atguigu.genericity;

import com.atguigu.bean.BeanStudent;
import com.atguigu.bean.Student;

import java.util.ArrayList;
import java.util.Collection;

public class Demo12 {


    /*
        类型通配符
            <?>
      类型通配符上限: <? extends 类型>(规定了上边界)
      ArrayList <? extends Number>: 它表示的类型是Number或者其子类型

    - 类型通配符下限: <? super 类型>(规定了下边界)
      - ArrayListList <? super Number>: 它表示的类型是Number或者其父类型


      addAll(Collection<? extends E> c)  固定上边界

     */
    public static void main(String[] args) {

        Collection<Student> con1 = new ArrayList<>();
        con1.add(new Student("常同学",3));
        con1.add(new Student("王同学",4));
        con1.add(new Student("刘",5));

        System.out.println(con1);
        System.out.println(con1.size());

        Collection<BeanStudent> con2 = new ArrayList<>();
        con2.add(new BeanStudent("王凯",18));
        con2.add(new BeanStudent("丁真",16));
        con2.add(new BeanStudent("蔡徐坤",15));
        con2.add(new BeanStudent("马保国", 66));

        System.out.println(con2);
        System.out.println(con2.size());

        /*
            addAll(Collection<? extends E> c)  固定上边界
            调用者的泛型 是 E
            参数的泛型  ? extends E   泛型的取值范围 <= E
         */

        con1.addAll(con2);
        System.out.println(con1);
        System.out.println(con1.size());
        // con2.addAll(con1);
    }
}

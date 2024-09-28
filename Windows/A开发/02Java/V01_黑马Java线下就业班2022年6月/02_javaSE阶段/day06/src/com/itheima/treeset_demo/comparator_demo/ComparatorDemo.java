package com.itheima.treeset_demo.comparator_demo;

import java.util.Comparator;
import java.util.TreeSet;

/*
    比较器排序 :
        1 TreeSet的带参构造方法使用的是  “比较器排序” 对元素进行排序的
        2 比较器排序，就是让TreeSet集合构造方法接收Comparator接口的实现类对象
        3 重写Comparator接口中的 compare(T o1,T o2)方法 , 指定排序规则
        3 注意 : o1代表的是当前往集合中添加的元素 , o2代表的是集合中已经存在的元素,排序原理与自然排序相同

    排序规则 :
        1 如果返回值为负数，表示当前存入的元素是较小值，存左边
        2 如果返回值为0，表示当前存入的元素跟集合中元素重复了，不存
        3 如果返回值为正数，表示当前存入的元素是较大值，存右边

    练习：
    需求：用比较器排序方式实现下面的需求；
    要求：自定义Teacher老师类，属性为姓名和年龄
              请按照年龄排序，如果年龄一样，
              则按照姓名进行排序。姓名都使用英文字母表示

              "马尔扎哈", 30, "男"
              "迪丽热巴", 30, "女"
              "古力娜扎", 32, "女"

    如果自然排序和比较器排序都存在 , 那么我们优先使用比较器排序
 */
public class ComparatorDemo {
    public static void main(String[] args) {
        System.out.println("迪丽热巴".hashCode());
        System.out.println("马尔扎哈".hashCode());
        // TreeSet<Student> ts = new TreeSet<>(Comparator接口的实现类对象);
        TreeSet<Student> ts = new TreeSet<>(new ComparatorImpl());


        Student s1 = new Student("马尔扎哈", 29, "男");
        Student s2 = new Student("迪丽热巴", 28, "女");
        Student s3 = new Student("古力娜扎", 32, "女");

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);

        for (Student t : ts) {
            System.out.println(t);
        }
    }
}

class ComparatorImpl implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        // 按照年龄的升序排序
        int result = o1.getAge() - o2.getAge();
        return result == 0 ? o1.getName().compareTo(o2.getName()) : result;
    }
}

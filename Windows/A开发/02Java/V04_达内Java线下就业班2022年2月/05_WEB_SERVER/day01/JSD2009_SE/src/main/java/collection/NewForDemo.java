package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 增强型for循环   JDK5推出时推出的一个新特性
 * 它也称为:增强循环或新循环
 * 新循环不取代传统for循环的工作,它只是用相同的语法去遍历集合或数组使用.
 */
public class NewForDemo {
    public static void main(String[] args) {
        String[] array = {"one","two","three","four","five"};
        for(int i=0;i<array.length;i++){
            String str = array[i];
            System.out.println(str);
        }
        /*
            新循环是编译器认可，而不是java虚拟机，编译器在编译源代码时
            发现使用新循环遍历数组时，会将代码改为普通的for循环进行
         */
        for(String str : array){
            System.out.println(str);
        }

        Collection<String> c = new ArrayList<>();
        c.add("one");
        c.add("two");
        c.add("three");
        c.add("four");
        c.add("five");

        /*
            新循环遍历集合会被编译器改为迭代器遍历。
            因此在使用新循环遍历过程中，仍然不能通过集合的方法增删元素
         */
        for(String str : c){
            System.out.println(str);
        }

    }
}

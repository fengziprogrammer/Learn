package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * java的集合框架
 * java.util.Collection接口
 * Collection是所有集合的顶级接口，里面规定了集合操作元素的相关功能方法。
 * 集合与数组一样，用于存储一组元素，但是集合有多个不同的实现类来实现不同的
 * 数据结构。
 *
 * Collection下面有两个常见的子接口：
 * java.util.List:线性表，特点:可以保存重复元素并且有序，可通过下标操作。
 * java.util.Set:不可重复的集合
 * 这里的重复元素判定是依靠元素自身equals方法比较的结果而定。
 *
 * List常见的实现类:
 * java.util.ArrayList,java.util.LinkedList
 * Set常见的实现类:
 * java.util.HashSet
 *
 *
 */
public class CollectionDemo1 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        /*
            boolean add(E e)
            向当前集合中添加一个元素，成功添加后返回true否则返回false
         */
        c.add("one");
        c.add("two");
        c.add("three");
        c.add("four");
        System.out.println(c);
        /*
            int size()
            返回当前集合的元素个数
         */
        int size = c.size();
        System.out.println("size:" + size);

        /*
            boolean isEmpty()
            判断当前集合是否为空集，当集合的size为0时，isEmpty返回值为true
         */
        boolean isEmpty = c.isEmpty();
        System.out.println("是否为空集:"+isEmpty);

        c.clear();//清空集合

        System.out.println(c);
        System.out.println("size:"+c.size());
        System.out.println("是否为空集:"+c.isEmpty());

    }
}








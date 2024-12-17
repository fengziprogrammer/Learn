package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * boolean contains(Object o)
 * 判断当前集合是否包含给定元素
 */
public class CollectionDemo2 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
//        Collection c = new HashSet();
        c.add(new Point(1,2));
        c.add(new Point(3,4));
        c.add(new Point(5,6));
        c.add(new Point(7,8));
        c.add(new Point(1,2));
        /*
            集合重写了toString方法，格式为:
            [元素1.toString(), 元素2.toString(), ......]
         */
        System.out.println(c);

        Point p = new Point(1,2);
        /*
            集合的contains判断包含时的依据为:给定元素是否与集合中现有的元素
            存在equals比较为true的情况，存在则认为包含。
         */
        boolean contains = c.contains(p);
        System.out.println("包含:"+contains);

        /*
            remove方法删除元素时也是删除与集合中equals比较为true的元素
            对于List集合而言，重复元素仅删除一次
         */
        c.remove(p);
        System.out.println(c);

    }
}

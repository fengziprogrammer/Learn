package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 集合的遍历
 * Collection提供了一个方法:
 * Iterator iterator()
 * 该方法会返回一个用于遍历当前集合的迭代器实现类,使用它可以对集合进行遍历.
 *
 * java.util.Iterator接口:迭代器接口
 * 迭代器接口中规定了遍历集合元素所需要的相关方法,使用迭代器遍历需要遵循的
 * 原则为:问,取,删.其中删除元素不是遍历过程中的必要操作.
 * 注:不同的集合实现类都提供了一个用于遍历自身的迭代器实现类,我们不需要知道
 * 它们的名字,用多态的思想把他们看成Iterator进行操作即可.
 *
 */
public class IteratorDemo {
    public static void main(String[] args) {
        /*
           JDK5推出时推出了一个新特性:泛型
           泛型又称为参数化类型,允许我们在使用一个类的时候去指定它里面某属性
           或方法的参数和返回值的类型.使得我们使用这个类时更符合我们需求.
           泛型在集合中被大量使用,用于规定集合中的元素类型.
         */
        Collection<String> c = new ArrayList<>();
        c.add("one");
        c.add("#");
        c.add("two");
        c.add("#");
        c.add("three");
        c.add("#");
        c.add("four");
        c.add("#");
        c.add("five");
        System.out.println(c);
        /*
            迭代器也支持泛型,使用时指定的类型与集合元素类型一致即可.
         */
        Iterator<String> it = c.iterator();
        /*
            boolean hasNext()
            判断集合是否还有元素可以迭代
         */
        while(it.hasNext()){
            /*
                E next()
                获取集合下一个元素(第一次调用时是获取第一个元素,以此类推)
             */
            String str = it.next();
            System.out.println(str);
            if("#".equals(str)){
                /*
                    迭代器有一个要求,在遍历的过程中不能通过集合的方法增删
                    元素,否则会抛出异常
                 */
//                c.remove(str);
                /*
                    迭代器提供的remove方法可以删除本次遍历出来的元素
                 */
                it.remove();
            }
        }

        System.out.println(c);
    }
}

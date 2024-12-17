package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * 集合转换为数组
 * Collection提供了一个方法:toArray(),可以将当前集合转换为一个数组
 */
public class CollectionToArrayDemo {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("one");
        c.add("two");
        c.add("three");
        c.add("four");
        c.add("five");
        System.out.println(c);

//        Object[] array = c.toArray();
        /*
            T[] toArray(T[] array)
            将当前集合转换为数组，该方法要求传入一个数组。如果该数组可用(数组
            长度>=集合的size时)会将当前集合元素存入该数组后再将该数组返回。
            如果不可用会创建一个与参数数组同类型并且长度与集合size一致的数组
            并将元素存入后返回。
         */
        String[] array = c.toArray(new String[c.size()]);
        System.out.println(array.length);
        System.out.println(Arrays.toString(array));
    }
}






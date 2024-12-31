package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 数组转换为集合
 * 数组的工具类:Arrays提供了一个静态方法:asList，可以将一个数组转换为
 * 一个List集合
 */
public class ArrayToListDemo {
    public static void main(String[] args) {
        String[] array = {"one","two","three","four","five"};
        System.out.println("array:"+ Arrays.toString(array));

        List<String> list = Arrays.asList(array);
        System.out.println(list.size());
        System.out.println("list:"+list);

        list.set(1,"2");
        System.out.println("list:"+list);
        /*
            通过数组转换而来的集合，对该集合的元素操作就是对原数组的操作
            这一点需要特别注意!
         */
        System.out.println("array:"+ Arrays.toString(array));
        /*
            由于数组是定长的，因此从数组转换的集合是不可以调用增删元素等
            会影响数组长度的操作，否则会抛出异常：UnsupportedOperationException
         */
//        list.add("six");
        /*
            如果想向集合中增删元素，需要自行创建一个集合，然后将原集合元素
            导入到该集合中即可。

            所有的集合都支持一个参数类型为Collection的构造方法，作用是在
            创建当前集合的同时包含给定集合中的所有元素
         */
        List<String> list2 = new ArrayList<>(list);
        list2.add("six");
        System.out.println(list2);
    }
}






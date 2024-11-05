package com.atguigu.collections;

import org.junit.Test;

import java.text.Collator;
import java.util.*;

/*
Collections 是一个操作 Set、List 和 Map 等集合的工具类。Collections 中提供了一系列静态的方法对集合元素进行排序、查询和修改等操作，还提供了对集合对象设置不可变、对集合对象实现同步控制等方法：
* public static <T> boolean addAll(Collection<? super T> c,T... elements)将所有指定元素添加到指定 collection 中。
* public static <T> int binarySearch(List<? extends Comparable<? super T>> list,T key)在List集合中查找某个元素的下标，但是List的元素必须是T或T的子类对象，而且必须是可比较大小的，即支持自然排序的。而且集合也事先必须是有序的，否则结果不确定。
* public static <T> int binarySearch(List<? extends T> list,T key,Comparator<? super T> c)在List集合中查找某个元素的下标，但是List的元素必须是T或T的子类对象，而且集合也事先必须是按照c比较器规则进行排序过的，否则结果不确定。
* public static <T extends Object & Comparable<? super T>> T max(Collection<? extends T> coll)在coll集合中找出最大的元素，集合中的对象必须是T或T的子类对象，而且支持自然排序
* public static <T> T max(Collection<? extends T> coll,Comparator<? super T> comp)在coll集合中找出最大的元素，集合中的对象必须是T或T的子类对象，按照比较器comp找出最大者
* public static void reverse(List<?> list)反转指定列表List中元素的顺序。
* public static void shuffle(List<?> list) List 集合元素进行随机排序，类似洗牌
* public static <T extends Comparable<? super T>> void sort(List<T> list)根据元素的自然顺序对指定 List 集合元素按升序排序
* public static <T> void sort(List<T> list,Comparator<? super T> c)根据指定的 Comparator 产生的顺序对 List 集合元素进行排序
* public static void swap(List<?> list,int i,int j)将指定 list 集合中的 i 处元素和 j 处元素进行交换
* public static int frequency(Collection<?> c,Object o)返回指定集合中指定元素的出现次数
* public static <T> void copy(List<? super T> dest,List<? extends T> src)将src中的内容复制到dest中
* public static <T> boolean replaceAll(List<T> list，T oldVal，T newVal)：使用新值替换 List 对象的所有旧值
* Collections 类中提供了多个 synchronizedXxx() 方法，该方法可使将指定集合包装成线程同步的集合，从而可以解决多线程并发访问集合时的线程安全问题
* Collections类中提供了多个unmodifiableXxx()方法，该方法返回指定 Xxx的不可修改的视图。
 */
public class TestCollections {
    @Test
    public void test11(){
        /*
        public static <T> boolean replaceAll(List<T> list，T oldVal，T newVal)：使用新值替换 List 对象的所有旧值
         */
        List<String> list = new ArrayList<>();
        Collections.addAll(list,"hello","java","world","hello","hello");

        Collections.replaceAll(list, "hello","chai");
        System.out.println(list);
    }

    @Test
    public void test10(){
        List<Integer> list = new ArrayList<>();
        for(int i=1; i<=5; i++){//1-5
            list.add(i);
        }

        List<Integer> list2 = new ArrayList<>();
        for(int i=11; i<=13; i++){//11-13
            list2.add(i);
        }

        list.addAll(list2);
        System.out.println(list);//[1, 2, 3, 4, 5, 11, 12, 13]
    }

    @Test
    public void test09(){
        /*
         * public static <T> void copy(List<? super T> dest,List<? extends T> src)将src中的内容复制到dest中
         */
        List<Integer> list = new ArrayList<>();
        for(int i=1; i<=5; i++){//1-5
            list.add(i);
        }

        List<Integer> list2 = new ArrayList<>();
        for(int i=11; i<=13; i++){//11-13
            list2.add(i);
        }

        Collections.copy(list, list2);
        System.out.println(list);

        List<Integer> list3 = new ArrayList<>();
        for(int i=11; i<=20; i++){//11-20
            list3.add(i);
        }

        Collections.copy(list, list3);//java.lang.IndexOutOfBoundsException: Source does not fit in dest
        System.out.println(list);

    }
    @Test
    public void test08(){
        /*
        public static int frequency(Collection<?> c,Object o)返回指定集合中指定元素的出现次数
         */
        List<String> list = new ArrayList<>();
        Collections.addAll(list,"hello","java","world","hello","hello");
        int count = Collections.frequency(list, "hello");
        System.out.println("count = " + count);
    }

    @Test
    public void test07(){
        /*
        public static void swap(List<?> list,int i,int j)将指定 list 集合中的 i 处元素和 j 处元素进行交换

         */
        List<String> list = new ArrayList<>();
        Collections.addAll(list,"hello","java","world");

        Collections.swap(list,0,2);
        System.out.println(list);
    }
    @Test
    public void test06() {
        /*
         * public static <T extends Comparable<? super T>> void sort(List<T> list)根据元素的自然顺序对指定 List 集合元素按升序排序
         * public static <T> void sort(List<T> list,Comparator<? super T> c)根据指定的 Comparator 产生的顺序对 List 集合元素进行排序
         */
        List<Man> list = new ArrayList<>();
        list.add(new Man("张三",23));
        list.add(new Man("李四",24));
        list.add(new Man("王五",25));

        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list, new Comparator<Man>() {
            @Override
            public int compare(Man o1, Man o2) {
                return Collator.getInstance(Locale.CHINA).compare(o1.getName(),o2.getName());
            }
        });
        System.out.println(list);
    }

    @Test
    public void test05(){
        /*
        public static void shuffle(List<?> list) List 集合元素进行随机排序，类似洗牌，打乱顺序
         */
        List<String> list = new ArrayList<>();
        Collections.addAll(list,"hello","java","world");

        Collections.shuffle(list);
        System.out.println(list);
    }

    @Test
    public void test04(){
        /*
        public static void reverse(List<?> list)反转指定列表List中元素的顺序。
         */
        List<String> list = new ArrayList<>();
        Collections.addAll(list,"hello","java","world");
        System.out.println(list);

        Collections.reverse(list);
        System.out.println(list);
    }

    @Test
    public void test03(){
        /*
         * public static <T extends Object & Comparable<? super T>> T max(Collection<? extends T> coll)
         *      <T extends Object & Comparable<? super T>>：要求T必须继承Object，又实现Comparable接口，或者T的父类实现Comparable接口
         *      在coll集合中找出最大的元素，集合中的对象必须是T或T的子类对象，而且支持自然排序
         * public static <T> T max(Collection<? extends T> coll,Comparator<? super T> comp)
         *      在coll集合中找出最大的元素，集合中的对象必须是T或T的子类对象，按照比较器comp找出最大者
         *
         */
        List<Man> list = new ArrayList<>();
        list.add(new Man("张三",23));
        list.add(new Man("李四",24));
        list.add(new Man("王五",25));

        /*Man max = Collections.max(list);//要求Man实现Comparable接口，或者父类实现
        System.out.println(max);*/

        Man max = Collections.max(list, new Comparator<Man>() {
            @Override
            public int compare(Man o1, Man o2) {
                return o2.getAge()-o2.getAge();
            }
        });
        System.out.println(max);
    }

    @Test
    public void test02(){
        /*
         * public static <T> int binarySearch(List<? extends Comparable<? super T>> list,T key)
         *      要求List集合的元素类型 实现了 Comparable接口，这个实现可以是T类型本身也可以T的父类实现这个接口。
         *      说明List中的元素支持自然排序功能。
         *      在List集合中查找某个元素的下标，但是List的元素必须是T或T的子类对象，而且必须是可比较大小的，即支持自然排序的。而且集合也事先必须是有序的，否则结果不确定。
         * public static <T> int binarySearch(List<? extends T> list,T key,Comparator<? super T> c)
         *      说明List集合中元素的类型<=T，Comparator<? super T>说明要传入一个Comparator接口的实现类对象，实现类泛型的指定要求>=T
         *      例如：List中存储的是Man（男）对象，T可以是Person类型，实现Comparator的时候可以是 Comparator<Person>
         *      例如：List中存储的是Man（男）对象，T可以是Man类型，实现Comparator的时候可以是 Comparator<Person>
         *     在List集合中查找某个元素的下标，但是List的元素必须是T或T的子类对象，而且集合也事先必须是按照c比较器规则进行排序过的，否则结果不确定。
         *
         * 二分查找要求数组或List必须是“有大小顺序”。
         * 二分查找的思路： 和[mid]元素比较，如果相同，就找到了，不相同要看大小关系，决定去左边还是右边继续查找。
         */
        List<Man> list = new ArrayList<>();
        list.add(new Man("张三",23));
        list.add(new Man("李四",24));
        list.add(new Man("王五",25));

//        int index = Collections.binarySearch(list, new Man("王五", 25));//要求实现Comparable接口
//        System.out.println(index);

        int index = Collections.binarySearch(list, new Man("王五", 25), new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        });
        System.out.println(index);
    }

    @Test
    public void test01(){
        /*
        public static <T> boolean addAll(Collection<? super T> c,T... elements)将所有指定元素添加到指定 collection 中。
        Collection的集合的元素类型必须>=T类型
         */
        Collection<Object> coll = new ArrayList<>();
        Collections.addAll(coll, "hello","java");
        Collections.addAll(coll, 1,2,3,4);

        Collection<String> coll2 = new ArrayList<>();
        Collections.addAll(coll2, "hello","java");
//        Collections.addAll(coll2, 1,2,3,4);//String和Integer之间没有父子类关系
    }
}

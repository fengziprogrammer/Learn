package collection;

import java.util.*;

/**
 * 排序含有自定义类型元素的集合
 */
public class SortListDemo2 {
    public static void main(String[] args) {
        List<Point> list = new ArrayList<>();
        list.add(new Point(7,8));
        list.add(new Point(6,4));
        list.add(new Point(3,1));
        list.add(new Point(7,9));
        list.add(new Point(12,54));
        list.add(new Point(1,2));
        System.out.println(list);
        /*
            Collections.sort(List list)该方法对List集合进行自然排序
            即:从小到大排序。但是该方法对集合有一个要求，元素必须实现了接口
            Comparable，否则编译不通过。
            该接口中有一个抽象方法要求实现类重写，用于定义该类元素之间的大小关系
            java中很多常用的类都实现了它，比如String,包装类。

            当我们调用一个方法，而这个方法反过来还要求我们为其修改其他地方的
            代码(比如这里要求我们修改Point类去实现Comparable接口并重写方法)，
            这种现象称为侵入性，侵入性越高(改的代码越多)越不利。写程序应当尽量
            避免侵入性。

         */
//        Collections.sort(list);

        /*
            Collections提供了一个重载sort方法，要求再传入一个参数:比较器
            Comparator是比较器接口，实现它就需要重写方法:compare来定义
            两个要比较的元素的大小规则。通常我们直接以匿名内部类形式创建为
            集合的排序使用。
            该方法中compare方法的两个参数就是要比较的两个元素，方法返回值为
            比较大小的关系，定义如下:
            当返回值>0，表示参数o1比o2大
            当返回值<0，表示参数o1比o2小
            当返回值=0，表示o1与o2相等
         */

//        Collections.sort(list,new Comparator<Point>(){
//            public int compare(Point o1, Point o2) {
//                return o1.getX()*o1.getX()+o1.getY()*o1.getY() -
//                        o2.getX()*o2.getX()-o2.getY()*o2.getY();
//            }
//        });
        Collections.sort(list,(o1,o2)->
               o1.getX()*o1.getX()+o1.getY()*o1.getY() -
                       o2.getX()*o2.getX()-o2.getY()*o2.getY()
        );
        System.out.println(list);


    }
}







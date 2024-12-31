package collection;

import java.util.ArrayList;
import java.util.List;

/**
 * List subList(int start,int end)
 * 获取当前集合中指定范围内的子集
 */
public class ListDmo3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<10;i++){
            list.add(i);
        }
        System.out.println(list);
        //获取3-7
        List<Integer> subList = list.subList(3,8);
        System.out.println(subList);
        //将子集每个元素扩大10倍
        for(int i=0;i<subList.size();i++){
            int num = subList.get(i);
            num = num * 10;
            subList.set(i,num);
        }
        //[30,40,50,60,70]
        System.out.println(subList);
        /*
            当我们通过一个List集合获取到一个子集后，对这个子集的任何操作
            就是对原集合这段元素的操作
         */
        System.out.println(list);

        //删除list集合中的2-8
        list.subList(2,9).clear();
        System.out.println(list);
    }
}





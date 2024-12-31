package collection;

import java.util.LinkedList;
import java.util.Queue;

/**
 * java.util.Queue 队列接口
 * Queue继承自Collection，所以队列本身也是一种集合。
 * 队列可以保存一组元素，但是特点是存取元素必须遵循先进先出原则。
 * 常用实现类:java.util.LinkedList
 */
public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        /*
            offer方法:入队操作，元素会被追加到队列末尾
         */
        queue.offer("one");
        queue.offer("two");
        queue.offer("three");
        queue.offer("four");
        queue.offer("five");
        System.out.println(queue);

        /*
            poll方法:出队操作，获取队首元素后该元素从队列中被删除
         */
        String str = queue.poll();
        System.out.println(str);
        System.out.println(queue);
        /*
            peek方法:引用队首元素，获取后该元素仍然在队列中
         */
        str = queue.peek();
        System.out.println(str);
        System.out.println(queue);

        /*
            遍历队列，遍历并不影响元素在队列中。
         */
        for(String s :queue){
            System.out.println(s);
        }
        System.out.println(queue);


        //使用poll方法遍历
        while(queue.size()>0){
            str = queue.poll();
            System.out.println(str);
        }


        System.out.println(queue);//[]
    }
}








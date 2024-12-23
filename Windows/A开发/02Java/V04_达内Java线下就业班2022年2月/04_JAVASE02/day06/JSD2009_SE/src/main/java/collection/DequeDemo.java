package collection;

import java.util.Deque;
import java.util.LinkedList;

/**
 *  双端队列接口:java.util.Deque
 *  Deque继承自Queue，特点是队列两端都可以做出入队操作。
 *  常用实现类:java.util.LinkedList
 */
public class DequeDemo {
    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<>();
        deque.offer("one");
        deque.offer("two");
        deque.offer("three");
        deque.offer("four");
        System.out.println(deque);
        //从队首方向入队
        deque.offerFirst("five");
        System.out.println(deque);
        //从队尾方向入队，与offer一致
        deque.offerLast("six");
        System.out.println(deque);

        String str = deque.poll();
        System.out.println(str);
        System.out.println(deque);

        str = deque.pollFirst();
        System.out.println(str);
        System.out.println(deque);

        str = deque.pollLast();
        System.out.println(str);
        System.out.println(deque);



    }
}




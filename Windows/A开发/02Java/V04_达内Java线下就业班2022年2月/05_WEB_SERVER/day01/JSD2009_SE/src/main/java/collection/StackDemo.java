package collection;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 栈结构
 * 栈可以保存一组元素，但是存取元素必须遵循先进后出原则。
 * 通常使用栈结构完成"后退"这样的功能使用。
 *
 * Deque双端队列如果从同一侧做出入队操作就实现了栈结构，因此Deque也为栈
 * 提供它出入栈的经典方法:push,pop
 */
public class StackDemo {
    public static void main(String[] args) {
        Deque<String> stack = new LinkedList<>();
        stack.push("one");
        stack.push("two");
        stack.push("three");
        stack.push("four");
        stack.push("five");
        System.out.println(stack);

        String str = stack.pop();
        System.out.println(str);
        System.out.println(stack);


    }
}







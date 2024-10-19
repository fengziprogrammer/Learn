package com.itheima.exception_demo.throw_demo;
/*
    抛出异常演示 :
        格式 :
            修饰符  返回值类型  方法名(参数列表)  {
                throw new 异常对象();
            }

        注意 :
            1 抛出异常的格式必须在方法的内部完成
            2 如果手动抛出一个异常，下面的代码无法执行
 */
public class Exception_Throw {
    public static void main(String[] args) {
        System.out.println("家里有一个貌美如花的老婆");
        System.out.println("还有一个当官的兄弟");
        System.out.println("自己还有一个买卖");
        System.out.println("这样的生活你要不要?");

        // 创建一个运行时期异常对象并抛出
        throw new RuntimeException();

        // 卑微代码执行不到
        // System.out.println("武大郎的标准生活");
    }
}
package day07回顾代码;
/*
    包装类
        int -> Integer
        char -> Character
        其他的基本类型都是首字母大写!

    Integer
        创建对象
            1.过时的构造方法
                Integer i = new Integer(100);
                Integer i = new Integer("100"); //字符串内容必须是纯数字
            2.推荐的静态方法
                Integer i = Integer.valueOf(200); //静态方法可以通过类名调用的方法
                Integer i = Integer.valueOf("200");

        常用方法 -> String转int方法 -> 转谁调谁的方法!!! -> 调用Integer的方法
            int num = Integer.parseInt("80");

        猜数字小游戏最终版 -> 对应代码完成
 */
public class IntegerDemo {
    public static void main(String[] args) {
        //将整数100,封装为Integer对象
        //Integer i1 = new Integer(100);
        //将String类型对的200,封装为Integer对象,注意字符串内容只能是数字
        //Integer i2 = new Integer("200");

        //java提供了静态方法valueOf来创建Integer的对象
        Integer i3 = Integer.valueOf(666);
        Integer i4 = Integer.valueOf("666");

        //int -> String: 转谁,调谁的方法!!
        //1.和字符串进行拼接
        int i = 300;
        String s1 = i + "";
        System.out.println(s1); //300
        //2.使用String的方法valueOf
        String s2 = String.valueOf(i);
        System.out.println(s2); //300

        //String -> int: 转谁,调谁的方法!!
        String str = "100";
        int ii = Integer.parseInt(str);
        System.out.println(ii); //100
    }
}

package day07回顾代码;
/*
    String
        创建对象
            1. String s1 = "abc"; //双引号创建的字符串对象,是一个常量,在字符串常量池中存储
            2. String s2 = new String(); //空参构造,new出来的都在堆内存
            3. String s3 = new String("字符串"); //带参构造,new出来的都在堆内存
        常用方法
            1. 返回字符串长度 int length();
            2. 比较字符串内容 boolean equals("字符串");
            3. 比较字符串内容,但是忽略大小写 boolean equalsIgnoreCase("字符串");
            4. 去除首尾的空格 String trim();
        用户登录案例最终版 -> 对应代码完成
        聊天室案例最终版 -> 对应代码完成
 */
public class StringDemo {
    public static void main(String[] args) {
        //创建String对象1: 双引号创建的字符串对象,是一个常量,在字符串常量池中存储
        String s1 = "道北吴彦祖";

        //创建String对象2: 构造方法,s2是new出来的,存储在堆内存
        //String s2 = new String();
        //创建String对象3: 构造方法,s3是new出来的,存储在堆内存
        //String s3 = new String("abc");

        //1. 返回字符串长度 int length();
        int length = s1.length();
        System.out.println(length); //5

        //2. 比较字符串内容 boolean equals("字符串");
        String str1 = "qwe";
        String str2 = "QWE";
        System.out.println(str1.equals(str2)); //比内容,false

        //3. 比较字符串内容,但是忽略大小写 boolean equalsIgnoreCase("字符串");
        System.out.println(str1.equalsIgnoreCase(str2)); //比内容忽略大小写,true

        //4. 去除首尾的空格 String trim(); 字符串中间的空格是不会去除的
        //String password = "123456 ";
        //String password = " 123456";
        String password = " 123456 ";
        System.out.println(password.trim());
    }
}

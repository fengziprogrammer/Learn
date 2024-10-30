package string;

/**
 * String类
 * String是不变对象，其不可以被继承，并且String对象一旦创建内容不可改变
 * 若改变内容则必须创建新对象
 * String内部维护一个char数组用来保存对应的所有字符。
 */
public class StringDemo {
    public static void main(String[] args) {
        String s1 = "123abc";
        String s2 = "123abc";//重用s1对象
        String s3 = "123abc";

        System.out.println(s1 == s2);//比较地址时是相同的
        System.out.println(s1 == s3);

        s1 = s1 + "!";//修改内容会创建新对象
        System.out.println("s1:"+s1);
        System.out.println("s2:"+s2);
        System.out.println(s1 == s2);//false 地址不相同了

        String s4 = new String("123abc");//new是强制创建新对象
        System.out.println("s4:"+s4);
        System.out.println(s2 == s4);//false
        //equals方法是比较字符串的内容，这也是将来比较字符串最常用的操作
        System.out.println(s2.equals(s4));//true

        /*
            编译器有一个特点:当编译的时候遇到一个计算表达式可以在编译期间
            确定结果时，编译器就会进行计算并将结果编到class文件中。所以
            下面的代码会被编译器改为:
            String s5 = "123abc";
            因此虚拟机运行时会重用s2对象
         */
        String s5 = "123"+"abc";
        System.out.println("s5:"+s5);
        System.out.println(s2 == s5);//true

        String s = "123";
        String s6 = s + "abc";//修改内容创建新对象
        System.out.println("s6:"+s6);
        System.out.println(s2 == s6);//false



    }
}

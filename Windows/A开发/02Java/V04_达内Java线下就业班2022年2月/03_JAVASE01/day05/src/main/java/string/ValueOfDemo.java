package string;

/**
 * String提供了一组静态的方法:valueOf,作用是一致的，将其他类型转换为String
 * 常用于将基本类型转换为String
 */
public class ValueOfDemo {
    public static void main(String[] args) {
        int a = 123;
        String s1 = String.valueOf(a);//"123"
        System.out.println(s1);

        double dou = 123.123;
        String s2 = String.valueOf(dou);//"123.123"
        System.out.println(s2);

        s1 = a + "";
        System.out.println(s1);
    }
}

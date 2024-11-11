package integer;

/**
 * 包装类常用功能
 */
public class IntegerDemo2 {
    public static void main(String[] args) {
        long lmax = Long.MAX_VALUE;
        System.out.println(lmax);

        long lmin = Long.MIN_VALUE;
        System.out.println(lmin);

        /*
            包装类有一个静态方法:parseXXX可以将字符串转换为基本类型
            前提是该字符串正确描述了基本类型可以保存的值，否则会抛出异常:
            NumberFormatException
         */
        String num = "123";
        int d = Integer.parseInt(num);
        System.out.println(d);
        double dou = Double.parseDouble(num);
        System.out.println(dou);
    }
}

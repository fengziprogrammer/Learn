package string;

/**
 * String substring(int start,int end)
 * 截取当前字符串中指定范围内的字符串
 * 注意，java API中通常使用两个数字表示范围时是"含头不含尾"的
 */
public class SubstringDemo {
    public static void main(String[] args) {
        //            01234567890
        String str = "www.tedu.cn";
        String sub = str.substring(4,8);
        System.out.println(sub);
        //一个参数的则是从指定位置一直截取到字符串末尾
        sub = str.substring(4);
        System.out.println(sub);
    }
}

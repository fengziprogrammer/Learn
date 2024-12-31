package string;

/**
 * boolean startsWith(String str)
 * boolean endsWith(String str)
 * 判断字符串是否是以给定的内容开始或结束的
 *
 */
public class StartsWithDemo {
    public static void main(String[] args) {
        String str = "www.tedu.cn";
        boolean starts = str.startsWith("www.");
        System.out.println("starts:"+starts);

        boolean ends = str.endsWith(".cn");
        System.out.println("ends:"+ends);
    }
}






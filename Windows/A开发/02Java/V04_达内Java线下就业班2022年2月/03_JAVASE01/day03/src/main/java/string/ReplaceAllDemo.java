package string;

/**
 * 字符串支持正则表达式的方法三:
 * String replaceAll(String regex,String str)
 * 将当前字符串中满足正则表达式的部分替换为给定的内容
 */
public class ReplaceAllDemo {
    public static void main(String[] args) {
        String str = "abc123def456ghi";
        //将数字部分换成#NUMBER#
        str = str.replaceAll("[0-9]+","#NUMBER#");
        System.out.println(str);

        String regex = "(wqnmlgdsb|cnm|cnm|mdzz|nc|sg|nmsl|sb|nt|djb)";
        String message = "wqnmlgdsb!你个nc!你是个djb!";
        message = message.replaceAll(regex,"***");
        System.out.println(message);



    }
}

package string;

/**
 * int indexOf(String str)
 * 检索给定字符串在当前字符串中的位置，如果当前字符串不包含该内容则返回值为-1
 */
public class IndexOfDemo {
    public static void main(String[] args) {
        //            0123456789012345
        String str = "thinking in java";
        int index = str.indexOf("in");
        System.out.println(index);//2
        //从指定位置开始查找第一次出现指定字符串的位置
        index = str.indexOf("in",3);
        System.out.println(index);//5
        //查找最后一次出现指定字符串的位置
        index = str.lastIndexOf("in");
        System.out.println(index);//9

        //扩展:可以用于检索是否包含内容，判断是否有重复信息等
    }
}





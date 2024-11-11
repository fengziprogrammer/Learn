package string;

import java.util.Arrays;

/**
 * String支持正则表达式的方法之二:
 * String[] split(String regex)
 * 将当前字符串按照满足正则表达式的部分进行拆分，并将拆分后的各部分以一个String
 * 数组形式返回。
 */
public class SplitDemo {
    public static void main(String[] args) {
//        String str = "abc123def456ghi";
//        String[] arr = str.split("[0-9]+");

        /*
            split如果连续遇到两个可拆分项时，中间会拆分出一个空字符串。
            在字符串开始就遇到时，那么第一项会拆分出空字符串。
            但是在字符串末尾连续遇到拆分项，会忽略所有拆分出来的空字符串。
         */
        String str = ",abc,,def,ghi,,,,,,,,,,,,,,,";
        String[] arr = str.split(",");

        System.out.println(arr.length);
        System.out.println(Arrays.toString(arr));
    }
}




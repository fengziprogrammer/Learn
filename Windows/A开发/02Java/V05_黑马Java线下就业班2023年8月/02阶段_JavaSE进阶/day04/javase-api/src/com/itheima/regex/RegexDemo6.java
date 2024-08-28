package com.itheima.regex;
/*
    分组括号 : 将要重复使用的正则用小括号括起来，当做一个小组看待
    需求 :  window秘钥 , 分为5组，每组之间使用 - 隔开 , 每组由5位A-Z或者0-9的字符组成 , 最后一组没有 -
    举例 :
        xxxxx-xxxxx-xxxxx-xxxxx-xxxxx
        DG8FV-B9TKY-FRT9J-99899-XPQ4G
    分析：
        前四组其一  ：DG8FV-    正则：[A-Z0-9]{5}-
        最后一组    ：XPQ4G     正则：[A-Z0-9]{5}

    结果 : ([A-Z0-9]{5}-){4}[A-Z0-9]{5}

*/
public class RegexDemo6 {
    public static void main(String[] args) {
        System.out.println("DG8FV-B9TKY-FRT9J-99899-XPQ4G".matches("([A-Z0-9]{5}-){4}[A-Z0-9]{5}"));
    }
}

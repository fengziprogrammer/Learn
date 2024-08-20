package com.atguigu.a_stringbuilder;

public class Demo02StringBuilder {
    public static void main(String[] args) {
        //StringBuilder append(任意类型数据) -> 往缓冲区中追加内容,返回StringBuilder自己-> 可以理解为拼接
        StringBuilder sb1 = new StringBuilder();
        sb1.append("张无忌");
        sb1.append("周芷若");
        System.out.println(sb1);

        /*
          如果调用某一个方法,返回了某一个对象,就可以直接往后点此对象的方法
          链式调用
         */
        sb1.append("赵敏").append("灭绝师太").append("金毛狮王").append("紫衫龙王");
        System.out.println(sb1);

        //StringBuilder reverse()->内容翻转,返回StringBuilder自己
        sb1.reverse();
        System.out.println(sb1);

        //String toString()->将StringBuilder对象转成String对象
        String s = sb1.toString();
        System.out.println(s.length());
    }
}

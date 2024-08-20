package com.atguigu.stringbuilder;

public class Demo2 {


    /*
    public StringBuilder append(任意类型)  // 添加数据，并返回对象本身
    public StringBuilder insert(int offset,String str) //指定位置添加数据，并返回对象本身
    public StringBuilder deleteCharAt(int index):  //删除指定位置的字符，并返对象回本身
    public StringBuilder delete(int start,int end) // 删除从start开始到end的内容，并返回对象本身
    public StringBuilder replace(int start,int end,String str) // 从start开始到end用str替换，并返回对象本身
    public StringBuilder reverse() // 返回相反的字符序列
    public String substring(int start) // 从指定位置截取到末尾,返回一个字符串
    public String substring(int start,int end) // 截取(start,end]区间的内容，返回一个字符串
     */
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("");
        sb1.append(3.3);
        sb1.append(true);
        sb1.append("aaa");
        System.out.println(sb1);

        StringBuilder sb2 = sb1.insert(2, "***");
        System.out.println(sb1);
        System.out.println(sb2);//3.***3trueaaa
        System.out.println("--------------");
        sb1.deleteCharAt(1);
        System.out.println(sb1);// 3***3trueaaa

        sb1.delete(0,5);//[0,5)
        System.out.println(sb1);// trueaaa

        sb1.replace(0,2,"9999");
        System.out.println(sb1);// 9999ueaaa

        sb1.reverse();
        System.out.println(sb1);// aaaeu9999

        String str = sb1.substring(1);
        System.out.println(sb1);
        System.out.println(str);// aaeu9999

        String str2 = sb1.substring(0, 3);
        System.out.println(str2);//aae  aaa
        System.out.println(sb1);//aaaeu9999

    }
}

package com;

/*
     数组操作常见的两个异常
        ArrayIndexOutOfBoundsException 数组索引越界, 操作了不存在的索引
        NullPointerException 空指针异常, 引用类型值为null, 而且我们还继续操作它
 */
public class ArrayDemo06 {
    public static void main(String[] args) {
        int[] arr = {1,2,3}; //最大索引是2
        //System.out.println(arr[5]); //ArrayIndexOutOfBoundsException

        arr = null;
        System.out.println(arr[0]); //NullPointerException
    }
}

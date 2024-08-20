package com.atguigu.h_system;

public class Demo01System {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println("start = " + start);//可以测试程序运行效率

        /*
          static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
          数组复制
          src:源数组
          srcPos:从源数组的哪个索引开始复制
          dest:目标数组,复制到哪个数组中去
          destPos:从目标数组的哪个索引开始粘贴
          length:复制多少个
         */
        int[] arr1 = {1,2,3,4,5,6,7,8,9};
        int[] arr2 = new int[10];
        System.arraycopy(arr1,0,arr2,1,5);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+" ");
        }
    }
}

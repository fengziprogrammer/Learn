package com.atguigu.array;



public class Demo1 {

    /*
        查找指定元素第一次在数组中出现的索引
        int[] arr = {1,2,3,4,5};
        查 元素 3 对应的索引  2
     */
    public static void main(String[] args) {
        int[] arr = {1,2,9,4,5,8,3,7};
        int index = getIndex(arr,8);
        System.out.println(index);
    }

    /*
    查找指定元素第一次在数组中出现的索引
    返回值类型  int
    参数列表  int[] arr,int num
    */
    private static int getIndex(int[] arr, int num) {

        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == num){
                index = i;
            }

        }

        return index;
    }


}

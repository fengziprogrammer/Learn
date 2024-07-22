package com.atguigu.homework;

public class Homework2 {

    /*
    思考题:
        1.定义一个方法,求出int数组中的元素最大值
            例 int[] arr ={1,3,5,7,9};
        2.定义一个方法,将一个int数组中的元素进行反转,
            即原数组元素未12345,反转后元素内容为54321
            参数列表   int[] arr
            返回值类型  void

               例 int[] arr ={1,3,5,7,9};
               反转之后 {9,7,5,3,1}
     */
    public static void main(String[] args) {
        int[] arr ={1,3,15,7,9,6,8,4};

       /* int max = getArrMax(arr);
        System.out.println(max);*/
        revArr(arr);
        for(int i = 0; i <= arr.length -1;i++){
            System.out.println(arr[i]);
        }

    }

    /*
    1.定义一个方法,求出int数组中的元素最大值
            例 int[] arr ={1,3,5,7,9};
           参数列表  int[] arr
           返回值类型  int
           1> int max = 任意一个元素  arr[0];
           2> 遍历获取每一个元素 arr[i]
           3. max 与arr[i] 比较
                  max 重新赋值的条件   if(arr[i] > max ){ max = arr[i]}
     */

    public static int getArrMax(int[] arr){
        // 1> int max = 任意一个元素  arr[0];
        int max = arr[0];

        // 2> 遍历获取每一个元素 arr[i]
        for (int i = 1;i<= arr.length-1;i++){// arr[0] 没有必要和arr[0] i的初始值优化为1

            // 3. max 与arr[i] 比较
            // max 重新赋值的条件   if(arr[i] > max ){ max = arr[i]}
            if(arr[i] > max){
                max = arr[i];
            }
        }

        return max;
    }

    /*
     2.定义一个方法,将一个int数组中的元素进行反转,
            即原数组元素未12345,反转后元素内容为54321
            参数列表   int[] arr
            返回值类型  void

               例 int[] arr ={1,3,5,7,9};
               反转之后 {9,7,5,3,1}
           分析
              本质是交换
              交换的次数 : arr.length / 2 (arr.length >>1)
              交换的内容: arr[i]  , arr[max - i]  max = 最大索引
              交换的方式: 引入第三方变量
     */
    public static void revArr(int[] arr){

        // 交换的次数 : arr.length / 2 (arr.length >>1)
        for (int i = 0; i < arr.length / 2;i++){
            // 交换的内容: arr[i]  , arr[max - i]  max = 最大索引
            // 交换的方式: 引入第三方变量
            int max = arr.length -1;
            int temp = arr[i];
            arr[i] = arr[max -i];
            arr[max -i] = temp;

        }


    }
}

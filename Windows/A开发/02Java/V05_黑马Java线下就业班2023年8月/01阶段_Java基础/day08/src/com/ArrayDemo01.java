package com;

/*
    什么是数组?
        用来存储多个相同类型数据的容器

    数组定义格式
        数据类型[] 数组名
            int[] arr -> 常用
        数据类型 数组名[]
            int arr[] -> 能识别

    静态初始化格式?
        数据类型[] 数组名 = new 数据类型[]{元素1,元素2...};
            int[] arr = new int[]{1, 2, 3};
        上述格式可以省略"new 数据类型[]"的书写, 系统会帮我们加上
            int[] arr = {1, 2, 3};

    什么是索引?
	    索引标识了元素在数组中的位置
	    索引从0开始, 是连续的, 逐个+1的

	访问数组元素
	    数组名[索引];
 */
public class ArrayDemo01 {
    public static void main(String[] args) {
        //静态初始化的 完整格式: 不常用
        int[] arr = new int[]{1, 2, 3};
        System.out.println(arr); //[I@776ec8df
        /*
            arr地址值, 了解即可
                [ : 表示是一维数组
                I : int的首字母,表示数组的数据类型
                @ : 分隔符
                776ec8df : 十六进制的内存地址
         */
        //静态初始化的 简化格式: 仅仅是简化了new int[]的书写, 计算机会帮我们补上
        int[] brr = {11, 22, 33};
        System.out.println(brr); //[I@4eec7777

        //获取元素 -> 打印
        System.out.println(brr[0]); //11
        System.out.println(brr[1]); //22
        System.out.println(brr[2]); //33

        //获取元素 -> 修改
        brr[0] = 100;
        brr[1] = 200;
        brr[2] = 300;

        //获取元素 -> 打印修改后元素
        System.out.println(brr[0]); //100
        System.out.println(brr[1]); //200
        System.out.println(brr[2]); //300
    }
}

package com.atguigu.string;

public class Homework3 {

    /*
    需求：把数组中的数据按照指定个格式拼接成一个字符串
	举例：
		int[] arr = {1,2,3,4,5};
	输出结果：
		"[1, 2, 3, 4, 5]"
		分析
		    1> 定义数组 arr
		    2> 定义一个字符串 结果 初始值 "["
		    3> 遍历数组
		    4> 做元素的拼接
                    尾元素 拼接的格式 元素 + "]"
                    除尾元素外的 其他元素  拼接格式 元素 + ", "



     */
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7}; // 1> 定义数组 arr
        // String s = "[";// 2> 定义一个字符串 结果 初始值 "["
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) { // 3> 遍历数组

            if( i == arr.length -1){// 尾元素 拼接的格式 元素 + "]"
                // s += arr[i] + "]";
                sb.append(arr[i] + "]");
            }else{// 除尾元素外的 其他元素  拼接格式 元素 + ", "
                // s += arr[i] + ", ";
                sb.append(arr[i] + ", ");
            }

        }

        String s = sb.toString();
        System.out.println(sb.toString());

    }
}

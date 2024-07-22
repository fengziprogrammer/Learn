package com.atguigu.homework;

public class Homework1 {


    /*
    二维数组的求和
		需求:对公司年销售额求和
		某公司按照季度和月份统计的数据如下：单位(万元)
		第一季度：22,66,44
		第二季度：77,33,88
		第三季度：25,45,65
		第四季度：11,66,99

		遍历
     */
    public static void main(String[] args) {

        int[][] arr = new int[][]{{22,66,44},{77,33,88},{25,45,65},{11,66,99}};
        int sum = 0;//年销售额

        for (int i = 0;i<= arr.length-1;i++){
            // arr[i] 代表每一个一维数组 每一个季度
            for (int j = 0;j<= arr[i].length-1;j++){
                // System.out.println(arr[i][j]);
                sum += arr[i][j];
            }
        }

        System.out.println(sum);

    }


}



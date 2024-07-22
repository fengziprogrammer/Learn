package com.atguigu.param;

//案例：写一个方法可以求n个整数的和
public class MathTools {
/*    public int sum(int[] nums){//(int[] nums)形参
        int he = 0;
        for (int i = 0; i < nums.length; i++) {
            he += nums[i];
        }
        return he;
    }*/

    public int sum(int... nums){//(int... nums)形参
        int he = 0;
        for (int i = 0; i < nums.length; i++) {
            he += nums[i];
        }
        return he;
    }
}

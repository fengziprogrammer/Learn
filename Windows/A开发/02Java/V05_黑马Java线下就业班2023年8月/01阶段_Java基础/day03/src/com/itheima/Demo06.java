package com.itheima;

/*
    案例: for循环案例6(回文数)
        打印所有五位数的回文数(无论从左朝右,还是从右朝左,读起来都相同的数)
        并统计回文数的个数
 */
public class Demo06 {
    public static void main(String[] args) {
        //定义计数器
        int count = 0;
        //获取范围内数据
        for (int i = 10000; i <= 99999; i++) {
            //数值拆分
            int ge = i % 10;
            int shi = i / 10 % 10;
            int qian = i / 1000 % 10;
            int wan = i / 10000 % 10;
            //判断
            if (ge == wan && shi == qian) {
                //计数
                count++;
                //打印回文数
                System.out.println(i);
            }
        }
        //循环结束,打印最终的count
        System.out.println("count:" + count);
    }
}

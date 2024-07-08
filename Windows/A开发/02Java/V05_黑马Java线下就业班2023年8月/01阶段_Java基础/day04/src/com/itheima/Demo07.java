package com.itheima;

/*
    案例: 方法练习2(比较相等)
        设计一个方法比较两个整数是否相等,返回布尔的结果
        使用不同的方式完成比较(三元,if)
 */
public class Demo07 {
    public static void main(String[] args) {
        //4.调用方法
        if(isSame(10,11)){
            System.out.println("相同");
        }else {
            System.out.println("不相同");
        }
    }

    //1.定义方法 返回值类型:boolean 参数列表:int a,int b
    public static boolean isSame(int a,int b){
        //2.使用if进行比较, 返回比较结果
//        if(a == b){
//            return true;
//        }else {
//            return false;
//        }
        //3.使用三元进行比较, 返回比较结果
        return a == b ? true : false;
    }
}

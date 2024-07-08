package com.atguigu.a_while;

public class Demo01While {
    public static void main(String[] args) {
        //1.定义一个变量,表示山峰的高度 mountain
        int mountain = 8844430;
        //2.定义一个变量,表示纸的厚度 paper
        double paper = 0.1;
        //3.定义一个变量,统计折纸次数 count
        int count = 0;
        //4.循环比较,如果纸的厚度小于山峰高度,我们就折(在原来纸的厚度的基础上*2)
        while(paper<mountain){
            paper*=2;//paper = paper*2;
        //5.折一次,count++
            count++;
        }

        System.out.println("count = " + count);
    }
}

package com.atguigu.method;

public class TestVoid {
    //方法：可以打印line行，column列，由某字符组成的矩形
    void printRectangle(int line, int column, char sign){
        if(line<=0 || column<=0 || sign<33 || sign>126){
            return ;//提前结束当前方法的执行
        }

        for(int i=1; i<=line; i++){
            for (int j = 1; j <=column ; j++) {
                System.out.print(sign);
            }
            System.out.println();
        }
    }
}

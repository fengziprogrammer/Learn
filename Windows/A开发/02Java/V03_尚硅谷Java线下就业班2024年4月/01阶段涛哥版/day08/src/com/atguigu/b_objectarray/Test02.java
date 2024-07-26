package com.atguigu.b_objectarray;

public class Test02 {
    public static void main(String[] args) {
        //创建长度为3的数组
        Student[] arr = new Student[3];
        //创建3个Student对象
        Student s1 = new Student("柳岩",80);
        Student s2 = new Student("曼曼",59);
        Student s3 = new Student("涛哥",100);
        arr[0] = s1;
        arr[1] = s2;
        arr[2] = s3;

        /*
          比较的是score
          换的是整个对象
         */
        for (int j = 0; j < arr.length-1; j++) {
            for (int i = 0; i < arr.length-1-j; i++) {
                if (arr[i].getScore()>arr[i+1].getScore()){
                    Student temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getName()+"..."+arr[i].getScore());
        }
    }
}

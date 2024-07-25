package com.atguigu.method;

/*
方法的实参负责给形参赋值：
（1）形参是基本数据类型，那么实参给形参的是数据值，而且是数据值的“副本”。
    形参的修改，如果没有返回，和实参无关，即形参的修改不会影响实参。
（2）形参是引用数据类型（数组、类等），那么实参给形参的是地址值，而且是地址值的“副本”
    形参和实参其实现在指向的是同一个“对象”，
    形参修改了对象的属性或者数组对象的元素，那么相当于实参对象自己修改的。

    但是，如果此时形参指向了新对象/数组，就和实参对象无关了。
 */
public class TestPassValue {
    public static void main(String[] args) {
        TestPassValue t = new TestPassValue();
        int x = 1;
        System.out.println("调用change方法之前： x = " +x);//1
        t.change(x);//实参是x，x把1复制给形参a
        System.out.println("调用change方法之后： x = " +x);//1

        System.out.println("--------------------");
        int[] arr = {1,2,3,4,5};
        System.out.println("调用changeArr之前：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        t.changeArr(arr);
        System.out.println("调用changeArr之后：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.println("------------------------");
        MyData data = new MyData();
        data.num = 1;
        System.out.println("调用changeNum方法之前,data.num = " + data.num);
        t.changeNum(data);
        System.out.println("调用changeNum方法之后,data.num = " + data.num);

        System.out.println("-----------------------------------");
        int[] nums = {1,2,3,4,5};
        System.out.println("调用grow之前nums数组：");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        t.grow(nums);
        System.out.println("调用grow之后nums数组：");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();

    }
    public void grow(int[] arr){
        arr = new int[arr.length*2];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 100;
        }
    }

    public void change(int a){//形参是(int a)，
        a = 2;//把a修改为2 ,修改的是形参，相当于修改的是副本
    }

    public void changeArr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 2;//把元素修改为原来的2倍
        }
    }

    public void changeNum(MyData my){
        my.num = 2;
    }


}

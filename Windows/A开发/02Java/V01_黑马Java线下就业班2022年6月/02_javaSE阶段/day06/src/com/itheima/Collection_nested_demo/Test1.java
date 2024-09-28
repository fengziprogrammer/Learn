package com.itheima.Collection_nested_demo;

import java.util.ArrayList;
import java.util.Collections;

/*
    List嵌套List

    使用场景举例：一年级有多个班级，每个班级有多名学生。要求保存每个班级的学生姓名，保存一个年级所有的班级信息

    思路：
    可以使用List集合保存一个班级的学生
    可以使用List集合保存所有班级

    因此我们可以定义集合如下：
    班级：List<String>
        举例 :
            List<String> 三年一班 = {迪丽热巴 , 古力娜扎 ,马尔扎哈 ,欧阳娜娜}
            List<String> 三年二班 = {李小璐 , 白百何 , 马蓉}
            List<String> 三年三班 = {林丹 ,文章, 陈赫}

    年级：List<List<String>>
        举例 :
            List<List<String>> 年级 = {三年一班 , 三年二班 , 三年三班}
 */
public class Test1 {
    public static void main(String[] args) {
        // 创建一个年级的集合
        ArrayList<ArrayList<String>> 年级 = new ArrayList<>();

        // 创建班级集合
        ArrayList<String> 三年一班 = new ArrayList<>();
        Collections.addAll(三年一班, "迪丽热巴", "古力娜扎", "马尔扎哈", "欧阳娜娜");

        ArrayList<String> 三年二班 = new ArrayList<>();
        Collections.addAll(三年二班, "李小璐", "白百何", "马蓉");

        ArrayList<String> 三年三班 = new ArrayList<>();
        Collections.addAll(三年三班, "林丹", "文章", "陈赫");

        // 把班级添加到年级中
        年级.add(三年一班);
        年级.add(三年二班);
        年级.add(三年三班);

        // 遍历
        for (ArrayList<String> 班级 : 年级) {
            for (String 姓名 : 班级) {
                System.out.println(姓名);
            }
            System.out.println("====================");
        }
    }
}

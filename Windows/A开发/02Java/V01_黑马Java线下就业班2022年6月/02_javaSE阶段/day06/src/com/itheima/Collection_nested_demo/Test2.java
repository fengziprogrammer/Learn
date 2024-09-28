package com.itheima.Collection_nested_demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/*
    List嵌套Map :

    使用场景举例：一年级有多个班级，每个班级有多名学生。要求保存每个班级的学生姓名，姓名有与之对应的学号，保存一年级所有的班级信息。

    思路：
        1 可以使用Map集合保存一个班级的学生（键是学号，值是名字）
        2 可以使用List集合保存所有班级

    因此我们可以定义集合如下：

    班级：Map<String,String> 键是学号，值是姓名
        举例 :
            Map<String,String> 三年一班 = {it001 = 迪丽热巴 , it002 = 古力娜扎 ,it003 = 马尔扎哈 ,it004 = 欧阳娜娜}
            Map<String,String> 三年二班 = {it001 = 李小璐 , it002 = 白百何 , it003 = 马蓉}
            Map<String,String> 三年三班 = {it001 = 林丹 ,it002 = 文章, it003 = 陈赫}

    年级：List<Map<String,String>> 保存每个班级的信息
        举例 :
              List<Map<String,String>> 年级 = {三年一班 , 三年二班 , 三年三班}
 */
public class Test2 {
    public static void main(String[] args) {
        // 创建年级集合
        ArrayList<HashMap<String, String>> 年级 = new ArrayList<>();

        // 创建每一个班级集合对象
        HashMap<String, String> 三年一班 = new HashMap<>();
        三年一班.put("it001", "迪丽热巴");
        三年一班.put("it002", "古力娜扎");
        三年一班.put("it003", "马尔扎哈");
        三年一班.put("it004", "欧阳娜娜");

        HashMap<String, String> 三年二班 = new HashMap<>();
        三年二班.put("it001", "李小璐");
        三年二班.put("it002", "白百何");
        三年二班.put("it003", "马蓉");

        HashMap<String, String> 三年三班 = new HashMap<>();
        三年三班.put("it001", "林丹");
        三年三班.put("it002", "文章");
        三年三班.put("it003", "陈赫");

        // 把三个班级添加到年级中
        年级.add(三年一班);
        年级.add(三年二班);
        年级.add(三年三班);

        // 遍历
        for (HashMap<String, String> 班级 : 年级) {
            Set<String> 班级所有学号 = 班级.keySet();
            for (String 学号 : 班级所有学号) {
                String 姓名 = 班级.get(学号);
                System.out.println("学号:" + 学号 + ", 姓名:" + 姓名);
            }
            System.out.println("======================");
        }
    }
}

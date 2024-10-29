package com.itheima.homework.test7;

import java.util.HashMap;

/*
    需求：研发部门有5个人，信息如下：（姓名-工资） 【柳岩=2100, 张亮=1700, 诸葛亮=1800, 灭绝师太=2600, 东方不败 =3800】
          将以上员工的相关信息存放在适合的集合中,给柳岩涨工资300,迭代出每个元素的内容输出到控制台。
    思路：
    1 使用HashMap存储数据
    2 使用put方法进行对新增或者修改数据
 */
public class Test7 {
    public static void main(String[] args) {
        // 创建集合对象
        HashMap<String, Integer> hm = new HashMap<>();

        // 添加院申诉
        hm.put("柳岩", 2100);
        hm.put("张亮", 1700);
        hm.put("诸葛亮", 1800);
        hm.put("灭绝师太", 2600);
        hm.put("东方不败", 3800);

        // 给柳岩涨工资300
        hm.put("柳岩", hm.get("柳岩") + 3000);

        System.out.println(hm);
    }
}

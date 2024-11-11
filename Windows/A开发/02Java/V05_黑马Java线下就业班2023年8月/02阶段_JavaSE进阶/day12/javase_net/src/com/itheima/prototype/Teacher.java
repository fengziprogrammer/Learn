package com.itheima.prototype;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Teacher {
    private String name;

    //私有化构造方法
    private Teacher() {
    }

    //容器：存储固定数量的Teacher对象
    private static List<Teacher> teachers = new ArrayList<>();

    //固定数量
    private static int max = 3;

    //随着类加载时初始化数据
    static {
        for (int i = 0; i < max; i++) {
            teachers.add(new Teacher());
        }
    }

    //静态方法：获取一个Teacher对象
    public static Teacher getInstance() {
        //随机从集合中获取一个对象
        Teacher teacher = teachers.get(new Random().nextInt(teachers.size()));
        return teacher;
    }



    //静态方法
//    public static Teacher getInstance(int count) {
//        int size = teachers.size();//集合大小
//        int result = count - size;
//        if (result > 0) {
//            for (int i = 0; i < result; i++) {
//                teachers.add(new Teacher());
//            }
//        }
//
//        Teacher t = getInstance();
//        return t;
//    }


}

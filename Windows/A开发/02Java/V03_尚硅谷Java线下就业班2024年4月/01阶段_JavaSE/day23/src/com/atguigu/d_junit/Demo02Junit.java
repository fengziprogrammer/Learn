package com.atguigu.d_junit;

import org.junit.Test;

import java.util.ArrayList;

/**
 * 专门测功能的类
 */
public class Demo02Junit {
    @Test
    public void addCategory(){
        CategoryController categoryController = new CategoryController();
        categoryController.addCategory("服装");
    }

    @Test
    public void findAll(){
        CategoryController categoryController = new CategoryController();
        ArrayList<String> list = categoryController.findAll();
        System.out.println(list);
    }
}

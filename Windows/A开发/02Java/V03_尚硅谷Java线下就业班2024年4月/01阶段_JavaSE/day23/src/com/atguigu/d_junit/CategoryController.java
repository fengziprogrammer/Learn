package com.atguigu.d_junit;

import java.util.ArrayList;

public class CategoryController {
    /**
     * 添加商品分类的功能
     * @param name
     */
    public void addCategory(String name){
        ArrayList<String> list = new ArrayList<String>();
        list.add(name);
        System.out.println(list);
    }

    /**
     * 查询所有商品分类
     */
    public ArrayList<String> findAll(){
        ArrayList<String> list = new ArrayList<String>();
        list.add("服装");
        list.add("箱包");
        list.add("水果");
        list.add("蔬菜");
        return list;
    }
}

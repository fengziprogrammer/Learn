package com.atguigu.a_junit;

import org.junit.Test;

import java.util.List;

/**
 * 此类专门去测我们写好的功能
 */
public class Demo02Junit {
   /* public static void main(String[] args) {
        CategoryController cc = new CategoryController();
        int result = cc.add("蔬菜");
        System.out.println("result = " + result);

        List<String> list = cc.findAllCategory();
        System.out.println(list);
    }*/

    /**
     * 此方法专门测添加功能
     */
    @Test
    public void add(){
        CategoryController cc = new CategoryController();
        int result = cc.add("蔬菜");
        System.out.println("result = " + result);
    }

    /**
     * 此方法专门测查找功能
     */
    @Test
    public void find(){
        CategoryController cc = new CategoryController();
        List<String> list = cc.findAllCategory();
        System.out.println(list);
    }
}

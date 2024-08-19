package com.itheima.extends_override;

/*
    方法重写的作用 : 既可以沿袭父类的功能 , 又可以增加新的功能

    方法重写的注意事项 :
        1 @Override : 注解 , 规范此方法必须是重写父类的方法
        2 私有的方法不能被重写        ****
        3 重写的方法 , 方法名和参数列表必须和父类的方法保持一致
        4 子类重写父类的方法 , 子类方法的权限必须大于或者等于父类方法的权限
          public -- protected -- 默认的 -- private
          建议 : 子父类的方法权限保持一致
        5 子类重写父类的方法 , 子类方法的返回值类型可以是父类方法的返回值类型的子类
 */
public class NewPhone extends Phone {
    @Override
    public void call() {
        System.out.println("开启视频");
        super.call();
    }

    @Override
    public String sendMessage() {
        return "";
    }



    //    @Override
//    public void method(){
//
//    }
}

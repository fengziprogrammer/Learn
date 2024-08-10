package com.atguigu.enum_;

public class Demo1 {

    /*
    JDK1.5之前 如何自定义一个枚举类
        需求
            一个类 对象是有限的几个
            季节  只有固定的四季  春季,夏季,秋季,冬季
            思路
                1> 一般调用构造器 创建对象
                    私有  -> 外部 只能构建0个
                2> 创建对象0个 --> 4个
                    内部构建4个
     */
    public static void main(String[] args) {

        // Season season = new Season();// 报错,私有构造
        Season season1 = Season.SPRING;
        Season season2 = Season.SPRING;
        System.out.println(season1);
        System.out.println(season2);
        System.out.println(season1 == season2);

    }
}

// JDK1.5之前 如何自定义一个枚举类
/*class Season{

    private Season(){}// 1> 私有构造

    // 2.对外提供公共的四个固定对象(public static final)
    public static final Season SPRING = new Season();
    public static final Season SUMMER = new Season();
    public static final Season AUTUMN = new Season();
    public static final Season WINTER = new Season();

}*/

// JDK1.5之后 如何自定义一个枚举类
enum Season{

    SPRING,SUMMER,AUTUMN,WINTER;


}

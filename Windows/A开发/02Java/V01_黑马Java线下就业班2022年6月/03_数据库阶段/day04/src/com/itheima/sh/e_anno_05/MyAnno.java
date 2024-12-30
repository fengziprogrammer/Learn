package com.itheima.sh.e_anno_05;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/*
    说明：
        1.自定义注解使用：@interface 关键字
        2.在注解成员位置定义属性格式：
             public abstract 属性类型 属性名() default 默认值;
              public abstract 属于固定修饰符，可以省略
        3.定义属性时，可以不给默认值，那么在使用属性的时候必须给默认值
 */
//@Target(value={ElementType.METHOD})
@Target(ElementType.METHOD)//表示当前自定义注解MyAnno只能修饰方法
public @interface MyAnno {
    //定义属性
//    public abstract String value() default "柳岩";
    //定义属性
//    int age() default 20;
    int age() default 0;
    String[] names() default {};
    String value() default "";
}

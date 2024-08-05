package com.atguigu.d_final_method;

public abstract class Animal {
   public final void eat(){
       System.out.println("动物要吃饭");
   }

   /*
     final修饰方法不能被重写
     abstract修饰方法必须重写
     所以不能一起使用->冲突
    */
   //public final abstract void drink();

}

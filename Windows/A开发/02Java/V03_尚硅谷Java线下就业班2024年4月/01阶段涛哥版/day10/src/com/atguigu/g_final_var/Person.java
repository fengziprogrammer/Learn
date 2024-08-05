package com.atguigu.g_final_var;

public class Person {
    final String name = "坤坤";
    //final String name;

    public Person() {
        //this.name = "坤坤";
    }

    /**
     * 成员变量已经初始化了,而且被final修饰了
     * 所以jvm在编译的时候认为有参构造是二次赋值操作,所以报错
     * @param name
     */
   /* public Person(String name) {
        this.name = name;
    }*/

    public String getName() {
        return name;
    }

    /**
     * 成员变量已经初始化了,而且被final修饰了
     * 所以jvm在编译的时候认为set方法是二次赋值操作,所以报错
     * @param name
     */
    /*public void setName(String name) {
        this.name = name;
    }*/
}

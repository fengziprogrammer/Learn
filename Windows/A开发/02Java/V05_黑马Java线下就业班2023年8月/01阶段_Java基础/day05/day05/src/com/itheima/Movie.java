package com.itheima;

/*
    JavaBean(标准类)
        1.成员变量: 必须私有
        2.构造方法: 提供两种
        3.成员方法: 必须提供get和set方法,其他方法看需求
        4.成员方法: show(); 用来展示对象属性
 */
public class Movie {
    //1.成员变量: 必须私有
    private String name; //名称
    private String type; //类型
    private String director; //导演

    //2.构造方法: 提供两种
    public Movie() {

    }
    public Movie(String name, String type, String director) {
        this.name = name;
        this.type = type;
        this.director = director;
    }

    //3.成员方法: 必须提供get和set方法,其他方法看需求
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    //4.成员方法: show(); 用来展示对象属性
    public void show() {
        System.out.println("电影名称:" + name);
        System.out.println("电影类型:" + type);
        System.out.println("电影导演:" + director);
    }
}

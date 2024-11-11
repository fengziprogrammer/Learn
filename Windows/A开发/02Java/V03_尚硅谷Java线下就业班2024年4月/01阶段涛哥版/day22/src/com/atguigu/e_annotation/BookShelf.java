package com.atguigu.e_annotation;

@Book(bookName = "金瓶梅", author = {"涛哥", "金莲"}, price = 9.9, count = 200)
@Book1("水浒传")
public class BookShelf {
    @Book(bookName = "金瓶梅", author = {"涛哥", "金莲"}, price = 9.9)
    public void method() {

    }
}

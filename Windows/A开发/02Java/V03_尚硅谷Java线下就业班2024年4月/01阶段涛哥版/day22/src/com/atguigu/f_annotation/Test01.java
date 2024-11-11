package com.atguigu.f_annotation;

import java.util.Arrays;

public class Test01 {
    public static void main(String[] args) {
        Class<BookShelf> bookShelfClass = BookShelf.class;
        boolean b = bookShelfClass.isAnnotationPresent(Book.class);
        //System.out.println(b);
        if (b){
            Book book = bookShelfClass.getAnnotation(Book.class);
            System.out.println(book.bookName());
            System.out.println(Arrays.toString(book.author()));
            System.out.println(book.price());
            System.out.println(book.count());
        }
    }
}

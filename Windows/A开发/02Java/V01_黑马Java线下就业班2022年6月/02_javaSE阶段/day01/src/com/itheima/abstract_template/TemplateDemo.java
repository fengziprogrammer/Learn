package com.itheima.abstract_template;

// 作文的模板
public abstract class TemplateDemo {
    // 写作文的方法
    public void write() {
        System.out.println("<<我的爸爸>>");

        // 作文的主体内容
        body();

        System.out.println("啊~这就是我的爸爸.");
    }

    public abstract void body();
}

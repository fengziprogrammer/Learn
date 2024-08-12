package com.itheima.exds.override;

public class NewPhone2 extends Phone{
    @Override //注解（作用：检查父类中是否有要重写的方法存在[检查语法]。）
    public void call() {
        super.call();
    }

    @Override
    public void sendMessage() {
        super.sendMessage();
    }
}

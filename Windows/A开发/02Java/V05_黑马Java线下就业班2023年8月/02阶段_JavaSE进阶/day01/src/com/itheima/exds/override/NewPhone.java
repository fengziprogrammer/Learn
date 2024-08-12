package com.itheima.exds.override;

//新手机：基本的打电话下支持视频通话，基本的发信息下支持发送语音和图片
public class NewPhone extends Phone {

    public NewPhone() {
        //隐藏的代码：super() //调用父类中的无参构造方法
    }

    //重写：父类中的方法
    public void call() {
        System.out.println("开启摄像头....");

        //原有功能
        super.call();
    }

    public void sendMessage() {
        System.out.println("添加语音");
        System.out.println("添加图片");

        //原有功能
        super.sendMessage();
    }
}

package com.atguigu.a_homework;

public class NoteBook {
    public void start(){
        System.out.println("开机了");
    }

    public void useUSB(USB usb){//USB usb = mouse  USB usb = keyBoard
        if (usb instanceof Mouse){
            usb.open();
            usb.close();
            Mouse mouse = (Mouse) usb;
            mouse.click();
        }

        if (usb instanceof KeyBoard){
            usb.open();
            usb.close();
            KeyBoard keyBoard = (KeyBoard) usb;
            keyBoard.qiaoJi();
        }
    }

    public void stop(){
        System.out.println("关机了");
    }
}

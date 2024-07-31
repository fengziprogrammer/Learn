package com.atguigu.l_duotai;

public class NoteBook {
    public void start(){
        System.out.println("开机了");
    }

    public void useUSB(USB usb){//USB usb = mouse  USB usb = keyBoard
        usb.open();
        usb.close();
    }

    public void stop(){
        System.out.println("关机了");
    }
}

package gui;

import javax.swing.*;

/*
    JFrame(初识窗体)
        构造方法:
            JFrame(); 创建一个最初不可见的窗体
        成员方法:
            void setSize(int 宽,int 高); 设置长宽,单位是px
            void setVisible(true); 显示或隐藏窗口

    import javax.swing.*;
        *代表导swing包下所有的类
 */
public class JFrameDemo01 {
    public static void main(String[] args) {
        //创建窗体
        JFrame jf = new JFrame();
        //设置宽高
        jf.setSize(400,300);
        //显示窗体,一般写在最后
        jf.setVisible(true);
    }
}

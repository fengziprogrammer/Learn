package gui;

import javax.swing.*;

/*
    JFrame(常用设置)
        void setTitle(String title); 设置窗体标题
        void setLocationRelativeTo(null); 设置窗体位置在中央弹出
        void setDefaultCloseOperation(3); 设置窗体关闭停止程序
        void setAlwaysOnTop(true); 设置窗体置顶
 */
public class JFrameDemo02 {
    public static void main(String[] args) {
        JFrame jf = new JFrame(); //创建窗
        jf.setSize(400,400); //设置大小
        jf.setTitle("JFrame基本设置"); //窗体标题
        jf.setLocationRelativeTo(null); //在中央弹出
        jf.setDefaultCloseOperation(3); //窗体关闭停止程序
        jf.setAlwaysOnTop(true); //置顶

        //添加基本组件
        //创建按钮对象
        JButton jButton = new JButton();
        jButton.setBounds(100,100,100,20);
        jf.add(jButton);

        jf.setVisible(true); //设置窗体可见
    }
}

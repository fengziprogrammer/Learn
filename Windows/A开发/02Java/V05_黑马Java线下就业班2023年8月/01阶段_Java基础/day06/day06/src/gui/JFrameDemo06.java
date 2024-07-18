package gui;

import javax.swing.*;

/*
   JTextArea(文本域)
        显示一个多行的输入框
    构造方法:
        JTextArea(); 创建文本框对象
    成员方法:
        void setBounds(in x,int y,int 宽,int高)
 */
public class JFrameDemo06 {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setSize(400, 300);
        jf.setTitle("聊天室");//设置窗体标题
        jf.setLocationRelativeTo(null);//设置窗体位置在中央弹出
        jf.setDefaultCloseOperation(3);//设置窗体关闭停止程序
        jf.setAlwaysOnTop(true);//设置窗体置顶
        jf.setLayout(null);//取消默认布局

        //文本域对象
        JTextArea textArea = new JTextArea();
        //设置坐标,大小
        textArea.setBounds(10,10,360,200);
        //添加到窗口
        jf.add(textArea);

        jf.setVisible(true);//设置显示窗体(一般写在最后)
    }
}

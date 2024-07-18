package gui_demo;

import javax.swing.*;

/*
    案例: GUI案例2(聊天室)
 */
public class JFrameDemo02 {
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
        textArea.setBounds(10,10,360,200);
        jf.add(textArea);
        //文本框
        JTextField text = new JTextField();
        text.setBounds(10,230,180,20);
        jf.add(text);
        //发送按钮
        JButton send = new JButton("发送");
        send.setBounds(200,230,70,20);
        jf.add(send);
        //清空聊天按钮
        JButton clear = new JButton("清空聊天");
        clear.setBounds(280,230,100,20);
        jf.add(clear);

        jf.setVisible(true);//设置窗体可见
    }
}

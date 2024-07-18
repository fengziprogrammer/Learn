package gui_demo;

import javax.swing.*;

/*
    案例: GUI案例3(猜数字)
 */
public class JFrameDemo03 {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setSize(400, 300);
        jf.setTitle("猜数字");//设置窗体标题
        jf.setLocationRelativeTo(null);//设置窗体位置在中央弹出
        jf.setDefaultCloseOperation(3);//设置窗体关闭停止程序
        jf.setAlwaysOnTop(true);//设置窗体置顶
        jf.setLayout(null);//取消默认布局

        //文本
        JLabel text = new JLabel("系统产生了一个1-100之间的数据,请猜一猜");
        text.setBounds(70,50,350,20);
        jf.add(text);
        //输入框
        JTextField textField = new JTextField();
        textField.setBounds(120,100,150,20);
        jf.add(textField);
        //按钮
        JButton btn = new JButton("我猜");
        btn.setBounds(150,150,100,20);
        jf.add(btn);

        //设置窗体可见
        jf.setVisible(true);
    }
}

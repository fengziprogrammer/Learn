package gui;

import javax.swing.*;

/*
    JTextField(文本框)
        显示一个输入框
    构造方法:
        JTextField(); 创建文本框对象
        JPasswordField 创建密码文本框对象
    成员方法:
        void setBounds(in x,int y,int 宽,int高)
 */
public class JFrameDemo05 {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setTitle("JTextField文本域");
        jf.setSize(400,400);
        jf.setDefaultCloseOperation(3);
        jf.setLocationRelativeTo(null);
        jf.setAlwaysOnTop(true);
        jf.setLayout(null);

        //JTextField(); 创建文本域对象
        JTextField input = new JTextField();
        input.setBounds(50, 50, 180, 20);
        jf.add(input);//添加到窗口

        //创建密码文本域对象
        JPasswordField password = new JPasswordField();
        password.setBounds(50, 150, 180, 20);
        jf.add(password);//添加到窗口

        //设置显示窗体(一般写在最后)
        jf.setVisible(true);

    }
}

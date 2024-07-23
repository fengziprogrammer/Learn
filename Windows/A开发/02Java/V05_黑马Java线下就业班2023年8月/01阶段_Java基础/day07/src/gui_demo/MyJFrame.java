package gui_demo;

import javax.swing.*;

/*
    继承案例:
        1.创建MyJFrame类,继承JFrame类,JFrame类中的方法我们就可以直接使用了
        2.提供空参构造,方法体中,完成了如下功能
            2.1 完成窗体的初始化 -> 抽取成方法initJFrame();
            2.2 完成基本组件绘制 -> 抽取成方法paintView();
        3.在测试类中,只需要通过空参,创建MyJFrame类对象 -> 完成窗体展示
 */
public class MyJFrame extends JFrame {
    //空参构造
    public MyJFrame(){
        //new对象的代码删除, jf对象就要换成this, 因为this可以代表本类对象
        //JFrame jf = new JFrame();
        //完成窗体的初始化 -> 抽取成方法
        initJFrame();
        //完成基本组件绘制 -> 抽取成方法
        paintView();
        //设置窗体可见
        this.setVisible(true);
    }
    //完成基本组件绘制
    public void paintView(){
        //用户名文本
        JLabel usernameJLabel = new JLabel("用户名");
        usernameJLabel.setBounds(50, 50, 50, 20);
        this.add(usernameJLabel);
        //密码文本
        JLabel passwordJLabel = new JLabel("密码");
        passwordJLabel.setBounds(50, 100, 50, 20);
        this.add(passwordJLabel);
        //用户名输入框
        JTextField usernameField = new JTextField();
        usernameField.setBounds(150, 50, 180, 20);
        this.add(usernameField);
        //密码输入框
        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(150, 100, 180, 20);
        this.add(passwordField);
        //登录按钮
        JButton btn = new JButton("登录");
        btn.setBounds(50,200,280,20);
        this.add(btn);
    }
    //完成窗体的初始化
    public void initJFrame(){
        //批量修改jf为this
        this.setSize(400, 300);
        this.setTitle("用户登录");//设置窗体标题
        this.setLocationRelativeTo(null);//设置窗体位置在中央弹出
        this.setDefaultCloseOperation(3);//设置窗体关闭停止程序
        this.setAlwaysOnTop(true);//设置窗体置顶
        this.setLayout(null);//取消默认布局
    }
}

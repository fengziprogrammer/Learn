package day07回顾代码;

import javax.swing.*;

/*
    1.MyJFrame继承JFrame,我们就不用创建JFrame对象,而且还可以调用JFrame的方法(通过this调)
 */
public class MyJFrame extends JFrame {
    /*
        2.提供空参构造,当外界空参构造对象时,触发我们的代码逻辑
     */
    public MyJFrame(){
        /*
            3.提供绘制窗体的代码
         */
        //初始化窗体
        initFrame(); //Alt+回车 -> 自动生成方法
        //绘制基本组件
        paintView();
        //显示窗体课可见
        this.setVisible(true);
    }
    //初始化窗体
    public void initFrame() {
        this.setSize(400, 300);
        this.setTitle("用户登录");//设置窗体标题
        this.setLocationRelativeTo(null);//设置窗体位置在中央弹出
        this.setDefaultCloseOperation(3);//设置窗体关闭停止程序
        this.setAlwaysOnTop(true);//设置窗体置顶
        this.setLayout(null);//取消默认布局
    }
    //绘制基本组件
    public void paintView() {
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
}

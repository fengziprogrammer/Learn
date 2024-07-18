package gui;

import javax.swing.*;

/*
    JButton(添加按钮)
        构造方法:
            JButton(String text); 创建一个带文本的按钮
        成员方法:
            void setSize(int 宽,int 高); 设置按钮大小
            void setLocation(int x,int y); 设置位置(坐标),按钮默认在窗口左上角,坐标为(x0,y0)
            //推荐使用setBounds替代上面两个方法
            void setBounds(int x,int y,int 宽,int 高);
        重要设置方法:
            JFrame取消默认布局: jf.setLayout(null);
            将按钮添加到窗体中: jf.add(JButton对象);

 */
public class JFrameDemo03 {
    public static void main(String[] args) {
        JFrame jf = new JFrame(); //创建窗体
        jf.setSize(400,400); //设置大小
        jf.setTitle("JButton按钮"); //窗体标题
        jf.setLocationRelativeTo(null); //在中央弹出
        jf.setDefaultCloseOperation(3); //窗体关闭停止程序
        jf.setAlwaysOnTop(true); //置顶
        jf.setLayout(null); //取消默认布局

        //创建按钮1
        JButton btn1 = new JButton("确定");
        //设置坐标,大小
        btn1.setBounds(80,300,100,20);
        //创建按钮2
        JButton btn2 = new JButton("取消");
        //设置大小,以及坐标
        btn2.setBounds(200,300,100,20);
        //将按钮添加到窗体中
        jf.add(btn1);
        jf.add(btn2);

        jf.setVisible(true); //设置窗体可见
    }
}

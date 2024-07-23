package gui_demo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

/*
    案例: GUI案例3(猜数字)
        1. 系统产生一个1-100之间的随机数
        2. 猜的内容不能为空
        3. 每次根据猜的数组给出相应的提示
 */
public class GuessNumber {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setSize(400, 300);
        jf.setTitle("猜数字");//设置窗体标题
        jf.setLocationRelativeTo(null);//设置窗体位置在中央弹出
        jf.setDefaultCloseOperation(3);//设置窗体关闭停止程序
        jf.setAlwaysOnTop(true);//设置窗体置顶
        jf.setLayout(null);//取消默认布局

        //文本对象
        JLabel jLabel = new JLabel("系统产生了一个1-100的随机数,请猜一猜");
        jLabel.setBounds(70, 50, 350, 20);
        jf.add(jLabel);
        //文本框对象
        JTextField jTextField = new JTextField();
        jTextField.setBounds(120, 100, 150, 20);
        jf.add(jTextField);
        //我猜按钮
        JButton btn = new JButton("我猜");
        btn.setBounds(150, 150, 100, 20);
        jf.add(btn);

        //产生随机数, 范围是1-100的整数
        int randomNumber = new Random().nextInt(100) + 1;
        //给按钮添加点击事件
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //获取输入框中的数据
                String guessNumber = jTextField.getText().trim();
                //非空判断
                if (guessNumber.equals("")) {
                    //弹窗给出错误提示
                    JOptionPane.showMessageDialog(jf, "猜的数字不能为空!");
                    return; //结束方法
                }
                //将获取到的String转为int
                int number = Integer.parseInt(guessNumber);
                //判断数据关系
                if(number < 1 || number > 100){
                    JOptionPane.showMessageDialog(jf, "请输入1-100的整数!");
                    jTextField.setText("");//清空文本框
                } else if(number > randomNumber){
                    JOptionPane.showMessageDialog(jf, "猜大了!");
                    jTextField.setText("");
                }else if(number <randomNumber ){
                    JOptionPane.showMessageDialog(jf, "猜小了!");
                    jTextField.setText("");
                }else {
                    JOptionPane.showMessageDialog(jf, "恭喜你,猜对了!");
                }
            }
        });

        jf.setVisible(true);//设置显示窗体(一般写在最后)
    }
}

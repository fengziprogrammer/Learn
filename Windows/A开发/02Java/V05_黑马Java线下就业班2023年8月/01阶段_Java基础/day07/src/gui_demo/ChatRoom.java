package gui_demo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
    案例: GUI案例2(聊天室)
        1. 将文本框的内容发送到文本域中
        2. 每次发送的文本,不带前后空格
        3. 多次发送的内容在文本域,追加呈现
        4. 清空聊天就是将文本域内容设置为空
 */
public class ChatRoom {
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
        textArea.setBounds(10, 10, 360, 200);
        jf.add(textArea);

        //文本框
        JTextField text = new JTextField();
        text.setBounds(10, 230, 180, 20);
        jf.add(text);

        //发送按钮
        JButton send = new JButton("发送");
        send.setBounds(200, 230, 70, 20);
        jf.add(send);

        //清空聊天按钮
        JButton clear = new JButton("清空聊天");
        clear.setBounds(280, 230, 100, 20);
        jf.add(clear);

        //发送按钮绑定点击事件
        send.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //获取文本框的内容, 去除首尾空格
                String message = text.getText().trim();
//                //1.如果字符串长度为0, 代表为空
//                if (message.length() == 0) {
//                    JOptionPane.showMessageDialog(jf, "你输入的内容不能为空!");
//                    return;
//                }
//                //2.调用字符串类的isEmpty来判断, 如果返回值为true, 代表为空
//                if (message.isEmpty()) {
//                    JOptionPane.showMessageDialog(jf, "你输入的内容不能为空!");
//                    return;
//                }
                //3.如果字符串内容和""一样, 代表为空
                if (message.equals("")) {
                    JOptionPane.showMessageDialog(jf, "你输入的内容不能为空!");
                    return;
                }
                //拼接到本文域, 加一个换行
                textArea.append(message + "\n"); //照抄
                //清空文本框
                text.setText("");
            }
        });
        //清空聊天按钮绑定点击事件
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //清空文本域
                textArea.setText("");
            }
        });
        //显示窗体可见
        jf.setVisible(true);
    }
}

package cn;

import javax.swing.*;
/*
    动漫美女拼图: 一维数组改进
 */
public class Game2 {
    public static void main(String[] args) {
        //窗体对象
        JFrame jf = new JFrame();
        //相关设置
        jf.setTitle("动漫美女拼图: 一维数组改进");
        jf.setSize(380, 400);
        jf.setDefaultCloseOperation(3);
        jf.setLocationRelativeTo(null);
        jf.setAlwaysOnTop(true);
        jf.setLayout(null);
        //第一行
        for (int i = 0; i < 4; i++) {
            JLabel jLabel = new JLabel(new ImageIcon("day08\\images\\" + (i + 1) + ".png"));
            jLabel.setBounds(i * 90, 0, 90, 90);
            jf.add(jLabel);
        }
        //第二行
        for (int i = 0; i < 4; i++) {
            JLabel jLabel = new JLabel(new ImageIcon("day08\\images\\" + (i + 5) + ".png"));
            jLabel.setBounds(i * 90, 90, 90, 90);
            jf.add(jLabel);
        }
        //第三行
        for (int i = 0; i < 4; i++) {
            JLabel jLabel = new JLabel(new ImageIcon("day08\\images\\" + (i + 9) + ".png"));
            jLabel.setBounds(i * 90, 180, 90, 90);
            jf.add(jLabel);
        }
        //第四行
        for (int i = 0; i < 4; i++) {
            JLabel jLabel = new JLabel(new ImageIcon("day08\\images\\" + (i + 13) + ".png"));
            jLabel.setBounds(i * 90, 270, 90, 90);
            jf.add(jLabel);
        }
        //窗体显示
        jf.setVisible(true);
    }
}

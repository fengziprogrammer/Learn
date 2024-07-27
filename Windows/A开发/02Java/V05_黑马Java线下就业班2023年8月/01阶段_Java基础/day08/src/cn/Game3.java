package cn;

import javax.swing.*;
/*
    动漫美女拼图: 二维数组改进
 */
public class Game3 {
    public static void main(String[] args) {
        //窗体对象
        JFrame jf = new JFrame();
        //相关设置
        jf.setTitle("动漫美女拼图: 二维数组改进");
        jf.setSize(380, 400);
        jf.setDefaultCloseOperation(3);
        jf.setLocationRelativeTo(null);
        jf.setAlwaysOnTop(true);
        jf.setLayout(null);
        //二维数组改进
        //定义保存图片编号的数组
        int[][] datas = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        //遍历二维数组
        for (int i = 0; i < datas.length; i++) {
            for (int j = 0; j < datas[i].length; j++) {
                JLabel jLabel = new JLabel(new ImageIcon("day08\\images\\" + datas[i][j] + ".png"));
                jLabel.setBounds(j * 90, i * 90, 90, 90);
                jf.add(jLabel);
            }
        }
        //窗体显示
        jf.setVisible(true);
    }
}

package gui;

import javax.swing.*;

/*
    JLabel(显示文本和图像)
        短文本字符串或者图像的显示区域

    构造方法:
        JLabel(String text); 使用指定文本创建对象
        JLabel(ImageIcon image); 使用指定图像创建对象
            ImageIcon(String 路径); 指定文件创建ImageIcon
                绝对路径:从盘符开始的完整路径
                相对路径:取用其他路径名相对的路径(一般相对项目或者模块)
    成员方法:
        void setBounds(in x,int y,int 宽,int高)
 */
public class JFrameDemo04 {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setTitle("JLabel显示文本和图像");
        jf.setSize(400, 400);
        jf.setDefaultCloseOperation(3);
        jf.setLocationRelativeTo(null);
        jf.setAlwaysOnTop(true);
        jf.setLayout(null);

        //创建JLabel对象 -> 显示文本
        JLabel text = new JLabel("这里的文本我们自己指定");
        text.setBounds(20, 20, 200, 20);
        jf.add(text);

        //创建JLabel对象 -> 显示图片
        ImageIcon ii = new ImageIcon("day06\\imgs\\img1.png");
        JLabel img = new JLabel(ii);
        img.setBounds(50, 50, 100, 143);
        jf.add(img);

        jf.setVisible(true); //设置窗体可见
    }
}

package gui_demo;

import javax.swing.*;

/*
    案例: GUI案例4(手机日期和时间显示)
 */
public class JFrameDemo04 {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setSize(400, 300);
        jf.setTitle("手机日期和时间显示");//设置窗体标题
        jf.setLocationRelativeTo(null);//设置窗体位置在中央弹出
        jf.setDefaultCloseOperation(3);//设置窗体关闭停止程序
        jf.setAlwaysOnTop(true);//设置窗体置顶
        jf.setLayout(null);//取消默认布局

        //日期文本
        JLabel dateText = new JLabel("日期");
        dateText.setBounds(50,50,100,20);
        jf.add(dateText);
        //具体日期
        JLabel date = new JLabel("xxxx年xx月xx日");
        date.setBounds(50,80,200,20);
        jf.add(date);

        //时间文本
        JLabel timeText = new JLabel("时间");
        timeText.setBounds(50,150,100,20);
        jf.add(timeText);
        //具体时间
        JLabel time = new JLabel("xx:xx:xx");
        time.setBounds(50,180,200,20);
        jf.add(time);

        jf.setVisible(true);
    }
}

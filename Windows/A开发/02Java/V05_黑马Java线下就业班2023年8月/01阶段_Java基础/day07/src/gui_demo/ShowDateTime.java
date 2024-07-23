package gui_demo;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
    案例: GUI案例4(手机日期和时间显示)
        将xxxx年xx月xx日和xx:xx改为动态获取
 */
public class ShowDateTime {
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
        //获取日期的字符串
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日");
        //格式化当前系统时间 -> 只取了日期
        String dateStr = dateFormat.format(new Date());
        //具体日期
        JLabel date = new JLabel(dateStr); //替换为动态获取的dataStr
        date.setBounds(50,80,200,20);
        jf.add(date);
        //时间文本
        JLabel timeText = new JLabel("时间");
        timeText.setBounds(50,150,100,20);
        jf.add(timeText);
        //获取日期的字符串
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
        //格式化当前系统时间 -> 只取时间
        String timeStr = timeFormat.format(new Date());
        //具体时间
        JLabel time = new JLabel(timeStr); //替换为动态获取的timeStr
        time.setBounds(50,180,200,20);
        jf.add(time);

        //设置窗体可见
        jf.setVisible(true);
    }
}

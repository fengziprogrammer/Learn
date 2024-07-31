package game11;
/*
     重置业务
 */

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.util.Random;

//继承自JFrame,就可以通过this调用成员变量和方法了(子类如果没有找父类)
public class PictureFrame extends JFrame {
    //图片编号数组(原始数组)
    private int[][] datas = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 0}
    };
    //游戏成功的数组(前15张图片到位,证明成功)
    private int[][] winDatas = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 0}
    };

    //用于记录0号图片,在每一次打乱后的索引
    //x0 :在哪个一维数组
    //y0 :在一维数组的位置
    private int x0;
    private int y0;
    //上左下右,求助,重置等按钮(因为在这个类中很多方法操作他们,所以提升到成员位置)
    private JButton shangButton;
    private JButton zuoButton;
    private JButton xiaButton;
    private JButton youButton;
    private JButton qiuZhuButton;
    private JButton chongZhiButton;
    //JPanel面板
    private JPanel imagePanel;


    //在空参构造中完成以下功能
    public PictureFrame() {
        //窗体基本设置
        initFrame();
        //打乱二维数组元素(打乱图片)
        randomDate();
        //绘制窗口组件
        paintView();
        //给按钮添加点击事件
        addButtonEvent();
        //setVisible(true); 窗体可见
        setVisible(true);
    }

    //重绘界面,当我们界面有了改变以后,我们需要调用重绘的方法
    public void rePaintView() {
        //调用JPanel的removeAll方法移除所有组件
        imagePanel.removeAll();
        //重新遍历二维数组,展示图片
        for (int i = 0; i < datas.length; i++) {
            for (int j = 0; j < datas[i].length; j++) {
                JLabel imageLabel = new JLabel(new ImageIcon("day09\\images\\" + datas[i][j] + ".png"));
                imageLabel.setBounds(j * 90, i * 90, 90, 90);
                imagePanel.add(imageLabel);
            }
        }
        this.add(imagePanel);
        //调用JPanel的repaint方法重绘窗体
        imagePanel.repaint();
    }

    //让游戏直接成功的方法
    public void success() {
        //将datas二维数组元素重置为1到16的图片(前15张都到位了,补齐第16张)
        datas = new int[][]{
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        //设置上左下右按钮失效
        shangButton.setEnabled(false);
        youButton.setEnabled(false);
        xiaButton.setEnabled(false);
        zuoButton.setEnabled(false);
    }

    //判断游戏是否成功的,如果成功返回true
    public boolean isSuccess() {
        //遍历任意一个数组
        for (int i = 0; i < datas.length; i++) {
            for (int j = 0; j < datas[i].length; j++) {
                //对比相同索引处的元素, 如果有一个不一样, 代表游戏还没有成功, 返回false
                if (datas[i][j] != winDatas[i][j]) {
                    return false;
                }
            }
        }
        //循环如果结束, 还没有返回false, 证明游戏成功了, 返回true
        return true;
    }

    //给按钮添加事件
    public void addButtonEvent() {
        //上左下右按钮
        shangButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //边界处理,当x0=3,不能继续向上移动
                if (x0 == 3) {
                    return;
                }
                //交换0号图片和下方图片
                datas[x0][y0] = datas[x0 + 1][y0];
                datas[x0 + 1][y0] = 0;
                x0 = x0 + 1;
                //判断游戏是否成功的,如果成功返回true
                if (isSuccess()) {
                    success();
                }
                //调用重绘的方法rePainView()
                rePaintView();
            }
        });
        zuoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //边界处理,当y0=3,不能继续向上移动
                if (y0 == 3) {
                    return;
                }
                //交换0号图片和右方图片
                datas[x0][y0] = datas[x0][y0 + 1];
                datas[x0][y0 + 1] = 0;
                y0 = y0 + 1;
                //判断游戏是否成功的,如果成功返回true
                if (isSuccess()) {
                    success();
                }
                //调用重绘的方法rePainView()
                rePaintView();
            }
        });
        xiaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //边界处理,边界x0==0
                if (x0 == 0) {
                    return;
                }
                //交换0号图片和上方图片
                datas[x0][y0] = datas[x0 - 1][y0];
                datas[x0 - 1][y0] = 0;
                x0 = x0 - 1;
                //判断游戏是否成功的,如果成功返回true
                if (isSuccess()) {
                    success();
                }
                //调用重绘的方法rePainView()
                rePaintView();
            }
        });
        youButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //边界处理,边界y0==0
                if (y0 == 0) {
                    return;
                }
                //交换0号图片和左方图片
                datas[x0][y0] = datas[x0][y0 - 1];
                datas[x0][y0 - 1] = 0;
                y0 = y0 - 1;
                //判断游戏是否成功的,如果成功返回true
                if (isSuccess()) {
                    success();
                }
                //调用重绘的方法rePainView()
                rePaintView();
            }
        });
        //求助按钮
        qiuZhuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //如果用户点击求助,目的完成游戏,所以调用success让游戏成功
                success();
                //重绘
                rePaintView();
            }
        });
        //重置
        chongZhiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //重置原始的数组
                datas = new int[][]{
                        {1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9, 10, 11, 12},
                        {13, 14, 15, 0} //如果用户点击重置,目的是重新开始游戏,加入0号图片
                };
                //打乱数组
                randomDate();
                //重绘
                rePaintView();
                //设置上左下右按钮生效
                shangButton.setEnabled(true);
                zuoButton.setEnabled(true);
                xiaButton.setEnabled(true);
                youButton.setEnabled(true);
            }
        });
    }

    //绘制窗口组件
    public void paintView() {
        //标题图片JLabel
        JLabel titleLabel = new JLabel(new ImageIcon("day09\\images\\title.png"));
        titleLabel.setBounds(254, 27, 232, 57);
        this.add(titleLabel);

        //容器面板JPanel
        imagePanel = new JPanel();
        imagePanel.setBounds(150, 114, 360, 360);
        //取消JPanel的默认布局
        imagePanel.setLayout(null);
        //遍历二维数组,得到图片编号
        for (int i = datas.length - 1; i >= 0; i--) {
            for (int j = 0; j < datas[i].length; j++) {
                //通过JLabel,配合图片编号,加载图片
                JLabel imageLabel = new JLabel(new ImageIcon("day09\\images\\" + datas[i][j] + ".png"));
                //根据规律,调整图片位置
                imageLabel.setBounds(j * 90, i * 90, 90, 90);
                //将JLabel图片添加到JPanel面板
                imagePanel.add(imageLabel);
            }
        }
        //将JPanel面板添加到窗体
        this.add(imagePanel);

        //参照图
        JLabel canZhaoTuLabel = new JLabel(new ImageIcon("day09\\images\\canZhaoTu.png"));
        canZhaoTuLabel.setBounds(574, 114, 122, 121);
        this.add(canZhaoTuLabel);
        //上按钮
        shangButton = new JButton(new ImageIcon("day09\\images\\shang.png"));
        shangButton.setBounds(732, 265, 57, 57);
        this.add(shangButton);
        //左按钮
        zuoButton = new JButton(new ImageIcon("day09\\images\\zuo.png"));
        zuoButton.setBounds(650, 347, 57, 57);
        this.add(zuoButton);
        //下按钮
        xiaButton = new JButton(new ImageIcon("day09\\images\\xia.png"));
        xiaButton.setBounds(732, 347, 57, 57);
        this.add(xiaButton);
        //右按钮
        youButton = new JButton(new ImageIcon("day09\\images\\you.png"));
        youButton.setBounds(813, 347, 57, 57);
        this.add(youButton);
        //求助按钮
        qiuZhuButton = new JButton(new ImageIcon("day09\\images\\qiuzhu.png"));
        qiuZhuButton.setBounds(626, 444, 108, 45);
        this.add(qiuZhuButton);
        //重置按钮
        chongZhiButton = new JButton(new ImageIcon("day09\\images\\chongzhi.png"));
        chongZhiButton.setBounds(786, 444, 108, 45);
        this.add(chongZhiButton);
        //背景图
        JLabel backgroundLabel = new JLabel(new ImageIcon("day09\\images\\background.png"));
        backgroundLabel.setBounds(0, 0, 968, 530);
        this.add(backgroundLabel);
    }

    //窗体基本设置
    public void initFrame() {
        //设置大小
        this.setSize(960, 565);
        //设置标题
        this.setTitle("动漫拼图");
        //窗体居中
        this.setLocationRelativeTo(null);
        //窗体关闭时停止程序(控制台)
        this.setDefaultCloseOperation(3);
        //窗体置顶
        this.setAlwaysOnTop(true);
        //取消窗体默认布局
        this.setLayout(null);
        try {
            //播放音乐, 有异常, 使用快捷键第二个解决方案
            new Music();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (JavaLayerException e) {
            e.printStackTrace();
        }
    }

    //打乱二维数组元素(打乱图片)
    public void randomDate() {
        Random r = new Random();
        for (int i = 0; i < datas.length; i++) {
            for (int j = 0; j < datas[i].length; j++) {
                //生成两个索引,x代表随机的一维数组,y代表这个一维数组中的随机元素
                int x = r.nextInt(datas.length);
                int y = r.nextInt(datas[i].length);
                //交换元素
                int temp = datas[i][j];
                datas[i][j] = datas[x][y];
                datas[x][y] = temp;
            }
        }
        //每次图片打乱后,记录0号图片的位置
        lo:
        for (int i = 0; i < datas.length; i++) {
            for (int j = 0; j < datas[i].length; j++) {
                //如果当前元素为0,代表就是0号图片
                if (datas[i][j] == 0) {
                    //使用成员变量,x0和y0记录索引
                    x0 = i;
                    y0 = j;
                    //循环标号,结束外层循环
                    break lo;
                }
            }
        }
    }
}

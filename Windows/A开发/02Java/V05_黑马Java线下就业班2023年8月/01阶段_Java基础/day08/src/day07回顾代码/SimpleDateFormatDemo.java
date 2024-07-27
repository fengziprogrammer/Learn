package day07回顾代码;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
    SimpleDateFormat
        创建对象
        常用方法
        手机日期时间显示最终版
        考勤查询最终版
 */
public class SimpleDateFormatDemo {
    public static void main(String[] args) throws ParseException {
        //格式化 -> format(日期);
        //SimpleDateFormat sdf = new SimpleDateFormat();
        //SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(new Date()));
        /*
            空参,默认格式: 2022/10/13 上午9:08
            带参,指定格式: 2022年10月13日 09:10:03
            带参,指定格式: 2022-10-13 09:10:46
         */

        //解析 -> parse(日期字符串);
        //根据目标字符串,创建SimpleDateFormat对象,指定匹配的格式(如果格式不匹配报错)
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        System.out.println(sdf1.parse("2022年10月13日 09:10:03")); //Alt+回车,选择第一个解决方案,敲回车,main方法后面多出来了"throws ParseException"
    }
}

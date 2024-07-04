/*
1、用一个year变量保存今年的年份值，并显示今年的总天数
闰年的判断标准：
（1）要么能被4整除，同时不能被100整除
（2）要么能被400整除
 */
public class ExpandExer1 {
    public static void main(String[] args) {
        int year = 2022;
        if(year%4==0 && year%100!=0 || year%400==0){
            System.out.println(year + "有366天");
        }else{
            System.out.println(year + "有365天");
        }
    }
}

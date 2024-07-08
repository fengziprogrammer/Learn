package day04;
//while结构的演示
public class WhileDemo {
	public static void main(String[] args) {
		//2)输出9的乘法表:
		int num = 1;       
		while(num<=9) {
			System.out.println(num+"*9="+num*9);
			num++;
		}
		
		//1)输出10次"行动是成功的阶梯":
		int times = 0;    //1)循环变量的初始化
		while(times<10) { //2)循环的条件
			System.out.println("行动是成功的阶梯");
			times++;      //3)循环变量的改变
		}
		System.out.println("over");
		/*
		 * 执行过程:
		 *             times=0
		 * true  输出    times=1
		 * true  输出    times=2
		 * true  输出    times=3
		 * ...         times=4/5/6/7/8
		 * true  输出     times=9
		 * true  输出     times=10
		 * false while循环结束
		 * 输出over
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * 1.while结构:
		 *   1)语法:
		 *       while(boolean){
		 *         语句块-------------反复执行的代码
		 *       }
		 *   2)执行过程:
		 *       判断boolean的值，若为true则执行语句块，
		 *       再判断boolean的值，若为true则再执行语句块，
		 *       再判断boolean的值，若为true则再执行语句块，
		 *       以此类推，直到boolean的值为false时，while循环结束
		 */
	}
}



















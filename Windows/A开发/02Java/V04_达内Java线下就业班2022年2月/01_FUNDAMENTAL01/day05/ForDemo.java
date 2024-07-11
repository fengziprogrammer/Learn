package day05;
//for循环的演示
public class ForDemo {
	public static void main(String[] args) {
		//输出9的乘法表，只要取余3不得0的
		for(int num=1;num<=9;num++) {
			if(num%3!=0) {
				System.out.println(num+"*9="+num*9);
			}
		}
		
		//输出9的乘法表，跳过取余3得0的
		for(int num=1;num<=9;num++) {
			if(num%3==0) {
				continue; //跳过循环体中剩余语句而进入下一次循环(去num++)
			}
			System.out.println(num+"*9="+num*9);
		}
		/*
		 * num=1  1*9=9
		 * num=2  2*9=18
		 * num=3  
		 * num=4  4*9=36
		 * num=5  5*9=45
		 * num=6  
		 * num=7  7*9=63
		 * num=8  8*9=72
		 * num=9 
		 * num=10  
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		for(int num=1;num<=9;num++) {
			if(num==5) {
				break; //在某种特定的条件下，提前结束循环
			}
			System.out.println(num+"*9="+num*9);
		}
		*/
		/*
		 * num=1  1*9=9
		 * num=2  2*9=18
		 * num=3  3*9=27
		 * num=4  4*9=36
		 * num=5  
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		int num=1;
		for(;num<=9;num++) {
			System.out.println(num+"*9="+num*9);
		}
		*/
		/*
		for(int num=1;num<=9;) {
			System.out.println(num+"*9="+num*9);
			num++;
		}
		*/
		/*
		for(;;) { //死循环
			System.out.println("我要学习...");
		}
		*/
		/*
		for(int i=1,j=5;i<=5;i+=2,j-=2) {
		}
		*/
		/*
		 * i=1,j=5
		 * i=3,j=3
		 * i=5,j=1
		 * i=7,j=-1
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		//1)输出10次"行动是成功的阶梯":
		for(int times=0;times<10;times++) {
			System.out.println("行动是成功的阶梯");
		}
		*/
		/*
		//2)输出9的乘法表:
		for(int num=1;num<=9;num++) {
			System.out.println(num+"*9="+num*9);
		}
		*/
		/* 执行过程:
		 * num=1  true  1*9=9
		 * num=2  true  2*9=18
		 * num=3  true  3*9=27
		 * num=4  true  4*9=36
		 * num=5/6/7/8...
		 * num=9  true  9*9=81
		 * num=10 false for循环结束
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * 3.for结构:
		 *   1)语法:
		 *             1      2        3
		 *       for(要素1 ; 要素2 ; 要素3){
		 *         语句块/循环体--------------反复执行的代码  4
		 *       }
		 *   2)执行过程:
		 *       1243243243243243...2
		 */
	}
}



















package day03;
//if结构的演示
public class IfDemo {
	public static void main(String[] args) {
		//1)偶数的判断:
		//6, 5    
		int num = 6;
		if(num%2==0) {
			System.out.println(num+"是偶数");
		}
		System.out.println("over");
	
		//2)满500打8折，不满500不打折
		//600.0, 300.0
		double price = 300.0; //消费金额
		if(price>=500) {  //满500
			price *= 0.8; //打8折
		}
		System.out.println("最终结算金额为:"+price);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * 1.if结构: 1条路
		 *   1)语法:
		 *       if(boolean){
		 *         语句块----------基于条件执行的
		 *       }
		 *   2)执行过程:
		 *       判断boolean的值:
		 *         若为true，则执行语句块(整个结束)
		 *         若为false，则整个结束
		 */
		
	}
}
















class Demo15_If {

	/*
	成绩
		90-100  优  [90,100]
		80-90  良   [80,90)
		60-80  中   [60,80)
		<60   不及格

		 else if 以上条件不满足进行的再次筛选
		 else    以上条件都不满足

		 // 编程习惯 
		 1.梳理思路写注释  
		 2.边写边测试
		 3.完成功能  顺序1> 正确数据 2> 边缘数据 3>错误数据
	*/
	public static void main(String[] args) {

		int num = 99;

		// 非法的数据的排除
		/*if((num <= 0) || num > 100 ){
			System.out.println("非法数据");
		}else if( (num >= 90)&& (num <=100)){
			System.out.println("优");
		}else if((num >= 80) && (num < 90)){
			System.out.println("良");
		}else if((num >= 60) && (num < 80)){
			System.out.println("中");
		}else{// 以上条件都不满足
			System.out.println("不及格");
		}*/

		// 优化后的代码
		if((num <= 0) || num > 100 ){
			System.out.println("非法数据");
		}else if( num >= 90){
			System.out.println("优");
		}else if(num >= 80){
			System.out.println("良");
		}else if(num >= 60){
			System.out.println("中");
		}else{// 以上条件都不满足
			System.out.println("不及格");
		}

		
	}
}

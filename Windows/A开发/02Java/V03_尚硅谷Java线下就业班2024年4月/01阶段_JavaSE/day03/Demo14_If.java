class Demo14_If {

	/*
		if
		第一种格式
			if(关系表达式){
				// if语句代码块
			}

			执行顺序
				1> 关系表达式 --> 结果
				2> 结果是true --> if语句代码块
		第二种格式
			if(关系表达式){
				// true --> if语句代码块
			}else{// 以上条件不满足 false
				// false执行的语句块
			}
		第三种格式
			if(关系表达式1){
				// true --> if语句代码块
			}else if(关系表达式2){//如果关系表达式1不满足,
				//基础上进行再次条件筛选判断
					//
			}else if(关系表达式3){// 1 2 都不满足 筛选3
					//
			}
			...
			else{// 以上条件不满足 false
				// false执行的语句块
			}
		
		成绩
		90-100  优
		80-90  良
		60-80  中

		<60   不及格

	*/
	public static void main(String[] args) {

		int a = 10;
		if(a > 0){
			System.out.println("该数大于0");// 
		}

		if(a > 0){
			System.out.println("该数大于0");// 
		}else{
			System.out.println("该数小于等于0");	
		}

		
	}
}

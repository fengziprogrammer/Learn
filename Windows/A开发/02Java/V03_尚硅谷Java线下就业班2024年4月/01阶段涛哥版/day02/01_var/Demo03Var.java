public class Demo03Var{
	public static void main(String[] args){
		/*
		  \  转义字符
		     将普通的字符转义成具有特殊含义的字符
			 将特殊含义的字符转义成普通字符
		*/
		
		
		/*
		  n:本身代表普通的字符
		  
		  \n: 为换行符
		*/
		
		System.out.println("哈哈哈哈\n呵呵呵呵");
		
		/*
		  t:本身代表普通的字符
		  \t:代表制表符 tab
		*/
		
		System.out.println("哈哈哈哈\t呵呵呵呵");
		
		/*
		  用char类型变量表示一个'
		  
		  '本身具有特殊含义
		  
		  \' 将具有特殊含义的'变成普通字符
		*/
		
		char num1 = '\'';
		System.out.println(num1);
		
		/*
		  用字符串表示一个路径
		  
		  \本身具有特殊含义,代表转义字符,我们需要将\变成普通的字符
		  所以\前面再加一个\
		  
		  \\代表\
		*/
		String path = "E:\\Idea\\io";
		System.out.println(path);
	}
}
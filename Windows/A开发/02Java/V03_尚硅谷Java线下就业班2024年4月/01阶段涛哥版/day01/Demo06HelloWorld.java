public class Demo06HelloWorld{
	public static void main(String[] args){
		//整数常量
		System.out.println(1);
		System.out.println(-1);
		
		//小数常量
		System.out.println(2.5);
		System.out.println(2.0);
		
		//字符常量
		System.out.println('1');
		//System.out.println('11');''中必须有且只能有一个内容 11算两个内容
		//System.out.println('');''中必须有且只能有一个内容
		System.out.println(' ');//一个空格算一个内容
		//System.out.println('  ');//一个空格算一个内容,两个空格就是两个内容
		System.out.println('	');//tab键算一个内容
		
		//字符串常量
		System.out.println("张无忌和赵敏以及周芷若还有小昭以及朱九真...没羞没臊的故事");
		System.out.println("");
		//布尔常量
		System.out.println(true);
		System.out.println(false);
		
		//空常量
		//System.out.println(null); null代表数据不存在,不能直接引用
	}
}
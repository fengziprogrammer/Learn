public class Demo04Var{
	public static void main(String[] args){
		int i = 10;
		System.out.println(i);
		
		//int j;// j没有被初始化,不能直接使用
		//System.out.println(j);
		
		//int i = 20;  如果变量名前面带具体的数据类型,叫做重新定义
		
		i = 20;//变量名前面没有指明具体数据类型,不叫做重新定义,叫做再次赋值
		System.out.println(i);
		
		{
			int k = 100;
			System.out.println(k);
			System.out.println(i);//在小作用域中能直接访问大作用域中的数据
		}
		
		//System.out.println(k);在大作用域中不能直接访问小作用域中的数据
	}
}
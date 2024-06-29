/*
  public class Demo03HelloWorld
   public:权限修饰符,代表公共的(面向对象时说)		
   class:代表的是类
   Demo03HelloWorld:类名,要求和java文件名保持一致
   
   
  在定义一个类:类是java程序最基本的组成单元
               所有的代码都要在class类中写
*/
public class Demo03HelloWorld{
  
    /*
	  public static void main(String[] args)
	    public :权限修饰符,代表公共的(面向对象时说)
        static:静态关键字(面向对象时说)	
        void:代表方法无返回值(讲方法的时候说)
        main:方法名
   		(String[] args):main方法的参数,参数类型为String数组,参数名为args(后面说)
		
		main方法是java程序的入口,jvm执行java程序从main方法开始执行  mian
	 
	*/
	public static void main(String[] args){
		//输出语句(打印语句),可以将我们的结果输出到控制台上
		System.out.println("HelloWorld");
	}
}	
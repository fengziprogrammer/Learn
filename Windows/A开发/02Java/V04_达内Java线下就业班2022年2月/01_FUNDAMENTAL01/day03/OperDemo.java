package day03;
//运算符的演示
public class OperDemo {
	public static void main(String[] args) {
		/*
		 * 6.条件/三目运算符:
		 *   1)语法:
		 *       boolean?数1:数2
		 *   2)执行规则:
		 *     ----整个表达式是有值的，它的值要么是数1，要么是数2
		 *     ----计算boolean的值:
		 *     ------若为true，则整个表达式的值为?后的数1
		 *     ------若为false，则整个表达式的值为:后的数2
		 */
		
		int a=8,b=5;
		int max = a>b?a:b ;
		System.out.println(max); //8
		
		int num = 5;
		int flag = num>0?1:-1;
		System.out.println(flag); //-1
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * 5.字符串连接运算符:
		 *   1)+:
		 *     1.1)若两边都是数字，则做加法运算
		 *     1.2)若两边出现了字符串，则做字符串连接
		 */

		int age = 37;
		System.out.println("age="); //age=
		System.out.println(age);    //37
		System.out.println("age="+age); //age=37
		System.out.println("我的年龄是"+age); //我的年龄是37
		System.out.println("我今年"+age+"岁了"); //我今年37岁了
		String name = "WKJ";
		System.out.println("name="+name); //name=WKJ
		System.out.println("大家好，我叫"+name); //大家好，我叫WKJ
		System.out.println("大家好，我叫"+name+"，今年"+age+"岁了"); //大家好，我叫WKJ，今年37岁了
		
		System.out.println(10+20+""+30); //3030-----String
		System.out.println(""+10+20+30); //102030---String
		System.out.println(10+20+30+""); //60-------String

		
		
		
		
		
		
		/*
		 * 4.赋值运算符:
		 *   1)简单赋值运算符:=
		 *   2)扩展赋值运算符:+=,-=,*=,/=,%=
		 *     ----自带强转功能
		 */
		/*
		int a = 5;
		a += 10; //相当于a=(int)(a+10)
		System.out.println(a); //15
		a *= 2; //相当于a=a*2
		System.out.println(a); //30
		a /= 6; //相当于a=a/6
		System.out.println(a); //5
		
		//常见面试题:
		short s = 5;
		s += 10; //相当于s=(short)(s+10);
		//s = s+10; //编译错误，需强转 s=(short)(s+10);
		*/
		
		
		
		
		
		
		
		
		
		/*
		 * 3.逻辑运算符:
		 *   1)&&:短路与(并且)，两边都为真则为真，见false则false
		 *        ---当第1个数为false时，则发生短路(后面的不执行了)
		 *     ||:短路或(或者)，有真则为真，见true则true
		 *        ---当第1个数为true时，则发生短路(后面的不执行了)
		 *      !:逻辑非(取反)，非真则假，非假则真
		 *   2)逻辑运算是建立在关系运算的基础之上的
		 *     逻辑运算的结果也是boolean型
		 */
		
		/*
		int a=5,b=10,c=5;
		boolean b1 = b>=a && b<c;
		System.out.println(b1);          //true&&false=false
		System.out.println(b<=c && b>a); //false&&true=false
		System.out.println(a==b && c>b); //false&&false=false
		System.out.println(b!=c && a<b); //true&&true=true
		
		System.out.println(b>=a || b<c); //true||false=true
		System.out.println(b<=c || b>a); //false||true=true
		System.out.println(b!=c || a<b); //true||true=true
		System.out.println(a==b || c>b); //false||false=false
		
		boolean b2 = !(a>b);
		System.out.println(b2);     //!false=true
		System.out.println(!(a<b)); //!true=false
		
		boolean b3 = a>b && c++>2;
		System.out.println(b3); //false
		System.out.println(c);  //5，发生短路了
		
		boolean b4 = a<b || c++>2;
		System.out.println(b4); //true
		System.out.println(c);  //5，发生短路了
		
		*/
		
		
		
		
		
		
		
		
		
		
		/*
		 * 2.关系运算符:
		 *   1)>(大于),<(小于)
		 *     >=(大于或等于),<=(小于或等于)
		 *     ==(等于),!=(不等于)
		 *   2)关系运算的结果为boolean型，
		 *     关系成立则为true，关系不成立则为false
		 */
		/*
		int a=5,b=10,c=5;
		boolean b1 = a>b;
		System.out.println(b1);   //false
		System.out.println(c<b);  //true
		System.out.println(b>=a); //true
		System.out.println(a<=c); //true
		System.out.println(a==c); //true
		System.out.println(a!=c); //false
		
		System.out.println(a+c>b);  //false
		System.out.println(a%2==0); //false
		System.out.println(c++>5);  //false，同时c增为6
		System.out.println(c++>5);  //true
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * 1.算术运算符:+,-,*,/,%,++,--
		 *   1)%:取模/取余，余数为0即为整除
		 *   2)++/--:自增1/自减1，可在变量前也可在变量后
		 *     2.1)单独使用时，在前在后都一样
		 *     2.2)被使用时，在前在后不一样
		 *           a++的值为a--------(a--的值为a)
		 *           ++a的值为a+1------(--a的值为a-1)
		 */
		/*
		int a=5,b=5;
		int c = a--;
		int d = --b;
		System.out.println(a); //4
		System.out.println(b); //4
		System.out.println(c); //5
		System.out.println(d); //4
		*/
		/*
		int a=5,b=5;
		//1)将a++的值5赋值给c
		//2)a自增1变为6
		int c = a++;
		//1)将++b的值6赋值给d
		//2)b自增1变为6
		int d = ++b;
		System.out.println(a); //6
		System.out.println(b); //6
		System.out.println(c); //5
		System.out.println(d); //6
		*/
		
		/*
		int a=5,b=5;
		a++; //相当于a=a+1
		++b; //相当于b=b+1
		System.out.println(a); //6
		System.out.println(b); //6
		*/
		
		/*
		System.out.println(5%2); //1，商2余1
		System.out.println(8%2); //0，商4余0----整除
		System.out.println(2%8); //2，商0余2
		*/
	}
}
















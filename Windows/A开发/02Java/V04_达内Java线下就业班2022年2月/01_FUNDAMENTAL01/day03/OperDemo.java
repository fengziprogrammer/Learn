package day03;
//���������ʾ
public class OperDemo {
	public static void main(String[] args) {
		/*
		 * 6.����/��Ŀ�����:
		 *   1)�﷨:
		 *       boolean?��1:��2
		 *   2)ִ�й���:
		 *     ----�������ʽ����ֵ�ģ�����ֵҪô����1��Ҫô����2
		 *     ----����boolean��ֵ:
		 *     ------��Ϊtrue�����������ʽ��ֵΪ?�����1
		 *     ------��Ϊfalse�����������ʽ��ֵΪ:�����2
		 */
		
		int a=8,b=5;
		int max = a>b?a:b ;
		System.out.println(max); //8
		
		int num = 5;
		int flag = num>0?1:-1;
		System.out.println(flag); //-1
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * 5.�ַ������������:
		 *   1)+:
		 *     1.1)�����߶������֣������ӷ�����
		 *     1.2)�����߳������ַ����������ַ�������
		 */

		int age = 37;
		System.out.println("age="); //age=
		System.out.println(age);    //37
		System.out.println("age="+age); //age=37
		System.out.println("�ҵ�������"+age); //�ҵ�������37
		System.out.println("�ҽ���"+age+"����"); //�ҽ���37����
		String name = "WKJ";
		System.out.println("name="+name); //name=WKJ
		System.out.println("��Һã��ҽ�"+name); //��Һã��ҽ�WKJ
		System.out.println("��Һã��ҽ�"+name+"������"+age+"����"); //��Һã��ҽ�WKJ������37����
		
		System.out.println(10+20+""+30); //3030-----String
		System.out.println(""+10+20+30); //102030---String
		System.out.println(10+20+30+""); //60-------String

		
		
		
		
		
		
		/*
		 * 4.��ֵ�����:
		 *   1)�򵥸�ֵ�����:=
		 *   2)��չ��ֵ�����:+=,-=,*=,/=,%=
		 *     ----�Դ�ǿת����
		 */
		/*
		int a = 5;
		a += 10; //�൱��a=(int)(a+10)
		System.out.println(a); //15
		a *= 2; //�൱��a=a*2
		System.out.println(a); //30
		a /= 6; //�൱��a=a/6
		System.out.println(a); //5
		
		//����������:
		short s = 5;
		s += 10; //�൱��s=(short)(s+10);
		//s = s+10; //���������ǿת s=(short)(s+10);
		*/
		
		
		
		
		
		
		
		
		
		/*
		 * 3.�߼������:
		 *   1)&&:��·��(����)�����߶�Ϊ����Ϊ�棬��false��false
		 *        ---����1����Ϊfalseʱ��������·(����Ĳ�ִ����)
		 *     ||:��·��(����)��������Ϊ�棬��true��true
		 *        ---����1����Ϊtrueʱ��������·(����Ĳ�ִ����)
		 *      !:�߼���(ȡ��)��������٣��Ǽ�����
		 *   2)�߼������ǽ����ڹ�ϵ����Ļ���֮�ϵ�
		 *     �߼�����Ľ��Ҳ��boolean��
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
		System.out.println(c);  //5��������·��
		
		boolean b4 = a<b || c++>2;
		System.out.println(b4); //true
		System.out.println(c);  //5��������·��
		
		*/
		
		
		
		
		
		
		
		
		
		
		/*
		 * 2.��ϵ�����:
		 *   1)>(����),<(С��)
		 *     >=(���ڻ����),<=(С�ڻ����)
		 *     ==(����),!=(������)
		 *   2)��ϵ����Ľ��Ϊboolean�ͣ�
		 *     ��ϵ������Ϊtrue����ϵ��������Ϊfalse
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
		System.out.println(c++>5);  //false��ͬʱc��Ϊ6
		System.out.println(c++>5);  //true
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * 1.���������:+,-,*,/,%,++,--
		 *   1)%:ȡģ/ȡ�࣬����Ϊ0��Ϊ����
		 *   2)++/--:����1/�Լ�1�����ڱ���ǰҲ���ڱ�����
		 *     2.1)����ʹ��ʱ����ǰ�ں�һ��
		 *     2.2)��ʹ��ʱ����ǰ�ں�һ��
		 *           a++��ֵΪa--------(a--��ֵΪa)
		 *           ++a��ֵΪa+1------(--a��ֵΪa-1)
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
		//1)��a++��ֵ5��ֵ��c
		//2)a����1��Ϊ6
		int c = a++;
		//1)��++b��ֵ6��ֵ��d
		//2)b����1��Ϊ6
		int d = ++b;
		System.out.println(a); //6
		System.out.println(b); //6
		System.out.println(c); //5
		System.out.println(d); //6
		*/
		
		/*
		int a=5,b=5;
		a++; //�൱��a=a+1
		++b; //�൱��b=b+1
		System.out.println(a); //6
		System.out.println(b); //6
		*/
		
		/*
		System.out.println(5%2); //1����2��1
		System.out.println(8%2); //0����4��0----����
		System.out.println(2%8); //2����0��2
		*/
	}
}
















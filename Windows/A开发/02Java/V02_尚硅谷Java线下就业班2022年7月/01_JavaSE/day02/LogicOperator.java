/*
3���߼������
�߼��룺&
	true & true �����true
	true & false �����false
	false & true �����false
	false & false �����false
	
	ֻ�������߶���true�������Ϊtrue��

�߼���|
	true | true �����true
	true | false �����true
	false | true �����true
	false | false �����false
	
	ֻҪ��һ����true�������Ϊtrue��
	
�߼��ǣ�!
	!true  ��Ϊfalse
	!false ��Ϊtrue
	
�߼����^
	true | true �����false
	true | false �����true
	false | true �����true
	false | false �����false
	
	ֻ�����߲�һ����һ����true��һ����false�������Ϊtrue��
	
��·�룺&&
	true && true �����true
	true && false �����false
	false && ? �����false
	false && ? �����false
	
	ֻ�������߶���true�������Ϊtrue��
	�������������Ѿ���false���ұ߲����������ĺô����ǿ������Ч�ʡ�

	
��·��||
	true || �� �����true
	true || �� �����true
	false || true �����true
	false || false �����false
	
	ֻҪ��һ����true�������Ϊtrue��
	�������������Ѿ���true���ұ߾Ͳ����ˡ������ĺô����ǿ������Ч�ʡ�

���⣺
��1���߼�������Ĳ�����������booleanֵ
��2���߼�������Ľ��Ҳ��booleanֵ

*/
public class LogicOperator{
	public static void main(String[] args){
		/*
		��ʾ�������ɼ�������[0,100]֮��
		�ɼ���int���ͱ���score
		*/
		int score = 56;
		
		//System.out.println(0<=score<=100);
		/*
		LogicOperator.java:23: ����: ��Ԫ����� '<=' �Ĳ��������ʹ���
                System.out.println(0<=score<=100);
                                           ^
		  ��һ������:  boolean    0<=score�Ľ�� true
		  �ڶ�������: int
		  
		  true <= 100�����Ե�
		1 ������*/
		
		System.out.println(0<=score  & score<=100);
		
	}
}
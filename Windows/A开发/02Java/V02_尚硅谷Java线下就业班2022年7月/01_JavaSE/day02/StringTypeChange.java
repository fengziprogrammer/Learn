/*
String����������������͵�ת�����⣿
�κ�����������String����+��ƴ�ӣ����������String
�����������ͽ��С�+���������

*/
public class StringTypeChange{
	public static void main(String[] args){
		char c1 = 'a';
		char c2 = 'b';
		System.out.println(c1 + c2);//195
		//"c1+c2 = "�����String�ĳ���
		//"c1+c2 = "����� +�ͱ����ƴ��
		System.out.println("c1+c2 = " + c1 + c2);
		System.out.println(c1 + c2 +"");//����ͺ�ƴ��
		System.out.println(c1 + "" +  c2 );//ƴ��
	}
}
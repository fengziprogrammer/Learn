/*
һ��char���͵ı������Ը�ֵΪ��
��1�����������������ַ�
��2���������ַ���Unicode����ֵ��ʮ����ֵ��ʽ
��3���������ַ���Unicode����ֵ��ʮ������ֵ��ʽ
��4�������ַ���Ҫ��ת��ķ�ʽ��ʾ
\t��Tab
\n������   �ѹ���Ƶ���һ������
\\��\
\'��'
\"��"
\b���˸��
\r���س�  �ѹ���Ƶ���������
*/
public class TestChar{
	public static void main(String[] args){
		char c1 = 'a';
		char c2 = 97;
		char c3 = '\u0061';
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		System.out.println('\\');
		System.out.println('\'');
		System.out.println("'");//�����ʽ��������Ų���ת��
		System.out.println("\"");
		System.out.println('"');//�ⷽʽ���˫���žͲ���ת��
		
		System.out.println("-------------------------");
		System.out.println("hello\tjava");
		System.out.println("hello\rjava");
		System.out.println("hello\njava");

		System.out.println("-------------------------");	
		System.out.println("hello\tworld\tjava.");
		System.out.println("chailinyan\tis\tbeautiful.");
		System.out.println("����\t��������\t����");
		System.out.println("����\t10000.0\t23");		
	}
}
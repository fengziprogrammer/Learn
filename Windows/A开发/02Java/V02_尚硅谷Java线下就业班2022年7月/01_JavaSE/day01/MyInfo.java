/*
4���ú������͵ı����洢������Ϣ�����
�洢�Լ������������䡢�Ա����ء�����״��
���ѻ���true��ʾ��������false��ʾ���ȵ�
*/
public class MyInfo{
	public static void main(String[] args){
		//�洢������String����
		//=����Ǳ��������ұ��ǳ���ֵ����������ֵ
		String name = "������";
	
		System.out.println("name");//ԭ����ʾ�ַ�������ֵ"name"
		System.out.println(name);//�ѱ���name�е�ֵ���
		
		int age = 18;
		char gender = 'Ů';
		double weight = 42.5;
		boolean marry = true;
		System.out.println(age);
		System.out.println(gender);
		System.out.println(weight);
		System.out.println(marry);
		
		System.out.println("----------------");
		// + ��ʾƴ�ӣ���"������"�ַ������� ��name�ַ���������ֵ��ƴ������������һ���ַ���ֵ
		System.out.println("������" + name);
		System.out.println("name=" + name);
		//System.out.println("������",name);//����
		
	}
}
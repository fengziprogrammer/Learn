public class Exer7{
	public static void main (String [] args) {
        //1.����һ����������ֵΪһ����λ������������1234
        int num = 1234;

        //2.ͨ��������������λ��ʮλ����λ��ǧλ
        int ge = num % 10;
        int shi = num / 10 % 10;
        int bai = num / 100 % 10;
        int qian = num / 1000 % 10;

        System.out.println(num + "�����λ����λ�ϵ������ǣ�" + ge);
        System.out.println(num + "�����λ��ʮλ�ϵ������ǣ�" + shi);
        System.out.println(num + "�����λ����λ�ϵ������ǣ�" + bai);
        System.out.println(num + "�����λ��ǧλ�ϵ������ǣ�" + qian);
    }
}
class  Demo4 {

/*
	&& �� & ����
	��ͬ��
		������߼����һ�µ�
	��ͬ��
		&& �߱���·Ч�� 
			ԭ�� ��false ��false 
			��������false  �ұ���ִ��
		& ���߱���·Ч��
			��������false  �ұ���Ȼִ��
	|| �� | ����
	��ͬ��
		������߼����һ�µ�
	��ͬ��
		|| �߱���·Ч�� 
			ԭ�� ��true ��true 
			��������true  �ұ���ִ��
		| ���߱���·Ч��
			��������true  �ұ���Ȼִ��
*/
	public static void main(String[] args) {

		int a = 3;
		int b = 4;
		int c = 5;

		int x = 3;
		int y = 4;

		// & �룬�� and����false��false
		System.out.println((a > b) && (x++ == y)); //F & F -> F
		System.out.println(x);// ?

		//System.out.println((a > b) && (a < c)); //F & T -> F
		//System.out.println((a < b) && (a > c)); //T & F -> F
		//System.out.println((a < b) && (a < c)); // T & T -> T
		//System.out.println("===============");
		// | ����true��true
		/*System.out.println((a > b) | (a > c)); //F
		System.out.println((a > b) | (a < c)); //T
		System.out.println((a < b) | (a > c)); //T
		System.out.println((a < b) | (a < c)); //T*/
		System.out.println("===============");

		// ^ �����ͬΪfalse����ͬΪtrue
		//System.out.println((a > b) ^ (a > c));//F F F
		//System.out.println((a > b) ^ (a < c)); //F T T
		//System.out.println((a < b) ^ (a > c)); //T F T
		//System.out.println((a < b) ^ (a < c)); // T T F
		System.out.println("===============");
		// ! �ǣ���false��true����true��false
		//System.out.println(!false);//t
		//System.out.println(!!true);//t 
	}
}

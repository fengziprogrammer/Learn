class Demo1 {

	public static void main(String[] args) {

		// ������������һ��ʹ��
		int x = 3;

		int y = ++x; // y��ֵ��4��x��ֵ��4��
		
		//int y = x++ + x; 		
		//System.out.println(x);//4 
		//System.out.println(y);//4
		System.out.println("==========");
        
		// ��������һ��
		int z = 5;
		//System.out.println(++z);// ��������6��z��ֵҲ��6
		System.out.println(z++);// ��������5��z��ֵ��6
		System.out.println(z);//6
	}
}

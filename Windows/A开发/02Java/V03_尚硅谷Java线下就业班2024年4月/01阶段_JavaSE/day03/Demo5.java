class Demo5 {

	public static void main(String[] args) {

		int x = 1,y = 1;

		//x==1,x++  ���Ϊtrue��x=2
		//��Ϊ�Ƕ�·�����Ϊtrue���ұ߾Ͳ�ִ��
		//��������Ϊtrue
		if(x++==1 || ++y==1){
			x =7;
		}
		System.out.println("x="+x+",y="+y);//x=7,y=1
	}
}

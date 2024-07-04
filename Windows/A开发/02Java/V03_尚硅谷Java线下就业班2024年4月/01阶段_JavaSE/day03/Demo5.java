class Demo5 {

	public static void main(String[] args) {

		int x = 1,y = 1;

		//x==1,x++  左边为true，x=2
		//因为是短路或，左边为true，右边就不执行
		//整个条件为true
		if(x++==1 || ++y==1){
			x =7;
		}
		System.out.println("x="+x+",y="+y);//x=7,y=1
	}
}

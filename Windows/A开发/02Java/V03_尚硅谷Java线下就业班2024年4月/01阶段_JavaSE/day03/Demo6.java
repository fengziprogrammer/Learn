class Demo6 {

	public static void main(String[] args) {

		boolean x = true;
		boolean y = false;
		short z = 42;
		
		//if(y = true)
		//   true  z++ -> 43  && f
		if((z++==42)&&(y==true)){
			z++;//��ִ��
		}

		//  false || ++��z -> 44  false
		if((x=false) || (++z==45)){
			z++;//��ִ��
		}
		System. out.println("z="+z);//44
	}
}

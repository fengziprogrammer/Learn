class Demo6 {

	public static void main(String[] args) {

		boolean x = true;
		boolean y = false;
		short z = 42;
		
		//if(y = true)
		//   true  z++ -> 43  && f
		if((z++==42)&&(y==true)){
			z++;//不执行
		}

		//  false || ++后z -> 44  false
		if((x=false) || (++z==45)){
			z++;//不执行
		}
		System. out.println("z="+z);//44
	}
}

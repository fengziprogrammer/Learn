class Demo7 {

	public static void main(String[] args) {

		boolean x = true;
		boolean y = false;
		short z = 42;
		
		if(y = true){// y-> ture
		   
		   // true z->43 && true
			if((z++==42)&&(y==true)){
				z++;//ִ�� z -> 44
			}
		}

		//  false || ++ z-> 45 true 
		if((x=false) || (++z==45)){
			z++;// ִ�� z ->46
		}
		System. out.println("z="+z);//46
	}
}

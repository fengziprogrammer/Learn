public class Exer14_2{
	public static void main(String[] args){
		int x = 1,y = 1;

		/*
		(1)x++����ȡx��ֵ1���ŵ�������ջ�У�x����Ϊ2
		(2)�ж�==  1==2��������,false
		(3)&&������·���ұ߲���		
		*/
		if(x++==2 && ++y==2){//if(false && ?) if(false)������
			x =7;//��ִ��
		}
		System.out.println("x="+x+",y="+y);//x=2,y=1
	}
}
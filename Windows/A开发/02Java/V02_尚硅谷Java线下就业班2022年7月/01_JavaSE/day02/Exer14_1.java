public class Exer14_1{
	public static void main(String[] args){
		int x = 1;
		int y = 1;

		/*
		(1)x++����ȡx��ֵ1���ŵ�������ջ�У�x����Ϊ2
		(2)�ж�==  1==2��������,false
		(3)&��������·
		(4)++y��y������Ϊ2��Ȼ��ȡ2
		(5)�ж�== 2==2��������true
		(6)&  false & true�������false
		*/
		if(x++==2 & ++y==2){//if(false)������
			x =7;//��ִ��
		}
		System.out.println("x="+x+",y="+y);//x=2,y=2
	}
}
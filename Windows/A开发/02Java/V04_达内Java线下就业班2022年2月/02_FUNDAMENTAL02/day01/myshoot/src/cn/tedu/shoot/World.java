package cn.tedu.shoot;
/** ������ */
public class World {
	cn.tedu.shoot.Sky s;
	cn.tedu.shoot.Hero h;
	cn.tedu.shoot.Airplane a1;
	cn.tedu.shoot.Airplane a2;
	cn.tedu.shoot.BigAirplane ba1;
	cn.tedu.shoot.BigAirplane ba2;
	cn.tedu.shoot.Bee b1;
	cn.tedu.shoot.Bee b2;
	cn.tedu.shoot.Bullet bt1;
	cn.tedu.shoot.Bullet bt2;
	
	void action() { //���Դ���
		s = new cn.tedu.shoot.Sky();
		s.width = 400;
		s.height = 700;
		s.x = 0;
		s.y = 0;
		s.speed = 1;
		s.y1 = -700;
		s.step();
		
		a1 = new cn.tedu.shoot.Airplane();
		a1.width = 50;
		a1.height = 40;
		a1.x = 100;
		a1.y = 200;
		a1.speed = 2;
		a1.step();
	}
	
	public static void main(String[] args) {
		World w = new World();
		w.action();
	}
}

/*
 * 1.��:Ϊ�ν����������main������?
 *   ��:World���к��ڻ���ƺܶ෽��������Щ�����ж���Ҫȥ�������ã�
 *      �������������main�У������������������޷������ý��з��ʵ�
 *      �����������main�⣬������Ϊ��Ա�����ˣ����÷�ΧΪ������
 * 2.��:Ϊ��Ҫ��������action()������������?
 *   ��:��Ϊmain������static�ģ���static�ķ������޷������Ƕ�����
 *      ----static����������5��ʱ��
 * 3.��:Ϊ����main��Ҫ�ȴ���World�����ٵ���action()����?
 *   ��:��Ϊmain������static�ģ���static�ķ������޷�ֱ�ӵ���action()����
 *      ----static����������5��ʱ��
 */





















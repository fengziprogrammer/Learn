package cn.tedu.shoot;
/** 窗口类 */
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
	
	void action() { //测试代码
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
 * 1.问:为何将引用设计在main的外面?
 *   答:World类中后期会设计很多方法，而那些方法中都需要去操作引用，
 *      若将引用设计在main中，则在其它方法中是无法对引用进行访问的
 *      将引用设计在main外，则引用为成员变量了，作用范围为整个类
 * 2.问:为何要单独创建action()方法来做测试?
 *   答:因为main方法是static的，在static的方法中无法访问那堆引用
 *      ----static的面向对象第5天时讲
 * 3.问:为何在main中要先创建World对象，再调用action()方法?
 *   答:因为main方法是static的，在static的方法中无法直接调用action()方法
 *      ----static的面向对象第5天时讲
 */





















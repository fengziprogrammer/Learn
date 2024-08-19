package com.itheima.extends_contructor;
/*
    需求 ：
        定义猫类（Cat）和狗类（Dog）

        猫类成员变量：品种(breed) ,颜色(color)
        猫类成员方法：eat（猫吃鱼）, drink（喝水…） , 抓老鼠(catchMouse)

	    狗类成员变量：品种(breed) ,颜色(color)
	    狗类成员方法：eat（狗吃肉）, drink（喝水…） , 看家(lookHome)

	    分析 : 两个类中存在共性内容, 需要抽取
	    父类(Animal)
	        成员变量：品种(breed) ,颜色(color)
	        成员方法：eat（狗吃肉）, drink（喝水…）
 */
class Test2 {
    public static void main(String[] args) {
        // 空参构造  + set方法
        Dog d = new Dog();
        d.setBreed("金毛");
        d.setColor("金黄色");
        System.out.println(d.getBreed());
        System.out.println(d.getColor());
        d.lookHome();
        d.eat();
        d.drink();
        System.out.println("============");

        // 全参构造
        Dog d2 = new Dog("二哈" , "黑白");
        System.out.println(d2.getBreed());
        System.out.println(d2.getColor());
        d2.lookHome();
        d2.eat();
        d2.drink();
    }
}

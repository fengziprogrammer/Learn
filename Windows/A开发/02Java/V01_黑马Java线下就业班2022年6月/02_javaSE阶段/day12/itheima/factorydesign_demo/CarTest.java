package com.itheima.factorydesign_demo;

/*
  - 需求：定义汽车工厂类，生产各种品牌的车

  - 实现步骤
      - 编写一个Car接口, 提供run方法
      - 编写一个Falali类实现Car接口,重写run方法
      - 编写一个Benchi类实现Car接口
      =============================================
      - 提供一个CarFactory(汽车工厂),用于生产汽车对象
      - 定义CarFactoryTest测试汽车工厂
 */
public class CarTest {
    public static void main(String[] args) {
        Car benchi = CarFactory.getInstance(Brand.BENCHI);
        System.out.println(benchi);
    }
}

// 汽车接口
interface Car {
    public abstract void run();
}

// 编写一个Falali类实现Car接口,重写run方法
class Falali implements Car {
    public Falali() {
    }

    @Override
    public void run() {
        System.out.println("法拉利破百需要3秒...");
    }
}

// 编写一个Benchi类实现Car接口
class Benchi implements Car {
    @Override
    public void run() {
        System.out.println("奔驰破百需要5秒...");
    }
}

// 汽车品牌枚举
enum Brand {
    BENCHI, FALALI, BAOMA, BINLI, AODI;
}

// 提供一个CarFactory(汽车工厂),用于生产汽车对象
class CarFactory {
    private CarFactory() {
    }

    public static Car getInstance(Brand brand) {
        switch (brand) {
            case FALALI:
                return new Falali();
            case BENCHI:
                return new Benchi();
            default:
                return null;
        }
    }
}

//// 提供一个CarFactory(汽车工厂),用于生产汽车对象
//class CarFactory{
//    private CarFactory(){}
//
//    public static Car getInstance(String brand) {
//        if(brand.equals("Falali")){
//            return new Falali(10);
//        }else if(brand.equals("Benchi")) {
//            return new Benchi();
//        }else {
//            return null;
//        }
//    }
//}









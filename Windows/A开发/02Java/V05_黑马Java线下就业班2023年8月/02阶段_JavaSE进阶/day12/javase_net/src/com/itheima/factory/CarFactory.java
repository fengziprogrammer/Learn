package com.itheima.factory;

//汽车工厂类
public class CarFactory {
    //私有构造方法
    private CarFactory(){
    }

    //静态方法：返回创建的对象
    public static Car getInstance(String name){
        Car car = null;
        if("benchi".equals(name)){
            car =  new Benchi();
        }else if("falali".equals(name)){
            car = new Falali();
        }
        return car;
    }
}

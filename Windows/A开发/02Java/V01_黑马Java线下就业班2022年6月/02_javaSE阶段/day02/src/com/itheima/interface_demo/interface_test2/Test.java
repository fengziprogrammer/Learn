package com.itheima.interface_demo.interface_test2;

public class Test {
    public static void main(String[] args) {
        BasketballBoy basketballBoy = new BasketballBoy("蔡徐坤" , 30);
        System.out.println(basketballBoy.getName());
        System.out.println(basketballBoy.getAge());
        basketballBoy.study();
        basketballBoy.play();
        System.out.println("===================");

        StudyGirl studyGirl = new StudyGirl();
        studyGirl.setName("王祖贤");
        studyGirl.setAge(18);
        System.out.println(studyGirl.getName());
        System.out.println(studyGirl.getAge());
        studyGirl.study();
        // studyGirl.play();
    }
}

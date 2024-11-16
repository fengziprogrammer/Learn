package com.atguigu.e_newjdk;

public class Demo08Sealed {
}
sealed class Animal1 permits Cat,Pig{}

non-sealed class Cat extends Animal1{

}

 non-sealed class Pig extends Animal1{

}

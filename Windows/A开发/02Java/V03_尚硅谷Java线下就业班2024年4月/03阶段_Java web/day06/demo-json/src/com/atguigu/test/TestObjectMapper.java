package com.atguigu.test;

import com.atguigu.pojo.Friend;
import com.atguigu.pojo.Person;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.testng.annotations.Test;



public class TestObjectMapper {
    @Test
    public void testWriteJson() throws Exception{
        Friend friend=new Friend("恐龙抗狼",23);

        String[] foods ={"香蕉","黄瓜","馒头"};

        Person person=new Person("张小明",22,"男",friend,foods);

        // 将Person对象转换成一个JSON字符串 反射
        ObjectMapper objectMapper =new ObjectMapper();
        String personStr = objectMapper.writeValueAsString(person);
        System.out.println(personStr);

        Person person1 = objectMapper.readValue(personStr, Person.class);
        System.out.println(person1);


    }


}

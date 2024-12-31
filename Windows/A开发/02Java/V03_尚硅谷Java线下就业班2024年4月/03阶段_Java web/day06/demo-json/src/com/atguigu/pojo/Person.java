package com.atguigu.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.lang.reflect.Array;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Person {
    private String name;
    private Integer age;
    private String gender;
    private Friend friend;
    private String[] foods;
}

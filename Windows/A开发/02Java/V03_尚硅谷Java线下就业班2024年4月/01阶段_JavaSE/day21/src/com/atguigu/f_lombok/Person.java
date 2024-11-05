package com.atguigu.f_lombok;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    private String name;
    private Integer age;
}

package com.atguigu.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Order implements Serializable {
    private Integer oid;
    private Integer aid;
    private Integer pid;
    private Integer count;
}

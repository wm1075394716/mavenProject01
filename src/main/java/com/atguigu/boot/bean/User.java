package com.atguigu.boot.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor//有参构造器
@NoArgsConstructor//无参构造器
@Data//生成getset方法
@ToString//生成tostring方法
public class User {
    private int id;
    private String name;
    int type;

}

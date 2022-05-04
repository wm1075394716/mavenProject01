package com.atguigu.boot.config;

import com.atguigu.boot.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//配置类，配置类本身也是组件
//配置时，默认proxyBeanMethods=true,若手动修改为false，每次调用时都会新建一个MyConfig对象
@Configuration
public class MyConfig {
    //配置组件名，默认单实例，每次调用时用的是同一个组件
    @Bean(name = "wm")
    public User setUser(){
        return new User(1,"WM",1);
    }
}

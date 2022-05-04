package com.atguigu.boot;

import com.atguigu.boot.bean.User;
import com.atguigu.boot.config.MyConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@Slf4j
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        log.info("请求日志");
        ConfigurableApplicationContext run = SpringApplication.run(MainApplication.class, args);
        User wm = run.getBean("wm", User.class);
        User wm1 = run.getBean("wm", User.class);
        System.out.println("组件："+(wm1==wm));
        MyConfig bean = run.getBean(MyConfig.class);
        System.out.println(bean);
        System.out.println("hot_fix");
        System.out.println("master test");
//        bean.setUser(new User(2,"xx",1));
//        User xx=run.getBean("wm",User.class);
//        System.out.println(xx);
    }
}

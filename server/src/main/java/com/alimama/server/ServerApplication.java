package com.alimama.server;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
@ImportResource(locations = {"classpath*:spring/application.xml"})
public class ServerApplication {

    public static void main(String[] args) {
        System.out.println("*****************服务提供开始启动**************");
        SpringApplication.run(ServerApplication.class, args);
       /* ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/application.xml");
        context.start();*/
        System.out.println("*****************服务提供启动完成*************");
    }

   /* @Configuration
    @EnableDubbo(scanBasePackages = "com.alimama.server")
    @PropertySource("classpath:/application.properties")
    static public class ProviderConfiguration {

    }*/

}

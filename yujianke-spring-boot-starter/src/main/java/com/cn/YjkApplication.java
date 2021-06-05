package com.cn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class YjkApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(YjkApplication.class, args);
        for (String beanDefinitionName : run.getBeanDefinitionNames()) {

            System.out.println(beanDefinitionName);
        }
    }
}

package com.cn.config;

import com.cn.model.Lili;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfig {

    @Bean
    public Lili lili(){
        return  new Lili("1","1");
    }

    @Bean
    public Lili lili1(){
        return  new Lili("2","2");
    }
}

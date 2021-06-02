package com.cn.server;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;

@Configuration
@ConditionalOnClass(LxrZhenRen.class)
@EnableConfigurationProperties(LxrProperties.class)
public class LxrAutoConfiguration {
    @Resource
    LxrProperties lxrProperties;

    @Bean
    @ConditionalOnProperty(name = "lxr.tz.enabled", havingValue = "true")
    public LxrZhenRen lxrZhenRen(){
        return new LxrZhenRen(lxrProperties.getName(),lxrProperties.getAge());
    }
    @Bean
    @ConditionalOnMissingBean()
    public LxrZhenRen lxrJiaRen(){
        return new LxrZhenRen(null,null);
    }
}

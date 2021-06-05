package com.cn.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@AllArgsConstructor
@NoArgsConstructor
//@Component
@ConfigurationProperties(prefix = "yjk")
//@PropertySource(value = {"classpath:abc.properties"})
public class Yujianke {
    private String name;
    private String age;
}

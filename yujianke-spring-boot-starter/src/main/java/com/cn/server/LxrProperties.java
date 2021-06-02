package com.cn.server;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ConfigurationProperties(prefix = "lxr.tz")
public class LxrProperties {
    private  String name;
    private  Integer age;
    private  String montherName;
    private  String brotherName;
}

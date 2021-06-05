package com.cn.server;

import com.cn.model.Lili;
import com.cn.model.Yujianke;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Properties;

@RestController
@EnableConfigurationProperties(Yujianke.class)
@RequestMapping("abc")
public class TestController {
    @Value("${server.port}")
    private String port;
    @Value("${yjk.name}")
    private String name;
    @Value("${yjk.age}")
    private String age;
    @Resource(name = "lili1")
    Lili lili;
    @Resource
    Yujianke yujianke;
    @Autowired
    Environment environment;
    @RequestMapping("test1")
    public String test(){
     return age;
    }

    @RequestMapping("test2")
    public String test2(){
        Properties properties = PropertiesUtils.getProperties("abc.properties");
        String property = properties.getProperty("yjk.age");
        return property;
    }

    @RequestMapping("test3")
    public String test3(){
        String value = YamlUtil.getValue("yjk.age.age");
        return value;
    }

    @RequestMapping("test4")
    public String test4(){
        return yujianke.getAge();
    }

    @RequestMapping("test5")
    public String test5(){
        String property = environment.getProperty("yjk.age");
        return property;
    }

    @RequestMapping("test6")
    public String test6(){

        return lili.getName();
    }
}

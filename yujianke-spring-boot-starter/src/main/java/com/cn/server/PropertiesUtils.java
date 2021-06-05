package com.cn.server;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.support.EncodedResource;
import org.springframework.core.io.support.PropertiesLoaderUtils;

import java.io.IOException;
import java.util.Properties;

public class PropertiesUtils {

    public static Properties getProperties(String loaction){
        Properties properties=null;
        try {
             properties = PropertiesLoaderUtils.
                    loadProperties(new EncodedResource(new ClassPathResource(loaction), "UTF-8"));
        } catch (IOException e) {
            e.printStackTrace();
        }
           return properties;

    }
}

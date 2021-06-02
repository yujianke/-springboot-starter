package com.example.controller;

import com.cn.server.LxrZhenRen;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author zhangfan
 */
@RestController
public class TestController {

    @Resource
    LxrZhenRen lxrZhenRen;

    @RequestMapping("/test")
    public String getlxr()
    {
        return lxrZhenRen.make();
    }
}

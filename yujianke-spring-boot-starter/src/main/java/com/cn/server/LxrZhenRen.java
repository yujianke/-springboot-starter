package com.cn.server;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class LxrZhenRen {
    private String name;
    private Integer age;

    public String make() {
        if(null ==name){
            return "创造lxr失败";
        }
        return "创造lxr成功:"+name+ age;
    }
}

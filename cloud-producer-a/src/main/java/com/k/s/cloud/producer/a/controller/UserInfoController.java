package com.k.s.cloud.producer.a.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/user")
public class UserInfoController {


    @RequestMapping(value = "/info")
    public String userInfo(){
        System.out.println("===============");
        Map<String, String> map = new HashMap<>();
        map.put("name", "张三a");
        map.put("age", "21");
        System.out.println("++++++++++++++");
        return JSONObject.toJSONString(map);
    }
}

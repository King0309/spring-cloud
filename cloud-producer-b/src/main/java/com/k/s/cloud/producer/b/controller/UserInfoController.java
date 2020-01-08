package com.k.s.cloud.producer.b.controller;

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
        System.out.println("+++++++++++BBB+++++++++++");
        Map<String, String> map = new HashMap<>();
        map.put("name", "张三b");
        map.put("age", "26");
        return JSONObject.toJSONString(map);
    }
}

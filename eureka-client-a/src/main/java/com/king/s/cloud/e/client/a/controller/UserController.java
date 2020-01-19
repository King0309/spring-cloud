package com.king.s.cloud.e.client.a.controller;

import com.king.s.cloud.e.client.a.annotation.LogPrinter;
import com.king.s.cloud.e.client.a.feign.UserFeignClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    Logger log = LoggerFactory.getLogger(UserController.class);

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    LoadBalancerClient client;

    @Autowired
    UserFeignClient userFeignClient;

    @LogPrinter
    @RequestMapping(value = "/date")
    public String userInfo(){
        String uu = userFeignClient.userInfo();
        log.info("请求结果：" + uu);
        if(uu == null){
            return "未查询到用户";
        }
//        String url = "http://cloud-producer-b/user/info";
//        ResponseEntity<String> resp = restTemplate.getForEntity(url, String.class);
        return uu;
    }

    @RequestMapping(value = "/date2")
    public String userInfo2(){
        ServiceInstance service = client.choose("cloud-producer-b");
        String instanceId = service.getInstanceId();
        String serviceId = service.getServiceId();
        System.out.println(instanceId + "  " + serviceId);
        return "success";
    }

    @RequestMapping(value = "")
    public String userDetail(Integer userId){
        log.info("用户id={}", userId);
        Map<String, String> detail = new HashMap<>();
        detail.put("name", "de");
        return "成功";
    }
}

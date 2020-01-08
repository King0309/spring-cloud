package com.king.s.cloud.e.client.a.feign;

import com.king.s.cloud.e.client.a.config.FeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "cloud-producer-b", configuration = FeignConfig.class)
public interface UserFeignClient {

    @RequestMapping(value = "/user/info", method = RequestMethod.GET)
    String userInfo();
}

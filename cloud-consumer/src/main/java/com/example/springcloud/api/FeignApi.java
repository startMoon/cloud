package com.example.springcloud.api;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by lenovo on 2017/8/14.
 */
@FeignClient(value = "eureka-client", fallback = FeignApiCallBack.class)
public interface FeignApi {

    @RequestMapping("/hello")
    String hello(@RequestParam("name") String name);

}

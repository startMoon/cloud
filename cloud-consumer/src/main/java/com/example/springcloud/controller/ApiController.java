package com.example.springcloud.controller;

import com.example.springcloud.api.FeignApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lenovo on 2017/8/14.
 */
@RestController
public class ApiController {

    @Value("${ip}")
    private String ip;

    @Value("${port}")
    private String port;

    @Autowired
    private FeignApi feignApi;

    @RequestMapping("/hello/feign")
    public String hello(String name) {
        System.out.println("<----------------- ip: " + ip + " port: " + port + " -------------------->");
        return feignApi.hello(name);
    }
}

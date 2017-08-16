package com.example.springcloud.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lenovo on 2017/8/14.
 */
@RestController
public class RestTemplateApi {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/hello")
    public String hello(String name) {

        return restTemplate.getForEntity("http://eureka-client/hello?name="+name, String.class).getBody();
    }


}

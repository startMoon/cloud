package com.example.springcloud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lenovo on 2017/8/14.
 */
@RestController
public class ApiController {

    @RequestMapping("/hello")
    public String hello(String name) {
        return "hello " + name;
    }

}

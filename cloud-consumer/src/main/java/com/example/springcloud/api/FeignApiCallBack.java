package com.example.springcloud.api;

import org.springframework.stereotype.Component;

/**
 * Created by lenovo on 2017/8/14.
 */
@Component
public class FeignApiCallBack implements FeignApi {
    @Override
    public String hello(String name) {
        return "failed";
    }
}

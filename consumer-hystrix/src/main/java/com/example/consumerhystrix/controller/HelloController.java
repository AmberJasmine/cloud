package com.example.consumerhystrix.controller;

import com.example.consumerhystrix.feign.ProviderUserFeign;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create by Administrator
 * Data 21:04 2021/12/17 星期五
 */
@RestController
public class HelloController {

    @Autowired
    private ProviderUserFeign providerUserFeign;

    @GetMapping("/hello")
    @HystrixCommand(fallbackMethod = "helloFallback")
    public String hello(@RequestParam String name) {
        return providerUserFeign.helloFeign(name);
    }

    public String helloFallback(String name) {
        return "Hystrix!!!";
    }


}

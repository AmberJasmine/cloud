package com.example.consumerfeign.controller;

import com.example.consumerfeign.feign.ProviderUserFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create by Administrator
 * Data 12:01 2021/12/16 星期四
 */
@RestController
public class HelloController {

    @Autowired
    private ProviderUserFeign providerUserFeign;

    @RequestMapping("/hi")
    public String hi(@RequestParam String name){
        return providerUserFeign.hi(name);
    }

}

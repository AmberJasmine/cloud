package com.example.consumerclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Create by Administrator
 * Data 2:48 2021/12/16 星期四
 */
@RestController
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/hi")
    public String hi(@RequestParam String name) {
        String url = "http://localhost:7900/hello/" + name;
        url = "http://provider-user/hello/" + name;
        return restTemplate.getForObject(url, String.class);
    }


}

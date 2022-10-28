package com.example.provideruser2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create by Administrator
 * Data 10:01 2021/12/16 星期四
 */
@RestController
public class HelloController {

    @GetMapping("/hello/{name}")
    public String hello(@PathVariable String name) {
        int a = 1/0;
        return "生产者2：hello " + name;
    }
}

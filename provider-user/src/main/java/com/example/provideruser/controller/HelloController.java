package com.example.provideruser.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create by Administrator
 * Data 1:28 2021/12/16 星期四
 */
@RestController
public class HelloController {

    @GetMapping("/hello/{name}")
    public String hello(@PathVariable String name) {
        return "生产者1：hello " + name;
    }
}

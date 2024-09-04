package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create by Administrator
 * Data 11:16 2021/12/17 星期五
 */
@RestController
public class HelloController {

    @GetMapping("/hello/{name}")
    public String f(@PathVariable String name) {
        return "demo：hello " + name;
    }

}

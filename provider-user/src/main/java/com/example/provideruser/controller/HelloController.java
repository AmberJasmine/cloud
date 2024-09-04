package com.example.provideruser.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create by Administrator
 * Data 1:28 2021/12/16 星期四
 */
@Api(tags = {"生产者provider-user"})
@RestController
@RequestMapping("user")
public class HelloController {

    @GetMapping("/hello/{name}")
    @ApiOperation(value = "生产者user测试", notes = "provider-user生产者", httpMethod = "GET")
    public String hello(@PathVariable String name) {
        return "生产者1：hello " + name;
    }

}

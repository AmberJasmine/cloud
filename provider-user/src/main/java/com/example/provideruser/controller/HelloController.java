package com.example.provideruser.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Value;
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

    @Value(value = "${server.port}")
    public String port;

    @Value(value = "${spring.application.name}")
    public String springName;

    @GetMapping("/hello/{name}")
    @ApiOperation(value = "生产者user测试", notes = "provider-user生产者", httpMethod = "GET")
    public String hello(@PathVariable String name) {
        return springName + ":" + port + " || hello :" + name;
    }

}

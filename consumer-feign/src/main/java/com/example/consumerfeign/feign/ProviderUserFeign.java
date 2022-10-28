package com.example.consumerfeign.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Create by Administrator
 * Data 12:04 2021/12/16 星期四
 */
@FeignClient(value = "provider-user")
public interface ProviderUserFeign {

    @GetMapping("/hello/{name}")
    String hi(@PathVariable(name = "name") String name);

}

package com.example.consumerhystrix.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Create by Administrator
 * Data 20:52 2021/12/17 ζζδΊ
 */
@FeignClient(value = "provider-user")
public interface ProviderUserFeign {

    @GetMapping("/hello/{name}")
    String helloFeign(@PathVariable(value = "name") String name);

}

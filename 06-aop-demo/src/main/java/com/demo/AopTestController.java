package com.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aop")
public class AopTestController {
    @GetMapping("/hello")
    public String hello(){
        return "aop测试返回结果";
    }
}

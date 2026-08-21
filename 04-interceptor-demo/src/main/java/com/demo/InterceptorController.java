package com.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/interceptor")
public class InterceptorController {
    @GetMapping("/biz")
    public String biz(){
        return "业务接口，需要token";
    }
    @GetMapping("/public")
    public String pub(){
        return "公开接口，跳过拦截器";
    }
}

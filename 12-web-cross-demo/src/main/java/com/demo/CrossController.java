package com.demo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cross")
//@CrossOrigin //注解方式局部跨域
public class CrossController {
    @GetMapping("/test")
    public String test(){
        return "跨域测试接口";
    }
}

package com.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/env")
public class EnvController {
    @Value("${env.desc}")
    private String envDesc;

    @GetMapping("/show")
    public String show(){
        return "当前环境：" + envDesc;
    }
}

package com.dome;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exp")
public class ExceptionTestController {
    @GetMapping("/run")
    public String testRuntime(){
        throw new RuntimeException("业务运行异常，测试全局捕获");
    }

    @GetMapping("/npe")
    public String testNpe(){
        String s = null;
        s.length();
        return "ok";
    }
}

package com.demo;

import com.demo.config.AppConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/config")
public class YmlConfigController {
    @Value("${app.name}")
    private String appName;

    @Autowired
    private AppConfig appConfig;

    @GetMapping("/value")
    public String getByValue(){
        return "@Value读取：appName = " + appName;
    }

    @GetMapping("/prefix")
    public String getByPrefix(){
        return "@ConfigurationProperties：name=" + appConfig.getName()
                + " version=" + appConfig.getVersion()
                + " maxSize=" + appConfig.getMaxSize();
    }
}
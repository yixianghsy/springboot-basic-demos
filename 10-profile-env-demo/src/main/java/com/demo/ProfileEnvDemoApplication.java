package com.demo;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.env.PropertySource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProfileEnvDemoApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(ProfileEnvDemoApplication.class, args);
        MutablePropertySources sources = ctx.getEnvironment().getPropertySources();
        System.out.println("====打印所有已加载配置源====");
        for (PropertySource<?> ps : sources) {
            System.out.println(ps.getName());
        }
    }

}

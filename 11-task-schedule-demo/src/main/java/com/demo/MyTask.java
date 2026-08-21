package com.demo;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class MyTask {
    //每5秒执行一次
    @Scheduled(fixedRate = 5000)
    public void task1(){
        System.out.println("定时任务执行‑‑‑固定间隔5秒");
    }
    //cron表达式，每10秒
    @Scheduled(cron = "*/10 * * * * ?")
    public void task2(){
        System.out.println("cron定时任务‑‑‑每10秒");
    }
}

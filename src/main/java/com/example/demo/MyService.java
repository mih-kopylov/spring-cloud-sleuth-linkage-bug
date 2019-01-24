package com.example.demo;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class MyService {
    @Scheduled(fixedRate = 1000)
    public void doSomething() {
        System.out.println("doSomething");
    }
}

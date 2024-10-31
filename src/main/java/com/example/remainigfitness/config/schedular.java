package com.example.remainigfitness.config;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class schedular {

    @Scheduled(fixedDelay = 60000)  // Runs every 1 minute (60,000ms)
    public void keepServerActive() {
        System.out.println("Server is active at: " + java.time.LocalDateTime.now());
    }
}

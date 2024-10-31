package com.example.remainigfitness;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class RemainigFitnessApplication {

    public static void main(String[] args) {
        SpringApplication.run(RemainigFitnessApplication.class, args);
    }

}

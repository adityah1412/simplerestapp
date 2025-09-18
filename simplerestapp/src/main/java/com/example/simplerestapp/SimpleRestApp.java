package com.example.simplerestapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class SimpleRestApp {

    public static void main(String[] args) {
        SpringApplication.run(SimpleRestApp.class, args);
    }

    @GetMapping("/hello")
    public String hello() throws InterruptedException {
        Thread.sleep(1000); // Sleep for 1 second
        return "Hello, world!";
    }
}

package org.crazyit.boot.c3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class LogApp {
    
    public static void main(String[] args) {
        SpringApplication.run(LogApp.class, args);
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

}

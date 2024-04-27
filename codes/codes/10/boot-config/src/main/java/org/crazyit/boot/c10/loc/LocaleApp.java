package org.crazyit.boot.c10.loc;

import java.util.Locale;

import org.crazyit.boot.c10.config.ThyApp;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class LocaleApp {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        SpringApplication.run(LocaleApp.class, args);
    }

    @GetMapping("/test")
    public String test() {
        return "locale";
    }
}

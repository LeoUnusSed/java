package org.crazyit.boot.c10.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.thymeleaf.TemplateEngine;

@SpringBootApplication
@Controller
public class BeanApp {

    public static void main(String[] args) {
        SpringApplication.run(BeanApp.class, args);
    }
    
    @GetMapping("/common/{name}")
    public String head(@PathVariable String name) {
        // 根据路径参数来决定返回 head 还是 foot
        return name;
    }
}
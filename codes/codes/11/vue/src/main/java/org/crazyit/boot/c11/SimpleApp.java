package org.crazyit.boot.c11;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class SimpleApp {

    public static void main(String[] args) {
        SpringApplication.run(SimpleApp.class, args);
    }

    @GetMapping("/simple")
    public String simple() {
        return "simple";
    }

    @GetMapping("/direct")
    public String direct() {
        return "direct";
    }
    
    @GetMapping("/each")
    public String each() {
        return "each";
    }
    
    @GetMapping("/tpl")
    public String tpl() {
        return "tpl";
    }
    
    @GetMapping("/form")
    public String form() {
        return "form";
    }
    
    @GetMapping("/cpn")
    public String cpn(Model model) {
        model.addAttribute("school", "中山大学");
        return "cpn";
    }
}
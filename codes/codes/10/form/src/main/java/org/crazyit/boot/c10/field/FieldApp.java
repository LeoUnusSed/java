package org.crazyit.boot.c10.field;

import java.util.ArrayList;
import java.util.List;

import org.crazyit.boot.c10.config.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class FieldApp {

    public static void main(String[] args) {
        SpringApplication.run(FieldApp.class, args);
    }
    
    @GetMapping("/field")
    public String field(Model model) {
        // 设置用户对象
        model.addAttribute("user", new User("crazyit", "lady"));
        // 设置性别常量，集合中存放字符串
        List<String> sexCons = new ArrayList<String>();
        sexCons.add("man");
        sexCons.add("lady");
        model.addAttribute("sexCons", sexCons);
        return "field";
    }
}
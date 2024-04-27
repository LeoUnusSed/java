package org.crazyit.boot.c10.conver;

import java.math.BigDecimal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class ConverApp {

    public static void main(String[] args) {
        SpringApplication.run(ConverApp.class, args);
    }

    @GetMapping("/conver")
    public String test(Model model) {
        // 设置参数让模板显示
        model.addAttribute("money",
                new BigDecimal(100.99).setScale(2, BigDecimal.ROUND_HALF_UP));
        return "conver";
    }

}

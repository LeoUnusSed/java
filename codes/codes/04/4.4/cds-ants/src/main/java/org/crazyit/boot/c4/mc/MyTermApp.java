package org.crazyit.boot.c4.mc;

import java.util.Map;

import org.crazyit.boot.c4.oc.MyBean;
import org.crazyit.boot.c4.oc.OnClassApp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MyTermApp {

    public static void main(String[] args) {
        SpringApplication.run(MyTermApp.class, args);
    }

    @Autowired
    ApplicationContext ctx;

    @RequestMapping("/bean")
    public String getBean() {
        Map<String, MyBean> beans = ctx.getBeansOfType(MyBean.class);
        System.out.println(beans.size());
        return "success";
    }
}

package org.crazyit.boot.c4.mi;

import org.crazyit.boot.c4.primary.PrimaryApp;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class MiApp {

    public static void main(String[] args) {
        SpringApplication.run(MiApp.class, args);
    }

    @Bean
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public MiBeanA bean1() {
        return new MiBeanA();
    }
}

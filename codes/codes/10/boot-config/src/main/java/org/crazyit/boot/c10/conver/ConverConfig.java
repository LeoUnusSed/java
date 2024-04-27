package org.crazyit.boot.c10.conver;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConverConfig {

    @Bean
    public BigDecimalFormatter bigDecimalFormatte() {
        return new BigDecimalFormatter();
    }
}

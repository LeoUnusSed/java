package org.crazyit.boot.c10.simple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

@Configuration
public class MyConfig {
    
    @Autowired
    private  MessageSource messageSource;

    @Bean
    public LocalValidatorFactoryBean validator() {  
        LocalValidatorFactoryBean validator = new LocalValidatorFactoryBean();
        // 使用系统默认的 messages.properties 文件
        validator.setValidationMessageSource(messageSource);  
        return validator;
    }
}

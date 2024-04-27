package org.crazyit.boot.c7;

import java.util.Date;

import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.thymeleaf.standard.StandardDialect;
import org.thymeleaf.standard.expression.IStandardConversionService;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

public class ConverTest {

    public static void main(String[] args) {
        TemplateEngine templateEngine = new TemplateEngine();
        templateEngine.setTemplateResolver(new ClassLoaderTemplateResolver());
        Context ctx = new Context();
        ctx.setVariable("user", new User("Angus", 33));
        String result = templateEngine.process("conver.html", ctx);
        System.out.println(result);
    }

}

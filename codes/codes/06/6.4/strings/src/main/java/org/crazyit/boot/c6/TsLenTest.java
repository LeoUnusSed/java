package org.crazyit.boot.c6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

public class TsLenTest {

    public static void main(String[] args) {
        TemplateEngine templateEngine = new TemplateEngine();
        templateEngine.setTemplateResolver(new ClassLoaderTemplateResolver());
        Context ctx = new Context();
        ctx.setVariable("user", new User(1, "Angus"));
        // 测试List
        List datas = Arrays.asList(new String[]{"a", "abc", "abcd"});
        ctx.setVariable("datas", datas);        
        String result = templateEngine.process("tslen.html", ctx);
        System.out.println(result);
    }
}

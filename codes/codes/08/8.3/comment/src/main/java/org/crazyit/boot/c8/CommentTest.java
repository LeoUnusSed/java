package org.crazyit.boot.c8;

import java.util.ArrayList;
import java.util.List;

import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

public class CommentTest {

    public static void main(String[] args) {
        TemplateEngine templateEngine = new TemplateEngine();
        templateEngine.setTemplateResolver(new ClassLoaderTemplateResolver());
        Context ctx = new Context();
        List<User> users = new ArrayList<User>();
        users.add(new User(1, "UserA"));
        users.add(new User(2, "UserB"));
        ctx.setVariable("users", users);        
        String result = templateEngine.process("comment.html", ctx);
        System.out.println(result);
    }
}

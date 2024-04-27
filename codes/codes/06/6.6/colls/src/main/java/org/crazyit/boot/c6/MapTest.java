package org.crazyit.boot.c6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

public class MapTest {

    public static void main(String[] args) {
        TemplateEngine templateEngine = new TemplateEngine();
        templateEngine.setTemplateResolver(new ClassLoaderTemplateResolver());
        Context ctx = new Context();
        
        Map<String, String> map = new HashMap<String, String>();
        map.put("a", "a");
        map.put("b", "b");
        map.put("c", "c");
        ctx.setVariable("map", map);
        
        List<String> keys = new ArrayList<String>();
        keys.add("a");
        keys.add("d");
        ctx.setVariable("keys", keys);
        
        String result = templateEngine.process("map.html", ctx);
        System.out.println(result);
    }

}

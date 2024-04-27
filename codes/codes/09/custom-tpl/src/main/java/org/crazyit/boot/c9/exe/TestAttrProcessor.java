package org.crazyit.boot.c9.exe;

import java.util.Map;

import org.thymeleaf.context.ITemplateContext;
import org.thymeleaf.model.IText;
import org.thymeleaf.processor.text.ITextProcessor;
import org.thymeleaf.processor.text.ITextStructureHandler;
import org.thymeleaf.templatemode.TemplateMode;

public class TestAttrProcessor implements ITextProcessor {

    public TemplateMode getTemplateMode() {
        return TemplateMode.HTML;
    }

    public int getPrecedence() {
        return 10;
    }

    public void process(ITemplateContext context, IText text,
            ITextStructureHandler structureHandler) {
        System.out.println("===== 读取执行属性 =====");
        Map<String,Object> attrs = context.getConfiguration().getExecutionAttributes();
        for(String key : attrs.keySet()) {
            System.out.println(key + "---" + attrs.get(key));
        }
    }
}

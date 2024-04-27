package org.crazyit.boot.c9.exe.post;

import java.util.Map;

import org.thymeleaf.engine.AbstractTemplateHandler;
import org.thymeleaf.model.ICloseElementTag;
import org.thymeleaf.model.IOpenElementTag;
import org.thymeleaf.model.ITemplateEnd;
import org.thymeleaf.model.ITemplateStart;
import org.thymeleaf.model.IText;

public class PostHandler extends AbstractTemplateHandler {

    @Override
    public void handleText(IText text) {
        System.out.println("===== Post =====");
        Map<String,Object> attrs = getContext().getConfiguration().getExecutionAttributes();
        for(String key : attrs.keySet()) {
            System.out.println(key + "---" + attrs.get(key));
        }
        // 让责任链中的下一任处理者去执行
        super.handleText(text);
    }
}

package org.crazyit.boot.c9.post;

import java.util.HashSet;
import java.util.Set;

import org.crazyit.boot.c9.post.process.MyPostProcessor;
import org.thymeleaf.dialect.IPostProcessorDialect;
import org.thymeleaf.postprocessor.IPostProcessor;

public class MyPostDialect implements IPostProcessorDialect {

    public String getName() {
        // TODO Auto-generated method stub
        return null;
    }

    public int getDialectPostProcessorPrecedence() {
        // TODO Auto-generated method stub
        return 0;
    }

    public Set<IPostProcessor> getPostProcessors() {
        // 添加两个预处理器
        Set<IPostProcessor> ps = new HashSet<IPostProcessor>();
        ps.add(new MyPostProcessor());
        return ps;
    }

}

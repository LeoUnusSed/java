package org.crazyit.boot.c9.exe.pre;

import java.util.HashSet;
import java.util.Set;

import org.thymeleaf.dialect.IPreProcessorDialect;
import org.thymeleaf.preprocessor.IPreProcessor;

public class MyPreDialect implements IPreProcessorDialect {

    public String getName() {
        return "Pre Dialect";
    }

    public int getDialectPreProcessorPrecedence() {
        return 0;
    }

    public Set<IPreProcessor> getPreProcessors() {
        // 添加两个预处理器
        Set<IPreProcessor> ps = new HashSet<IPreProcessor>();
        ps.add(new PreProcessor());
        return ps;
    }
}

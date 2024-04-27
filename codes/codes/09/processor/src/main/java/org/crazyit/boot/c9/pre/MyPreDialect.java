package org.crazyit.boot.c9.pre;

import java.util.HashSet;
import java.util.Set;

import org.crazyit.boot.c9.pre.processor.PreProcessorA;
import org.crazyit.boot.c9.pre.processor.PreProcessorB;
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
        ps.add(new PreProcessorA());
        ps.add(new PreProcessorB());
        return ps;
    }
}

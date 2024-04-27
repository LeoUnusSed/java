package org.crazyit.boot.c10.dialect;

import java.util.HashSet;
import java.util.Set;

import org.thymeleaf.dialect.IProcessorDialect;
import org.thymeleaf.processor.IProcessor;

public class TagDialect implements IProcessorDialect {
    
    public String getName() {
        return "JSTL";
    }

    public String getPrefix() {
        return null;
    }

    public int getDialectProcessorPrecedence() {
        return 0;
    }

    public Set<IProcessor> getProcessors(String dialectPrefix) {
        Set<IProcessor> ps = new HashSet<IProcessor>();
        ps.add(new MyTagProcessor());
        return ps;
    }
}

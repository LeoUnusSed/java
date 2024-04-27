package org.crazyit.boot.c9.ele;

import java.util.HashSet;
import java.util.Set;

import org.thymeleaf.dialect.IProcessorDialect;
import org.thymeleaf.processor.IProcessor;

public class MyTagDialect implements IProcessorDialect {

    public String getName() {
        return null;
    }

    /**
     * 指定方言前缀，类似于 th:
     */
    public String getPrefix() {
        return "crazy";
    }

    public int getDialectProcessorPrecedence() {
        return 0;
    }

    public Set<IProcessor> getProcessors(String dialectPrefix) {
        Set<IProcessor> ps = new HashSet<IProcessor>();
//        ps.add(new MyModelProcessor());
        ps.add(new MyTagProcessor());
        return ps;
    }

}

package org.crazyit.boot.c9.bondary;

import java.util.HashSet;
import java.util.Set;

import org.thymeleaf.dialect.IProcessorDialect;
import org.thymeleaf.processor.IProcessor;

public class BondaryDialect implements IProcessorDialect {

    public String getName() {
        return "Crazy Dialect";
    }

    public String getPrefix() {
        return "crazy";
    }

    public int getDialectProcessorPrecedence() {
        return 0;
    }

    public Set<IProcessor> getProcessors(String dialectPrefix) {
        Set<IProcessor> ps = new HashSet<IProcessor>();
        ps.add(new MyBoundariesProcessor());
        return ps;
    }

}

package org.crazyit.boot.c9.exe;

import java.util.HashMap;
import java.util.Map;

import org.thymeleaf.dialect.IExecutionAttributeDialect;

public class MyExeAttrDialect implements IExecutionAttributeDialect {

    public String getName() {
        return "myUtil";
    }

    public Map<String, Object> getExecutionAttributes() {
        Map<String, Object> attrs = new HashMap<String, Object>();
        attrs.put("admin", "Angus");
        return attrs;
    }
}

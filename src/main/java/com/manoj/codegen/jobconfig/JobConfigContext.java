package com.manoj.codegen.jobconfig;

import com.manoj.codegen.jobconfig.parser.GsonJobConfigParser;
import lombok.NonNull;
import lombok.experimental.UtilityClass;

import java.util.HashMap;
import java.util.Map;

@UtilityClass
public class JobConfigContext {

    private static final Map<String, Object> OBJECT_FACTORY = new HashMap<>();

    static {
        OBJECT_FACTORY.put("jobConfigParser", new GsonJobConfigParser());
    }

    public <T> T getBean(@NonNull String beanName) {
        return (T) OBJECT_FACTORY.get(beanName);
    }
}

package com.manoj.codegen.gen;

import com.manoj.codegen.gen.services.Spark_Java_1_8_Scala_2_11_8_Spark_2_3_8;
import lombok.NonNull;
import lombok.experimental.UtilityClass;

import java.util.HashMap;
import java.util.Map;

@UtilityClass
public class CodeGenContext {

    private static final Map<String, Object> OBJECT_FACTORY = new HashMap<>();

    static {
        OBJECT_FACTORY.put("projectSetup", new Spark_Java_1_8_Scala_2_11_8_Spark_2_3_8());
    }

    public <T> T getBean(@NonNull String beanName) {
        return (T) OBJECT_FACTORY.get(beanName);
    }
}

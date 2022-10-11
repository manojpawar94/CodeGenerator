package com.manoj.codegen.gen.constants;

import lombok.Getter;
import lombok.experimental.UtilityClass;


@UtilityClass
public class CodeConstant {

    @Getter
    private static final String projectResourcePath = "/src/main/resources";
    @Getter
    private static String projectJavaPath = "/src/main/java";
}

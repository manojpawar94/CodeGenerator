package com.manoj.codegen.gen.services;

import com.manoj.codegen.beans.Status;
import com.manoj.codegen.gen.beans.Setup;
import com.manoj.codegen.gen.constants.ProjectVersion;
import com.manoj.codegen.utils.ResourceExtractor;
import lombok.NonNull;

import java.io.IOException;
import java.net.URISyntaxException;

public class Spark_Java_1_8_Scala_2_11_8_Spark_2_3_8 implements ProjectSetup {

    private static final String PROJECT_RESOURCES = "classpath:/spark_java1.8_scala2.11.8_spark2.3.8";

    @Override
    public Setup setupProject(@NonNull ProjectVersion projectVersion, @NonNull String basePath) {

        try {
            ResourceExtractor.extract(PROJECT_RESOURCES, basePath);
            return Setup.builder()
                    .basePath(basePath)
                    .status(Status.builder()
                            .status(true)
                            .message("Project is created successfully!")
                            .build())
                    .build();
        } catch (URISyntaxException | IOException e) {
            return Setup.builder()
                    .basePath(basePath)
                    .status(Status.builder()
                            .message("Failed to create Project!")
                            .error(e)
                            .build())
                    .build();
        }
    }


}

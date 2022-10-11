package com.manoj;

import com.manoj.codegen.gen.CodeGenContext;
import com.manoj.codegen.gen.constants.ProjectVersion;
import com.manoj.codegen.gen.services.ProjectSetup;
import com.manoj.codegen.jobconfig.JobConfigContext;
import com.manoj.codegen.jobconfig.parser.JobConfigParser;
import lombok.extern.java.Log;

/**
 * Hello world!
 */
@Log
public class App {
    public static void main(String[] args) {
        log.info("Hello");
        JobConfigParser parser = JobConfigContext.getBean("jobConfigParser");

        var jobConfig = parser.parse("/Users/manojpawar/EclipseWorkspace/CodeGenerator/src/main/resources/job_config_01.json");
        log.info(jobConfig.toString());

        ProjectSetup projectSetup = CodeGenContext.getBean("projectSetup");

        var status = projectSetup.setupProject(ProjectVersion.SPARK_JAVA_1_8_SCALA_2_11_8_SPARK_2_3_8, "/Users/manojpawar/EclipseWorkspace");

        log.info(status.toString());
    }
}

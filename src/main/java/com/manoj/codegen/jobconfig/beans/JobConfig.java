package com.manoj.codegen.jobconfig.beans;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class JobConfig {
    private String name;
    private String description;
    private String groupId;
    private String artifactId;
    private String version;
    private JobDef jobDefinition;
    private String javaVersion;
    private String scalaVersion;
    private String scalaCompatVersion;
    private String sparkVersion;
}

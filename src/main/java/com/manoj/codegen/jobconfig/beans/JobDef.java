package com.manoj.codegen.jobconfig.beans;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class JobDef {
    private DataSourceDef source;
    private DataSourceDef destination;
    private String delimiter;
    private XmlNode jobSchema;
}

package com.manoj.codegen.jobconfig.beans;

import com.manoj.codegen.jobconfig.beans.CsvDef;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class XmlAttribute {
    private String name;
    private String defaultValue;
    private CsvDef csv;
}

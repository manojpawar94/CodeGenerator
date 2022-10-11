package com.manoj.codegen.jobconfig.beans;

import com.manoj.codegen.jobconfig.constants.FileType;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DataSourceDef {
    private String path;
    private FileType fileType;
    private String filePattern;
}

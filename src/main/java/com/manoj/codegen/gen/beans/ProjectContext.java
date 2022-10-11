package com.manoj.codegen.gen.beans;

import com.manoj.codegen.gen.constants.CodeConstant;
import com.manoj.codegen.jobconfig.beans.JobConfig;
import lombok.Builder;
import lombok.Data;
import org.apache.commons.io.FilenameUtils;

@Data
@Builder
public class ProjectContext {
    private String projectBasePath;
    private JobConfig jobConfig;


    public String getProjectBasePackagePath() {
        return FilenameUtils.concat(getProjectBasePath(), CodeConstant.getProjectJavaPath());
    }

    public String getProjectResourcePath() {
        return FilenameUtils.concat(getProjectBasePath(), CodeConstant.getProjectJavaPath());
    }
}

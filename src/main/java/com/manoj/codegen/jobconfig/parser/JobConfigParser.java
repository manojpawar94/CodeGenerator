package com.manoj.codegen.jobconfig.parser;

import com.manoj.codegen.jobconfig.beans.JobConfig;
import lombok.NonNull;

public interface JobConfigParser {
    JobConfig parse(@NonNull String configPath);
}

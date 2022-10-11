package com.manoj.codegen.jobconfig.parser;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.manoj.codegen.jobconfig.beans.JobConfig;
import lombok.NonNull;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class GsonJobConfigParser implements JobConfigParser {

    private static final Gson GSON = new GsonBuilder().serializeNulls().setLenient().create();

    @Override
    public JobConfig parse(@NonNull String configPath) {
        try {
            var jobContext = Files.readString(Path.of(configPath));
            return GSON.fromJson(jobContext, JobConfig.class);
        } catch (IOException e) {
            throw new JobConfigParserException(e);
        }
    }
}

package com.manoj.codegen.jobconfig.parser;

import java.io.IOException;

public class JobConfigParserException extends RuntimeException {
    public JobConfigParserException(IOException e) {
        super(e);
    }
}

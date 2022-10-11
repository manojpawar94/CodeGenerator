package com.manoj.codegen.gen.beans;

import com.manoj.codegen.beans.Status;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Setup {
    private String basePath;
    private Status status;
}

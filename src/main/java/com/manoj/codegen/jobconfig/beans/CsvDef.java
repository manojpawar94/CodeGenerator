package com.manoj.codegen.jobconfig.beans;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CsvDef {
    @Builder.Default
    private int fieldIndex = -1;
    @Builder.Default
    private int subFieldIndex = -1;
    private String delimiter;
}

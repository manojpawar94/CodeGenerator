package com.manoj.codegen.beans;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Status {
    private boolean status;
    private String message;
    private Throwable error;
}

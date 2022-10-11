package com.manoj.codegen.jobconfig.beans;

import com.manoj.codegen.jobconfig.constants.XmlNodeType;
import lombok.Builder;
import lombok.Data;
import lombok.Singular;

import java.util.List;

@Data
@Builder
public class XmlNode {
    private String name;
    private String description;
    private XmlNodeType type;
    @Singular
    private List<XmlAttribute> attributes;
    private CsvDef csv;
    @Singular
    private List<XmlNode> nodes;
}

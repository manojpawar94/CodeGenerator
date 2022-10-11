package com.manoj.codegen.jobconfig.constants;

import com.google.gson.annotations.SerializedName;

public enum XmlNodeType {
    @SerializedName("RootNode") ROOT_NODE,
    @SerializedName("Node") NODE,
    @SerializedName("MultiNode") MULTI_NODE,
    @SerializedName("Element") ELEMENT
}

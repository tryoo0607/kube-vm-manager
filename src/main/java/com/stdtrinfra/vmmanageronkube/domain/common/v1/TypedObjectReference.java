package com.stdtrinfra.vmmanageronkube.domain.common.v1;

import io.swagger.v3.oas.annotations.Parameter;

public class TypedObjectReference {

    private String apiGroup;

    @Parameter(required = true)
    private String kind;

    @Parameter(required = true)
    private String name;

    private String namespace;
}

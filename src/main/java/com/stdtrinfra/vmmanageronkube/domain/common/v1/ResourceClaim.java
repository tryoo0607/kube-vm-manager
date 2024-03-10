package com.stdtrinfra.vmmanageronkube.domain.common.v1;

import io.swagger.v3.oas.annotations.Parameter;

public class ResourceClaim {

    @Parameter(required = true)
    private String name;
}

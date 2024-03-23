package com.stdtrinfra.vmmanageronkube.domain.vm.v1;

import io.swagger.v3.oas.annotations.Parameter;

public class CustomBlockSize {

    @Parameter(required = true)
    private int logical;

    @Parameter(required = true)
    private int physical;
}

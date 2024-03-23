package com.stdtrinfra.vmmanageronkube.domain.vm.v1;

import io.swagger.v3.oas.annotations.Parameter;

public class DHCPPrivateOptions {

    @Parameter(required = true)
    private int option;

    @Parameter(required = true)
    private String value;
}

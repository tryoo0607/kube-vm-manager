package com.stdtrinfra.vmmanageronkube.domain.vm.v1;

import io.swagger.v3.oas.annotations.Parameter;

public class Input {

    private String bus;

    @Parameter(required = true)
    private String name;

    @Parameter(required = true)
    private String type;
}

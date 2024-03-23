package com.stdtrinfra.vmmanageronkube.domain.vm.v1;

import io.swagger.v3.oas.annotations.Parameter;

public class Port {

    private String name;

    @Parameter(required = true)
    private int port;

    private String protocol;
}

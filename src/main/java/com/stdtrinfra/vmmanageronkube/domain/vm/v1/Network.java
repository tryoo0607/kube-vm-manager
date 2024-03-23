package com.stdtrinfra.vmmanageronkube.domain.vm.v1;

import io.swagger.v3.oas.annotations.Parameter;

public class Network {

    private MultusNetwork multus;

    @Parameter(required = true)
    private String name;

    private PodNetwork pod;
}

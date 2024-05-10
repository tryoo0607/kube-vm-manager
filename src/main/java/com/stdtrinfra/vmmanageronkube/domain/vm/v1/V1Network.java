package com.stdtrinfra.vmmanageronkube.domain.vm.v1;

import io.swagger.v3.oas.annotations.Parameter;

public class V1Network {

    @Parameter(required = true)
    private String name;

    private V1PodNetwork pod;


    private V1Network() {

        this.name = "";
    }
}

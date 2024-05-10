package com.stdtrinfra.vmmanageronkube.domain.vm.v1;

import io.swagger.v3.oas.annotations.Parameter;

import java.util.List;

public class V1Interface {

    private V1InterfaceMasquerade masquerade;

    @Parameter(required = true)
    private String name;

    private V1Interface() {

        this.name = "";
    }
}

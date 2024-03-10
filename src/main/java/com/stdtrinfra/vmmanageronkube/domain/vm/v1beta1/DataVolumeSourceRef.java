package com.stdtrinfra.vmmanageronkube.domain.vm.v1beta1;

import io.swagger.v3.oas.annotations.Parameter;

public class DataVolumeSourceRef {

    @Parameter(required = true)
    private String kind;

    @Parameter(required = true)
    private String name;

    private String namespace;
}

package com.stdtrinfra.vmmanageronkube.domain.vm.v1beta1;

import io.swagger.v3.oas.annotations.Parameter;

public class DataVolumeSourcePVC {

    @Parameter(required = true)
    private String name;

    @Parameter(required = true)
    private String namespace;
}

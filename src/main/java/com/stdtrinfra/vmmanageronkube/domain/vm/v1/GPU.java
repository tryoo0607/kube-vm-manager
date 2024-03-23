package com.stdtrinfra.vmmanageronkube.domain.vm.v1;

import io.swagger.v3.oas.annotations.Parameter;

public class GPU {

    @Parameter(required = true)
    private String deviceName;

    @Parameter(required = true)
    private String name;

    private String tag;

    private VGPUOptions virtualGPUOptions;
}

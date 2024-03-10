package com.stdtrinfra.vmmanageronkube.domain.vm.v1beta1;

import io.swagger.v3.oas.annotations.Parameter;

public class DataVolumeCheckpoint {

    @Parameter(required = true)
    private String current;

    @Parameter(required = true)
    private String previous;
}

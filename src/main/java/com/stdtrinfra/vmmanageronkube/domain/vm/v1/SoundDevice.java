package com.stdtrinfra.vmmanageronkube.domain.vm.v1;

import io.swagger.v3.oas.annotations.Parameter;

public class SoundDevice {

    private String model;

    @Parameter(required = true)
    private String name;
}

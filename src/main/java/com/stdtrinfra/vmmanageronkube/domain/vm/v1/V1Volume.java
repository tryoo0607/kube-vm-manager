package com.stdtrinfra.vmmanageronkube.domain.vm.v1;

import io.swagger.v3.oas.annotations.Parameter;

public class V1Volume {

    @Parameter(required = true)
    private String name;

    private V1CloudInitNoCloudSource cloudInitNoCloud;

    private V1ContainerDiskSource containerDisk;

    private V1Volume() {

        this.name = "";
    }
}

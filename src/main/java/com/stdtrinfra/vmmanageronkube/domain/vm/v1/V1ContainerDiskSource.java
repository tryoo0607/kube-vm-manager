package com.stdtrinfra.vmmanageronkube.domain.vm.v1;

import io.swagger.v3.oas.annotations.Parameter;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class V1ContainerDiskSource {

    @Parameter(required = true)
    private String image;

    private V1ContainerDiskSource() {

        this.image = "";
    }
}

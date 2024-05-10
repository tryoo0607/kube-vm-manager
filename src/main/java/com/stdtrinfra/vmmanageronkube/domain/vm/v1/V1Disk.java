package com.stdtrinfra.vmmanageronkube.domain.vm.v1;

import io.swagger.v3.oas.annotations.Parameter;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class V1Disk {

    private V1DiskTarget disk;

    @Parameter(required = true)
    private String name;

    private V1Disk() {

        this.name = "";
    }
}

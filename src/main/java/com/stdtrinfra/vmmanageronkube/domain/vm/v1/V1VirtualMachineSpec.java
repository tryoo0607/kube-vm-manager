package com.stdtrinfra.vmmanageronkube.domain.vm.v1;

import io.swagger.v3.oas.annotations.Parameter;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class V1VirtualMachineSpec {

    private boolean running;

    @Parameter(required = true)
    private V1VirtualMachineInstanceTemplateSpec template;
}

package com.stdtrinfra.vmmanageronkube.domain.vm.v1;

import io.swagger.v3.oas.annotations.Parameter;

public class V1VirtualMachineCondition {

    private String message;

    private String reason;

    @Parameter(required = true)
    private String status;

    @Parameter(required = true)
    private String type;

    public V1VirtualMachineCondition() {

        this.status = "";

        this.type = "";
    }
}

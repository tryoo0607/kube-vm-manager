package com.stdtrinfra.vmmanageronkube.domain.vm.v1;

import com.stdtrinfra.vmmanageronkube.domain.common.v1.V1Time;
import io.swagger.v3.oas.annotations.Parameter;

public class V1VirtualMachineMemoryDumpRequest {

    @Parameter(required = true)
    private String claimName;

    private V1Time endTimestamp;

    private String fileName;

    private String message;

    @Parameter(required = true)
    private String phase;

    private boolean remove;

    private V1Time startTimestamp;

    private V1VirtualMachineMemoryDumpRequest() {

        this.claimName = "";
        this.phase = "";
    }
}

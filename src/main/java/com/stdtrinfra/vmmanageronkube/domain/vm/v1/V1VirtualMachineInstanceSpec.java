package com.stdtrinfra.vmmanageronkube.domain.vm.v1;


import io.swagger.v3.oas.annotations.Parameter;

import java.util.List;
import java.util.Map;

public class V1VirtualMachineInstanceSpec {

    @Parameter(required = true)
    private V1DomainSpec domain;

    private List<V1Network> networks;

    private List<V1Volume> volumes;
}

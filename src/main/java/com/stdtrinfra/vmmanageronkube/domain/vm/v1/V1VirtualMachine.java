package com.stdtrinfra.vmmanageronkube.domain.vm.v1;

import com.stdtrinfra.vmmanageronkube.domain.common.v1.V1ObjectMeta;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class V1VirtualMachine {

    private String apiVersion;

    private String kind;

    private V1ObjectMeta metadata;

    private V1VirtualMachineSpec spec;

    private V1VirtualMachineStatus status;
}

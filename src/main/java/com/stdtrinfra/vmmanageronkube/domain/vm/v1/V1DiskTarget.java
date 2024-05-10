package com.stdtrinfra.vmmanageronkube.domain.vm.v1;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class V1DiskTarget {

    private String bus;

    private String pciAddress;

    private boolean readonly;
}

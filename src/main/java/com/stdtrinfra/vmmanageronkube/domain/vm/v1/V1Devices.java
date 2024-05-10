package com.stdtrinfra.vmmanageronkube.domain.vm.v1;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class V1Devices {

    private List<V1Disk> disks;

    private List<V1Interface> interfaces;
}

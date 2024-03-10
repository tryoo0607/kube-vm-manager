package com.stdtrinfra.vmmanageronkube.adapter.out.client.kubeClient.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class VirtualMachineStatus {

    private List<VirtualMachineCondition> conditions;

    private boolean created;

    private Long desiredGeneration;

//    private VirtualMachineMemoryDumpRequest memoryDumpRequest;

    private String observedGeneration;

    private String printableStatus;

    private boolean ready;

    private String restoreInProgress;

    private String snapshotInProgress;


}

package com.stdtrinfra.vmmanageronkube.domain.vm.v1;

import java.util.List;

public class V1VirtualMachineStatus {

    private List<V1VirtualMachineCondition> conditions;

    private boolean created;

    private Long desiredGeneration;

    private V1VirtualMachineMemoryDumpRequest memoryDumpRequest;

    private String observedGeneration;

    private String printableStatus;

    private boolean ready;

    private String restoreInProgress;

    private String snapshotInProgress;
}

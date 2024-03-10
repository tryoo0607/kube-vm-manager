package com.stdtrinfra.vmmanageronkube.domain.vm;

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

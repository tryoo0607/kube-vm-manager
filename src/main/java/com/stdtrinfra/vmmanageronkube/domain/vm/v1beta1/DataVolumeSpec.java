package com.stdtrinfra.vmmanageronkube.domain.vm.v1beta1;

import com.stdtrinfra.vmmanageronkube.domain.common.v1.PersistentVolumeClaimSpec;

import java.util.List;

public class DataVolumeSpec {

    private List<DataVolumeCheckpoint> checkpoints;

    private String contentType;

    private boolean finalCheckpoint;

    private boolean preallocation;

    private String priorityClassName;

    private PersistentVolumeClaimSpec pvc;

    private DataVolumeSource source;

    private DataVolumeSourceRef sourceRef;

    private StorageSpec storageSpec;
}

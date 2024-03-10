package com.stdtrinfra.vmmanageronkube.domain.vm;

import com.stdtrinfra.vmmanageronkube.domain.common.PersistentVolumeClaimSpec;

import java.util.List;

public class DataVolumeSpec {

    private List<DataVolumeCheckpoint> checkpoints;

    private String contentType;

    private boolean preallocation;

    private String priorityClassName;

    private PersistentVolumeClaimSpec pvc;

    private DataVolumeSource source;

    private DataVolumeSourceRef sourceRef;

    private StorageSpec storageSpec;
}

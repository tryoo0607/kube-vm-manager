package com.stdtrinfra.vmmanageronkube.domain.common.v1;

import com.stdtrinfra.vmmanageronkube.domain.common.*;

import java.util.List;

public class PersistentVolumeClaimSpec implements ClientResource {

    private List<String> accessModes;

    private TypedLocalObjectReference dataSource;

    private TypedObjectReference dataSourceRef;

    private ResourceRequirements resources;

    private LabelSelector selector;

    private String storageClassName;

    private VolumeModeEnum volumeModeEnum;

    private String volumeName;
}

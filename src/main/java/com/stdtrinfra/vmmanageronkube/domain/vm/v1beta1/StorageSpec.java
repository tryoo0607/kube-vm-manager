package com.stdtrinfra.vmmanageronkube.domain.vm.v1beta1;

import com.stdtrinfra.vmmanageronkube.domain.common.*;
import com.stdtrinfra.vmmanageronkube.domain.common.v1.LabelSelector;
import com.stdtrinfra.vmmanageronkube.domain.common.v1.ResourceRequirements;
import com.stdtrinfra.vmmanageronkube.domain.common.v1.TypedLocalObjectReference;
import com.stdtrinfra.vmmanageronkube.domain.common.v1.TypedObjectReference;

import java.util.List;

public class StorageSpec {

    private List<String> accessModes;
    private TypedLocalObjectReference dataSource;
    private TypedObjectReference dataSourceRef;
    private ResourceRequirements resources;
    private LabelSelector selector;
    private String storageClassName;
    private VolumeModeEnum volumeModeEnum;
    private String volumeName;
}

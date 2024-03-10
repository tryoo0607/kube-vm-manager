package com.stdtrinfra.vmmanageronkube.domain.vm.v1;

import com.stdtrinfra.vmmanageronkube.domain.common.KubeResource;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class VirtualMachineSpec implements KubeResource {

    private List<DataVolumeTemplateSpec> dataVolumeTemplates;
    private InstancetypeMatcher instancetype;
    private PreferenceMatcher preferenceMatcher;
    private String runStrategy;
    private boolean running;
    private VirtualMachineInstanceTemplateSpec template;

}

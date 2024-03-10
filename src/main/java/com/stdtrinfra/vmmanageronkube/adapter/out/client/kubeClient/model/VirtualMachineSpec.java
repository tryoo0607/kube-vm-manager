package com.stdtrinfra.vmmanageronkube.adapter.out.client.kubeClient.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class VirtualMachineSpec {
//    private List<DataVolumeTemplateSpec> dataVolumeTemplates;

//    private InstancetypeMatcher instancetype;
    private String runStrategy;
    private boolean running;

//    private LiveUpdateFeatures liveUpdateFeatures

//    private VirtualMachineInstanceTemplateSpec template;

}

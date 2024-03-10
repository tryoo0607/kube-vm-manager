package com.stdtrinfra.vmmanageronkube.adapter.out.client.kubeClient.model;


import io.fabric8.kubernetes.api.model.Namespaced;
import io.fabric8.kubernetes.client.CustomResource;
import io.fabric8.kubernetes.model.annotation.Group;
import io.fabric8.kubernetes.model.annotation.Version;

@Group("kubevirt.io")
@Version("v1")
public class VirtualMachine extends CustomResource<VirtualMachineSpec,VirtualMachineStatus> implements Namespaced {


}

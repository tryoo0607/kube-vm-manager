package com.stdtrinfra.vmmanageronkube.adapter.out.client.kubeClient;

import com.stdtrinfra.vmmanageronkube.adapter.out.client.kubeClient.model.VirtualMachine;
import com.stdtrinfra.vmmanageronkube.adapter.out.client.kubeClient.model.VirtualMachineSpec;
import com.stdtrinfra.vmmanageronkube.adapter.out.client.kubeClient.model.VirtualMachineStatus;
import com.stdtrinfra.vmmanageronkube.application.vm.dto.VmResource;
import com.stdtrinfra.vmmanageronkube.application.vm.out.VmResourcePort;
import io.fabric8.kubernetes.api.model.KubernetesResourceList;
import io.fabric8.kubernetes.client.KubernetesClient;
import io.fabric8.kubernetes.client.KubernetesClientBuilder;
import io.fabric8.kubernetes.client.dsl.MixedOperation;
import io.fabric8.kubernetes.client.dsl.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@Slf4j
@Service
public class KubeClientVmResourceService implements VmResourcePort {

    @Override
    public void createVm(VmResource vmResource) {
        try(KubernetesClient client = new KubernetesClientBuilder().build()) {
            MixedOperation<VirtualMachine, KubernetesResourceList<VirtualMachine>, Resource<VirtualMachine>> vmClient
                    = client.resources(VirtualMachine.class);

            vmClient.inNamespace("default").resource(createVirtualMachine(vmResource)).create();

        } catch(Exception e) {
            log.error(e.getMessage());
        }

    }

    private VirtualMachineSpec createVirtualMachineSpec() {
        return VirtualMachineSpec.builder()

                .build();
    }

    private VirtualMachineStatus createVirtualMachineStatus() {
        return VirtualMachineStatus.builder().

                build();
    }

    private VirtualMachine createVirtualMachine(VmResource vmResource) {
        VirtualMachine virtualMachine = new VirtualMachine();

        virtualMachine.setSpec(createVirtualMachineSpec(vmResource.getSpec()));
        virtualMachine.setStatus(createVirtualMachineStatus(vmResource.getStatus()));


        return virtualMachine;
    }


}

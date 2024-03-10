package com.stdtrinfra.vmmanageronkube.application.vm;

import com.stdtrinfra.vmmanageronkube.application.vm.dto.VmResource;
import com.stdtrinfra.vmmanageronkube.application.vm.out.VmResourcePort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
class VmResourceService {

    private final VmResourcePort vmResourcePort;

    @Autowired
    public VmResourceService(VmResourcePort vmResourcePort) {
        this.vmResourcePort = vmResourcePort;
    }

    public void createVm() {
        // set을 통해서 VmResource
        VmResource vm = new ;
        vmResourcePort.createVm(vm);
    }
}

package com.stdtrinfra.vmmanageronkube.application;

import com.stdtrinfra.vmmanageronkube.application.in.SandboxUseCase;
import com.stdtrinfra.vmmanageronkube.application.out.SandboxPort;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Slf4j
@Service
class SandboxService implements SandboxUseCase {

    private final SandboxPort sandboxPort;

    @Autowired
    SandboxService(SandboxPort sandboxPort) {
        this.sandboxPort = sandboxPort;
    }

    public String getNamespaceTest() {

        return sandboxPort.getNamespaceTest();

    }
}

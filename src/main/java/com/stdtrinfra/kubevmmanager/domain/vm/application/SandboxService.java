package com.stdtrinfra.kubevmmanager.domain.vm.application;

import com.stdtrinfra.kubevmmanager.domain.vm.application.in.SandboxUseCase;
import com.stdtrinfra.kubevmmanager.domain.vm.application.out.SandboxPort;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Slf4j
@Service
public class SandboxService implements SandboxUseCase {

    private final SandboxPort sandboxPort;

    @Autowired
    public SandboxService(SandboxPort sandboxPort) {
        this.sandboxPort = sandboxPort;
    }

    public String getNamespaceTest() {

        return sandboxPort.getNamespaceTest();

    }
}

package com.stdtrinfra.kubevmmanager.application.sandbox.service;

import com.stdtrinfra.kubevmmanager.domain.kubeclient.service.KubeClientService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Slf4j
@Service

public class SandboxService {

    @Autowired
    private KubeClientService kubeClientService;

    public String getNamespaceTest() {

        return kubeClientService.getNamespaceTest();

    }
}
